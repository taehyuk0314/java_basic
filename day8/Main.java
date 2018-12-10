package day8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("[메뉴]\n"
					+ "1.계산기\n"
					+ "2.BMI\n"
					+ "3.윤년계산기\n"
					+ "4.성별체크\n"
					+ "5.성적표\n");
			String select = scanner.next();
			switch(select) {
			case "0" : 
				System.err.println("종료");
				return;
			case "1": 
				Calc calc = new Calc();
				break;
			case "2": 
				Bmi bmi = new Bmi();
				break;
			case "3": 
				Year year = new Year();
				break;
			case "4": 
				Gender gender =new Gender();
				break;
			case "5": 
				Grade grade = new Grade();
				break;
			default : break;
			}
		}
	}

}
