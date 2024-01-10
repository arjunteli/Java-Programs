package com.kn.binarysearchtree;

public class BinarySearchTreeFunctions {

	public boolean search(Node root, int k) {
		if (root == null) {
			return false;
		}
		// kaam
		if (root.data == k) {
			return true;
		} else if (root.data < k) {
			return search(root.right, k);
		} else {
			return search(root.left, k);
		}
	}

	public Node insert(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (root.data > val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}

		return root;
	}

	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

}
