package tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuildArray {
	public  Integer[] list;
	public  int arrayLength;	// Total number of non-null spaces in the array

	BuildArray(int length) {
		list = new Integer[length];	// Initialize the size of the to-be-made matrix
	}

	public void fillArray() throws FileNotFoundException {
		File mydoc = new File("C:\\Users\\Kiran\\Desktop\\numbers.txt");
		Scanner input = new Scanner(mydoc);

		int i = 0;
		while (input.hasNext()) {	// Fill the 'list' array
			int num = input.nextInt();
			list[i] = num;
			i++;
		}
		arrayLength = i;
	}
	
	public void print() {	//Integer [] list , int arrayLength
		for(int i = 0; i<arrayLength ; i++) {
			System.out.println(list[i]);
		}
	}

}
