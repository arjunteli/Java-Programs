package com.kn.BinaryTreeDemo;

public class BinaryTreeDemo {
	public static void main(String[] args) {
		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTreeFunctions tree = new BinaryTreeFunctions();
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
		System.out.println();
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
		root1.right.right = new Node(7);
		root1.right.left = new Node(6);
		
		Node subRoot = new Node(2);
		subRoot.left = new Node(4);
		subRoot.right = new Node(5);
		System.out.print("IS SUBTREE : ");
		System.out.println(tree.isSubTree(root1, subRoot));
		System.out.println("*********************************");
		tree.topView(root);
		System.out.println("*********************************");
		tree.KthLevel(root1, 1, 2);
		System.out.println();
		System.out.println("*********************************");
		Node lca = tree.lca(root, 4, 5);
		if (lca != null) {
			System.out.println(lca.data);
		}
		System.out.println("*********************************");
		System.out.println(tree.lca2(root, 4, 6).data);
		System.out.println("*********************************");
		System.out.println("Minimum Distance between Both Nodes = " + tree.minDistance(root, 4, 6));
		System.out.println("*********************************");
		tree.KAncestor(root, 4, 3);
		
		System.out.println("****************77******************");
		
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		root2.left.right = new Node(5);
		root2.right.left = new Node(6);
		root2.right.right = new Node(7);
		tree.levelOrder(root2);
		System.out.println();
		tree.transform(root2);
		tree.levelOrder(root2);
	}
}
