package day8;

import java.util.Scanner;

public class Gender {
	public void Gender(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호를 입려하세요");
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		String result ="";
		
		switch(ch) {
		case '1': case'3': result = "남자"; break;
		case '2': case'4': result = "여자"; break;
		case '5': case'6': result = "외국인"; break;
		default : result= "잘못된입력"; break;		
		}
		System.out.println(result);
}
}
