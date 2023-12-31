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
		System.out.println("Total Count of Nodes = " + tree.countNodes(root));
		System.out.println("Sum of data of Nodes = " + tree.sumOfNodes(root));

		System.out.println("*********************************");
		System.out.println(tree.diameter(root));
		System.out.println("Diameter of Tree = " + tree.diameter2(root).daimeter);
		
		System.out.println("*********************************");
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.right = new Node(6);
		
		Node subRoot = new Node(2);
		subRoot.left = new Node(4);
		subRoot.right= new Node(5);
		System.out.print("IS SUBTREE : ");
		System.out.println(tree.isSubTree(root1, subRoot));
		
	}
}
