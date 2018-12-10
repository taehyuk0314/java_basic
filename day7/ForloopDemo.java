package day7;

import java.util.Scanner;

public class ForloopDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력하세요");
		int b = scanner.nextInt();
		int sum = 0;
		String a ="";
		for(int i = 1;i<=b;i++) {
			if(i!=10) {
				a += i+"+";
			}else {
				a += i+"=";
			}
			sum += i;			
		}
		System.out.println(a+sum);
		
	}

}
