package day9;

import java.util.Scanner;

public class ForDemo {
	public void ForDemo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~10사이 숫자를 입력하세요");
		int number = scanner.nextInt();
		String res = "";
		int sum =0;
		for(int i =0;i<=number;i++) {
			if(i!=number) {
				res += i+"+";
			}else {
				res += i+"=";
			}
			sum += i;
		}
		System.out.println(res+sum);
	}
}
