package tree;

import java.io.FileNotFoundException;

public class Sorting {
	
	public static BuildArray a1 = new BuildArray(1000);	// creates an array for sorting
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.out.println(a1.list[1]);
		a1.fillArray();	// pulls the integer from .txt file --- works
		System.out.println(a1.arrayLength);
		
		bubbleSort.bubbleMethod(a1.list , a1.arrayLength-1);
		//a1.print();
		
		System.out.println("end");
	}

}
