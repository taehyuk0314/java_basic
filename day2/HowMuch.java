package day2;

import java.util.Scanner;

public class HowMuch {

	public static void main(String[] args) {
		System.out.println("얼마에요");
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		System.out.println(n1+"원 입니다");
		System.out.println("몇개드릴까요?");
		int n2 = scanner.nextInt();
		int result = n1*n2;
		if(result>=1000) {
			result = result - (result/5);
		}else if(result>=500) {
			result = result - (result/10);
		}else {
			result = result;
		}
		System.out.println("총금액은"+result+"입니다");
		
	}

}
