package main;

import java.util.ArrayList;
import java.util.Scanner;

public class EX10813 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int j=s.nextInt();
		int k=s.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(j);
		for(int i=0;i<j;i++) {
			arr.add(i,i+1);
		}
		
		for(int i=0;i<k;i++) {
			int n1=s.nextInt()-1;
			int n2=s.nextInt()-1;
			int tmp = arr.get(n1);
			arr.set(n1, arr.get(n2));
			arr.set(n2, tmp);
		}
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
	}
}
