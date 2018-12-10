package day7;

import java.util.Scanner;

public class Calc {
	public void Calc() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("오칙연산");
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int result = 0;
			switch(op) {
				case "+": result= a+b; break;
				case "-": result= a-b; break;
				case "*": result= a*b; break;
				case "/": result= a/b; break;
				case "%": result= a%b; break;
				default : result= 0;
				}
			System.out.println(result);
	}
}
