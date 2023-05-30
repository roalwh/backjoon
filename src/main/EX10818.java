package main;

import java.util.Scanner;

public class EX10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];

		
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(min+" "+max);
	}

}
