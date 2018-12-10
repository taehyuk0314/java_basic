package day9;

import java.util.Scanner;

public class Gugudan {
	public void Gugudan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = scanner.nextInt();
		int[] gu = new int[9];
		String res = "";
		int mult = 0;
		for(int i=0;i<gu.length+1;i++) {
			if(i!=0) {
			res += dan+"*"+i+"="+dan*i+"\t";
			}
		}
			System.out.println(res);
	} 
}
