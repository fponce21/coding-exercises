package com.ponce.trees;

public class Main {
	public static void main(String[] args) {
	    // Scanner scanner = new Scanner(System.in);
	    // BinaryTree tree = new BinaryTree();
	    // tree.populate(scanner);
	    // tree.prettyDisplay();

//	    BST tree = new BST();
//	    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//	    tree.populate(nums);
//	    tree.display();
	    
	    int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
	    SegmentTree segTree = new SegmentTree(arr);
	    // tree.display();

	    System.out.println(segTree.query(1, 6));
	  }
}
