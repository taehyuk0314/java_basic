package day7;

import java.util.Scanner;

public class Gender {
public void Gender() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("주민등록번호를 입력하세요");
	String num = scanner.next();
	String result = "";
	char ch = num.charAt(7);
	switch(ch) {
	case '1' : case '3': result = "남자"; break;
	case '2' : case '4' :result = "여자"; break;
	case '5' : case '6' :result = "외국인"; break;
	default : result = "다시"; break;
	}
	System.out.println(result);
}
}
