package tree;

public class treeList {

	class treeNode {
		public treeNode left, right;
		public int data;
		public int duplicate;
	}

	public treeNode root;
	public int count = 0 ;

	public void init() {
		root = null;
	}

	public treeNode makeNode(int data) {
		treeNode curr = new treeNode();
		curr.data = data;
		curr.left = null;
		curr.right = null;
		curr.duplicate = 1;
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

	public void buildBinaryTree(Integer[] list) {
		int turn = 0; // counts the size of non-null elements in the array

		while (turn < list.length) { // loops through the whole list of integers
			int num = list[turn];

			count++;
			if (root == null) {
				root = makeNode(num);
			} else {
				treeNode current = root;
				boolean go = true;
				
				count++;
				while (go) { // number is compared with single integer from existing tree

					count++;
					if (num < current.data) {
						
						if (current.left != null) {
							current = current.left;
							count++;
						}
						else {
							setLeft(num, current);
							go = false;
							count = count + 2;
						}	
					} else if (num > current.data) {
						count=count+2;
						if (current.right != null) {
							current = current.right;
							count++ ;
						}
						else {
							setRight(num, current);
							go = false;
							count = count + 2;
						}
					} else { // num == current.data
						count = count + 3 ;
						int temp = current.duplicate ;
						current.duplicate = temp+1 ;
						go = false;
					}					
				} // Comparison with single integer stops here
			}
			turn++;
			//System.out.println(turn);
		}
		
	}

	public void inorder(treeNode tree) {
		if (tree.left != null)
			inorder(tree.left); // go left

		// when there is no left
		for(int i=1 ; i<=tree.duplicate ; i++) {
			System.out.println(tree.data);
		}

		if (tree.right != null)
			inorder(tree.right); // go right

	}


}
// makeTreeNode()
// setLeft
// setRIght
// inOrder
// BuildbinaryTree
// No. of compares (reading and writing the integer)
