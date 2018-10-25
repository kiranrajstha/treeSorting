package tree;

//import tree.treeList;

public class bubbleSort {
	
	public static int count=0;
	
	public static void bubbleMethod(Integer [] list , int length) {
		boolean swapping = true;
		int j=0;
		
		while(swapping) {
//			System.out.println(j);
//			j++;
			swapping = false;
			for(int i=0 ; i < (length-1) ; i++ ) {
				count++;
				System.out.println(list[i]);
				if (list[i]< list[i+1] ) {
				swapping = true;
				swap( i, i+1 , list);	// Calls the swap method
				}
			} /* End for. */
		} /* End while. */
	}
	
	public static void swap( int num1 , int num2 , Integer[] list ) {
		int temp = list[num1];
		list[num1]=list[num2];
		list[num2]=temp;
	}

}
