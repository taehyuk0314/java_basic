package day9;

import java.util.Scanner;
import day9.Calc;
import day9.Bmi;
import day9.Gugudan;
import day9.ForDemo;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.정지\n"
					+ "1.계산기\n"
					+ "2.Bmi\n"
					+ "3.ForDemo\n"
					+ "4.구구단\n"
					+ "5.로또");
		String select = scanner.next();
		switch(select) {
		case "0" : 
			System.out.println("종료됩니다");
			return;
		case "1" : 
			Calc c = new Calc();
			c.Calc();
			break;
		case "2" : 
			Bmi b = new Bmi();
			b.Bmi();
			break;
		case "3" : 
			ForDemo f = new ForDemo();
			f.ForDemo();
			break;
		case "4" : 
			Gugudan g = new Gugudan();
			g.Gugudan();
			break;
		case "5" : 
			LottoNumberGen l = new LottoNumberGen();
			l.test();
			break;
		}
		}
	}

}
