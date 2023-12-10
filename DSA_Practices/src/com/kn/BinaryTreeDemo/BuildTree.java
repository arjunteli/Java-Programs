package com.kn.BinaryTreeDemo;

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
}