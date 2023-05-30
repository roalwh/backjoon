package main;

import java.util.ArrayList;
import java.util.Scanner;

public class EX2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

//		int arr[] = new int[9];
//		int max;
//		int cnt=1;
//		for(int i=0;i<9;i++) {
//			int n = s.nextInt();
//			arr[i]=n;
//		}
//		max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//				cnt=i+1;
//			}
//		}
//		System.out.println(max);
//		System.out.print(cnt);
//		

		ArrayList<Integer> arr = new ArrayList<>();
		
		int cnt = 1;
		for (int i = 0; i < 9; i++) {
			int n = s.nextInt();
			arr.add(n);
		}

		int max = arr.get(0);
		for(int i=1;i<arr.size();i++) {
			if(max<arr.get(i)) {
				max=arr.get(i);
				cnt=i+1;
			}
		}
		System.out.println(max);
		System.out.print(cnt);

	}

}
