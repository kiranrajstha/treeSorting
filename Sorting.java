package tree;

import java.io.FileNotFoundException;

public class Sorting {
	
	public static BuildArray a1 = new BuildArray(1000);	// creates an array for sorting
	public static BuildArray a2 = new BuildArray(1000);
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("...............Tree........................");
		
		// Tree sorting workspace
		a2.fillArray();
		treeList treeObj = new treeList();
		treeObj.buildBinaryTree(a2.list);
		treeObj.inorder(treeObj.root);
		System.out.println("Total comparisions " + treeObj.count);
		
		//System.out.println(treeObj.root.right.data);

		System.out.println("...............Bubble sort........................");

		// Bubble Sorting workspace
		a1.fillArray();	// pulls the integer from .txt file 
		bubbleSort x =new bubbleSort(a1.list);
		x.bubbleMethod();
		a1.print();	// a1.list, a1.arrayLength
		System.out.println("Total comparisions is " + x.count);
		
		
	}

}
