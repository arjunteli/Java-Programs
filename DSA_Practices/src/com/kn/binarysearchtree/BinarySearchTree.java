package com.kn.binarysearchtree;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTreeFunctions tree = new BinarySearchTreeFunctions();
//		Node root = new Node(4);
//		root.left=new Node(2);
//		root.right=new Node(5);
//		root.left.left=new Node(1);
//		root.left.right=new Node(3);
//		root.right.right=new Node(6);
//		System.out.println(tree.search(root, 9));
		Node root = null;
		int[] values = { 5, 1, 3, 4, 2, 7 };
		for (int i = 0; i < values.length; i++) {
			root=tree.insert(root, values[i]);
		}
		tree.inorder(root);
		System.out.println();
		if(tree.search(root, 5)) {
			System.out.println("FOUND");
		}else {
			System.out.println("NOT FOUND");
		}
		
	}

}
