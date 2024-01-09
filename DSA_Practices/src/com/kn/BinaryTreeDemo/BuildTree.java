package com.kn.BinaryTreeDemo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {
	static int idx = -1;

	public Node buildTree(int[] nodes) {// PreOrder Tree
		idx++;
		if (nodes[idx] == -1) {
			return null;
		}
		Node newNode = new Node(nodes[idx]);
		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);

		return newNode;
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public void levelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();// FIFO
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node currNode = q.remove();
			if (currNode == null) {
				if (q.isEmpty()) {
					break;
				} else {
					System.out.println();
					q.add(null);
				}
			} else {
				System.out.print(currNode.data + " ");
				if (currNode.left != null) {
					q.add(currNode.left);
				}
				if (currNode.right != null) {
					q.add(currNode.right);
				}

			}

		}
	}

	public static int height(Node root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static int countNodes(Node root) {
		if (root == null)
			return 0;

		int leftCount = countNodes(root.left);
		int rightCount = countNodes(root.right);
		return leftCount + rightCount + 1;
	}

	public static int sumOfNodes(Node root) {
		if (root == null)
			return 0;
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		return leftSum + rightSum + root.data;
	}

	public int diameter(Node root) {// TDS Approach TC-(O(n^2)) which is inefficient
		if (root == null)
			return 0;
		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);
		int rightheight = height(root.right);
		int leftheight = height(root.left);
		int rootDiameter = rightheight + leftheight + 1;
		return Math.max(Math.max(rightDiameter, rootDiameter), rootDiameter);
	}

	public Info diameter2(Node root) {
		if (root == null) {
			return new Info(0, 0);
		}
		Info rightInfo = diameter2(root.right);
		Info leftInfo = diameter2(root.left);
		int leftHeight = leftInfo.height;
		int rightHeight = rightInfo.height;
		int leftDiameter = leftInfo.daimeter;
		int rightDiameter = rightInfo.daimeter;
		int rootDiameter = rightHeight + leftHeight + 1;
		return new Info(Math.max(Math.max(rightDiameter, leftDiameter), rootDiameter),
				Math.max(rightHeight, leftHeight) + 1);

//		int diameter = Math.max(Math.max(rightInfo.daimeter, leftInfo.daimeter),
//				rightInfo.height + leftInfo.height + 1);
//		int height = Math.max(rightInfo.height, leftInfo.height) + 1;
//		return new Info(diameter, height);
	}

	public boolean isSubTree(Node root, Node subroot) {
		if (root == null) {
			return false;
		}
		if (root.data == subroot.data) {
			if (isIdentical(root, subroot)) {
				return true;
			}
		}

		return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
	}

	public boolean isIdentical(Node node, Node subroot) {
		if (node == null && subroot == null) {
			return true;
		} else if (node == null || subroot == null || node.data != subroot.data) {
			return false;
		}

		if (!isIdentical(node.left, subroot.left)) {
			return false;
		}
		if (!isIdentical(node.right, subroot.right)) {
			return false;
		}
		return true;
	}

	public void topView(Node root) {
		Queue<Info2> q = new LinkedList<>();

		HashMap<Integer, Node> map = new HashMap<>();
		int min = 0;
		int max = 0;

		q.add(new Info2(root, 0));
		q.add(null);

		// level order
		while (!q.isEmpty()) {
			Info2 curr = q.remove();
			if (curr == null) {
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {

				if (!map.containsKey(curr.hd)) {// first time my hd is occuring
					map.put(curr.hd, curr.node);
				}

				if (curr.node.left != null) {
					q.add(new Info2(curr.node.left, curr.hd - 1));
					min = Math.min(min, curr.hd - 1);
				}

				if (curr.node.right != null) {
					q.add(new Info2(curr.node.right, curr.hd + 1));
					max = Math.max(max, curr.hd + 1);
				}
			}
		}

		for (int i = min; i <= max; i++) {
			System.out.print(map.get(i).data + " ");
		}
		System.out.println();
	}

}

class Info2 {
	Node node;
	int hd;

	public Info2(Node node, int hd) {
		super();
		this.node = node;
		this.hd = hd;
	}

}

class Info {
	int daimeter;
	int height;

	public Info(int daimeter, int height) {
		this.daimeter = daimeter;
		this.height = height;
	}

}
