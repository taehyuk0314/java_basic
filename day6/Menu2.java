package day6;

import java.util.Scanner;

public class Menu2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[메뉴] 0.종료\n"
					+ " 1.BMI계산기 \n"
					+ "2.오칙연산 \n"
					+ "3.윤년 계산기 \n"
					+ "4.성별 판별기 \n"
					+ "5.등수구하기 \n");
			String sw = scanner.next();
			switch(sw) {
			case "0" :
				System.out.println("다시");
				return;
			case "1" :
				System.out.println("계산할 숫자를 입력하세요");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int result = 0;
					switch(op) {
						case "+" : result = a+b;
						case "-" : result = a-b;
						case "*" : result = a*b;
						case "/" : result = a/b;
						case "%" : result = a%b;
						default : result = 0;
					}
					System.out.println(a+result+b);
			case"2":		
				System.out.println("몸무게를 입력하세요");
				double w = scanner.nextDouble();
				System.out.println("키를 입력하세요");
				double t = scanner.nextDouble();
				double bmi = ((w/t*t)/10000);
				String result1 = "";
				if(bmi<=40) {
					result1 = "고도비만";
				}else if(bmi<=35) {
					result1 = "중등도비만";
				
				}else if(bmi<=30){
					result1 = "경도비만";
				}else if(bmi<=25) {
					result1 = "과체중";
				}else if(bmi<=18.5) {
					result1 = "정상";
				}else {
					result1 = "저체중";
				}
				System.out.println(result1);
			
			case "3" :
				System.out.println("연도입력하세요");
				int year = scanner.nextInt();
				String result2 = "";
				
				if((year%4==0 &&year%100!=0)||year%400==0) {
					result2 ="윤년";
				}else {
					result2 = "평년";
				}
				System.out.println(result2);
			
			case "4" :
				System.out.println("주민등록번호를 입력하세요");
				String ss = scanner.next();
				char ch = ss.charAt(7);
				String result3 = "";
				switch(ch) {
				case '1' : result3 = "남자";
				case '3' : result3 = "남자";
				case '2' : result3 = "여자";
				case '4' : result3 = "여자";
				case '5' : result3 = "외국인";
				case '6' : result3 = "외국인";
				default : result3 = "다시";
				}
				System.out.println(result3);
			case"5" :
				System.out.println("학생이름과 점수를 입력하세요");
				String name1 = scanner.next();
				int num1 = scanner.nextInt();
				String name2 = scanner.next();
				int num2 = scanner.nextInt();
				String name3 = scanner.next();
				int num3 = scanner.nextInt();
				
				String result5 = "";
				
				if(num1>num2&&num2>num3) {
					result5 += "1등 "+name1+"\t";
					result5 += "2등 "+name2+"\t";
					result5 += "3등 "+name3;
				}else if(num1>num3&&num3>num2) {
					result5 += "1등 "+name1+"\t";
					result5 += "2등 "+name3+"\t";
					result5 += "3등 "+name2;
				}else if(num2>num1&&num1>num3) {
					result5 += "1등 "+name2+"\t";
					result5 += "2등 "+name1+"\t";
					result5 += "3등 "+name3;
				}else if(num2>num3&&num3>num1) {
					result5 += "1등 "+name2+"\t";
					result5 += "2등 "+name3+"\t";
					result5 += "3등 "+name1;
				}else if(num3>num1&&num1>num2) {
					result5 += "1등 "+name3+"\t";
					result5 += "2등 "+name1+"\t";
					result5 += "3등 "+name2;
				}else{
					result5 += "1등 "+name3+"\t";
					result5 += "2등 "+name2+"\t";
					result5 += "3등 "+name1;
				}
				System.out.println(result5);
				break;
				
			}
		}
	}

}
