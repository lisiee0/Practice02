package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String oper= sc.nextLine();
		
		System.out.print("숫자1: ");
		int num1= sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2= sc.nextInt();
		
		double resultA= num1+num2;
		double resultS= num1-num2;
		double resultM= num1*num2;
		double resultD= num1/num2;
		
		switch(oper) {
			case "+":
				System.out.println("결과는 "+resultA);
				break;
				
			case "-":
				System.out.println("결과는 "+resultS);
				break;
				
			case "*":
				System.out.println("결과는 "+resultM);
				break;
				
			case "/":
				if(num2==0) {
					System.out.println("계산할 수 없습니다.");
					break;
				}
				System.out.println("결과는 "+resultD);
				break;
				
			default :
				System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
		
	}

}
