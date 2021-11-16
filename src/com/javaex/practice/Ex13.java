package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.println("숫자: ");
		int x= sc.nextInt();
		
		double result;
		
		if(x<=0) {
			result= (x*x*x)-9*x+2;
		}
		else {
			result= 7*x+2;
		}
		
		System.out.println("계산결과는 "+result+"입니다.");
	
		sc.close();
		
	}
}
