package com.kn.BinaryTreeDemo;

public class BinaryTreeDemo {
	public static void main(String[] args) {
		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BuildTree tree = new BuildTree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		System.out.println("*********************************");
		System.out.println("Printing Tree By traversing PreOrder");
		tree.preOrder(root);
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Printing Tree By traversing InOrder");
		tree.inOrder(root);
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Printing Tree By traversing PostOrder");
		tree.postOrder(root);
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Printing Tree By Level Order");
		tree.levelOrder(root);
		System.out.println("*********************************");
		System.out.println("Height of the Tree = " + tree.height(root));
		System.out.println("Total Count of Nodes = "+ tree.countNodes(root));
		System.out.println("Sum of data of Nodes = "+ tree.sumOfNodes(root));
	}
}
