package day7;
import java.util.Scanner;
import day7.Calc;
import day7.Bmi;
import day7.Year;
import day7.Gender;
import day7.Equalse;
public class Main1 {

	public static void main(String[] args) {
		while(true) {
		System.out.println("[메뉴]\n 0.종료 \n"
					+ "1.계산기 \n"
					+ "2.bmi\n"
					+ "3.윤년계산\n"
					+ "4.주민번호\n"
					+ "5.등수구하기\n");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		switch(name) {
		case "0" :
			System.out.println("종료");
			return;
		case "1" : 
		Calc c = new Calc();
		c.Calc();
		break;
		case "2" :
		Bmi d = new Bmi();
		d.Bmi();
		break;
		case"3" :
		Year y = new Year();
		y.Year();
		break;
		case"4" :
		Gender g = new Gender();
		g.Gender();
		break;
		case"5" :
		Equalse e = new Equalse();
		e.Equalse();
		break;	
		}
		}
	}	

}
