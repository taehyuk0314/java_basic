package day9;

import java.util.Scanner;

public class NameScoreArray {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇명입니까");
		int count = scanner.nextInt();
		
		String[] names = new String[count];
		int[] scores = new int[count];
		
		
		while(true) {
		System.out.println("[종료시 0 진행 1]학생이름, 점수를 입력하세요");
		String flag = scanner.next();
		int iter = 0;
		System.out.println("이터"+iter);
			if(!flag.equals("0")&&iter!=count) {
				names[iter] = scanner.next();
				scores[iter] = scanner.nextInt();
				iter++;
			}else {
				System.out.println("종료");
				for(int i = 0;i<names.length;i++) {
					System.out.println(scores[i]);
				}
			}
		}
}
		
		
	public static void main(String[] args) {
		NameScoreArray a = new NameScoreArray();
		a.test();
	}
}
