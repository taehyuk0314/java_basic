package day7;

import java.util.Scanner;

public class Year {
	public void Year() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = scanner.nextInt();
		String result = scanner.nextLine();
		
		if((year%4==0 && year%100!=0)||year%400==0) {
			result = "윤년";
		}else {
			result = "평년";
		}
		System.out.println(result);
	}
}
