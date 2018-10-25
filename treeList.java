package tree;

import java.util.ArrayList;

public class treeList {

	class treeNode {
		public treeNode left, right;
		public int data;
		public int duplicate;
	}
	
//	public static Integer[] list;
//	treeList(int num){
//		list = new Integer[num] ;
//	}
	
	public treeNode root;
	public static int count;

	public void init() {
		root = null;
	}

	// makeTreeNode()
	// setLeft
	// setRIght
	// inOrder
	// BuildbinaryTree
	// No. of compares (reading and writing the integer)

	public treeNode makeNode(int data) {
		treeNode curr = new treeNode();
		curr.data = data;
		curr.left = null;
		curr.right = null;
		curr.duplicate = 0;
		return curr;
	}

	public void setLeft(int data, treeNode curr) {
		if (curr.left != null)
			System.out.println("There is already a node there.");
		else
			curr.left = makeNode(data);
	}

	public void setRight(int data, treeNode curr) {
		if (curr.right != null)
			System.out.println("There is already a node there.");
		else
			curr.right = makeNode(data);
	}

	public int buildBinaryTree(Integer [] list) {
		int turn = 0;	// counts the size of non-null elements in the array
		
		while (list[turn]!=null) { // loops through the whole list of integers
			int num = list[turn];
			
			count++;
			if (root == null) {
				root = makeNode(num);
			} 
			else {
				treeNode current = root;
				boolean go = true;
				
				while (go) { // number is compared with single integer from existing tree
					
					count++;
					if (num < current.data) {
						count++;
						if (current.left != null)
							current = current.left;
						else {
							setLeft(num, current);
							go = false;

						}
					} else if (num > current.data) {
						count++;
						if (current.right != null)
							current = current.right;
						else {
							setRight(num, current);
							go = false;

						}

					} else { // num == current.data
						count++;
						current.duplicate = current.duplicate++;
						go = false;
					}
				} // Comparision wiht single integer stops here
			}
			turn++;
		}
		return turn;
	}

	public void inorder(treeNode tree) {
		if (tree.left != null)
			inorder(tree.left); // go left

		// when there is no left
		System.out.println(tree.data);

		if (tree.right != null)
			inorder(tree.right); // go right

	}
}
