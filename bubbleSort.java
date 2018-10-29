package tree;

//import tree.treeList;

public class bubbleSort {

	public int count = 0;	// Number of comparisons
	public Integer[] list;

	bubbleSort(Integer[] list) {
		this.list = list;
	}

	public void bubbleMethod() {
		boolean swapping = true;
		int j = 0;

		while (swapping) {

			swapping = false;
			for (int i = 0; i < (list.length - 1); i++) {
				count++;
				if (list[i] > list[i + 1]) {
					swapping = true;
					swap(i, i + 1); // Calls the swap method
				}
			} /* End for. */
		} /* End while. */
	}

	public void swap(int num1, int num2) {
		Integer temp = list[num1];
		list[num1] = list[num2];
		list[num2] = temp;
	}

}
