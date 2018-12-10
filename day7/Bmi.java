package day7;

import java.util.Scanner;

public class Bmi {
	public void Bmi(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요");
		double w =scanner.nextInt();
		System.out.println("키를 입력하세요");
		double t = scanner.nextDouble();
		double bmi = w/((t*t)/10000);
		String result1 = "";
		
			if(bmi>=40) {
				result1 = "고도비만";
			}else if(bmi>=35) {
				result1 = "중등도비만";
			}else if(bmi>=30) {
				result1 = "경도비만";
			}else if(bmi>=25) {
				result1 = "과체중";
			}else if(bmi>=18.5) {
				result1 = "정상";
			}else {
				result1 = "저체중";
			}
		System.out.println(bmi);
		System.out.println(result1);	
		}

}
