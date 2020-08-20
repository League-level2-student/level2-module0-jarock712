package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = new String[5];
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "jom";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//6. make an array of 50 integers
		int[] large = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < large.length; i++) {
			large[i] = ran.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int temp;
		for (int i = 0; i < large.length; i++) {
			for (int j = i+1; j < large.length; j++) {
				if (large[i]>large[j]) {
					temp = large[i];
					large[i] = large[j];
					large[j] = temp;
				}
			}
		}
		System.out.println("The smallest int is: " + large[0]);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < large.length; i++) {
			System.out.println(large[i]);
		}
		//10. print the largest number in the array.
		int size = large.length;
		System.out.println("The largest integer is: " + large[size - 1]);
	}
}
