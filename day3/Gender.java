package day3;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		System.out.println("주민등록번호를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String snn = scanner.next();
		char ch = snn.charAt(7);
		String result = "";
		switch(ch) {
		case'1' : case'3' : result = "남자"; 
		case'2' : case'4' : result = "여자"; 
		case'5' : case'6' : result = "외국인";
		default : result= "잘못된입력입니다";
		}
		System.out.println(result);
	}
	

}
