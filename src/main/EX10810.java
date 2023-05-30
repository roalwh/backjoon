package main;

import java.util.ArrayList;
import java.util.Scanner;

public class EX10810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner s = new Scanner(System.in);
			int j=s.nextInt();
			int k=s.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>(j);
			for(int i=0;i<j;i++) {
				arr.add(i,0);
			}
//			System.out.println(arr);
			int cnt=0;
			for(int i=0;i<k;i++){
				int n1=s.nextInt();
				int n2=s.nextInt();
				int n3=s.nextInt();
				
				for(int i2=n1-1;i2<n2;i2++) {
						arr.set(i2,n3);			
				}	
				
			}
			for(int i=0;i<arr.size();i++) {
				System.out.print(arr.get(i)+" ");	
			}
			
//			for(int i3=0;i3<arr.size();i3++)
//				System.out.println(arr);
			
	}

}
