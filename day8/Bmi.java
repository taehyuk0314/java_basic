package day8;

import java.util.Scanner;

public class Bmi {
	public void Bmi() {
		System.out.println("몸무게를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		double w = scanner.nextDouble();
		System.out.println("키를 입력하세요");
		double t = scanner.nextDouble();
		
		double bmi = w/((t*t)/10000);
		String result = "";
		
		if(bmi>=40) {
			result = "고도비만";
		}else if(bmi>=35) {
			result = "중도비만";
		}else if(bmi>=30) {
			result = "경도비만";
		}else if(bmi>=25) {
			result ="과체중";
		}else if(bmi>=18.5) {
			result = "정상";
			
		}else {
			result = "저체중";
		}
		System.out.println(result);
		
	}

}
