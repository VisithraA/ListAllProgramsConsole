package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowDownwardLeftTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		System.out.println("\nhollowDownwardLeftTriangle:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i+j==n-1||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}