package day8;

import java.util.Scanner;

public class Year {
	public void Year() {
		System.out.println("년도를 입력하세요");
		Scanner scanner = new  Scanner(System.in);
		int year = scanner.nextInt();
		String result = "";
		if((year%4==0&&year%100!=0)||year%400==0) {
			result = "윤년";
		}else {
			result ="평년";
			
		}
		System.out.println(result);
	}
}
