package com.ken;

public class Main {
	public static void main(String[] argc) {
		int sum = 100;
		
		for(int i = 99; i>-1; i--){
			System.out.print(sum+" ");
			sum--;
			if(sum%5==0){
				System.out.println();
			}
		}
		
		System.out.println(Math.random());
	}
}
