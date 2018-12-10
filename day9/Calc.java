package day9;

import java.util.Scanner;

public class Calc {
	public void Calc(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("계산기");
		int a = scanner.nextInt();
		String op = scanner.next();
		int b  = scanner.nextInt();
		int res = 0;
		switch(op) {
		case "+" : res = a+b; break; 
		case "-" : res = a-b; break; 
		case "*" : res = a*b; break; 
		case "/" : res = a/b; break; 
		case "%" : res = a%b; break;
		default : res =0; break;
		}
		System.out.println(res);
	}
}
