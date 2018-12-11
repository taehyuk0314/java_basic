package day10;

import java.util.Scanner;
import day9.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]0.종료 1.bmi 2.계산기 3.Sequens 4.구구단 5.로또 6.홀수계산 7.성적표");
			switch(scanner.next()) {
			case"0" :
				System.out.println("종료됩니다");
				return;
			case"1" :
				Bmi b = new Bmi();
				System.out.println("몸무게와 키를 입력하세요");
				System.out.println(b.Bmi
						(scanner.nextDouble(),
						scanner.nextDouble()));
				break;
			case"2" :
			Calc calc = new Calc();
			System.out.println("계산기");
			System.out.println(calc.Calc(
					scanner.nextInt(),
					scanner.next(),
					scanner.nextInt()));
				break;
			case"3" :
				Sequens seq = new Sequens();
				System.out.println("1~10사이 숫자를 입력하세요");
				System.out.println(seq.Sequens(scanner.nextInt()));
				break;
			case"4" :
				Gugudan gugudan = new Gugudan();
				System.out.println("단을 입력하세요");
				System.out.println(gugudan.Gugudan(scanner.nextInt()));
				break;
			case"5" :
				LottoNumberGen lotto = new LottoNumberGen();
				System.out.println(lotto.test());
				break;
			case"6" :
				Odd odd = new Odd();
				System.out.println("숫자를 입력하세요");
				System.out.println(odd.Odd(scanner.nextInt()));
			case"7" :
				NameScoreArray name = new NameScoreArray();
				System.out.println("몇명입니까");
				int count = scanner.nextInt();
				String[] names = new String[count];
				int[] scores = new int[count];
				System.out.println("학생이름과 성적을 입력하세요");
				for(int i =0;i<names.length;i++) {
					names[i] =scanner.next();
					scores[i] = scanner.nextInt();
					}
				System.out.println(name.test(names,scores));
				break;
			}
		}
	}

}
