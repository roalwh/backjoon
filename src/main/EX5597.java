package main;

import java.util.Scanner;

public class EX5597 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr1 = new int[30];
		int[] arr2 = new int[28];
		int[] set = new int[2];
		int k = 0;
		int n = 0;
		int c = 0;
//	1~30 까지 변수 쵝화
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
//		1~28 번 등록
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = s.nextInt();
		}
		// 30번반복
		for (int i = 0; i < arr1.length; i++) {
			// 28번 반복
			for (int j = 0; j < arr2.length; j++) {
				// n arr1의 값 저장
				n = arr1[i];
				// arr2의 값을 비교,같을경우 c가 1증가
				if (n == arr2[j]) {
					c++;
				}
			}
			if (c == 0) {
				set[k] = n;
				k++;
			} else {
				c = 0;
			}

		}

		if (set[0] < set[1]) {
			System.out.println(set[0]);
			System.out.println(set[1]);
		} else {
			System.out.println(set[1]);
			System.out.println(set[0]);
		}

	}

}
