package tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuildArray {
	public static Integer[] list;
	public static int arrayLength;

	BuildArray(int length) {//throws FileNotFoundException {
		list = new Integer[length];
		//array();
	}

	public void fillArray() throws FileNotFoundException {
		File mydoc = new File("C:\\Users\\Kiran\\Desktop\\numbers.txt");
		Scanner input = new Scanner(mydoc);

		int i = 0;
		while (input.hasNext()) {
			int num = input.nextInt();
			list[i] = num;
			//System.out.println(list[i] + "   " + num);
			i++;
		}
		arrayLength = i;
	}
	
	public static void print() {
		for(int i = 0; i<arrayLength ; i++) {
			System.out.println(list[i]);
		}
	}

//	public static void main(String[] args) throws FileNotFoundException {
//		BuildArray a = new BuildArray();
//		a.array();
//		System.out.println(a.list.length);
//	}
}
