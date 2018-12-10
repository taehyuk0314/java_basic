package day8;

import java.util.Scanner;

public class Grade {
	public static void main(String[]args) {
		int[] scoreArr = new int[3];
		System.out.println("점수를 입력하세요");
		Scanner scanner =new Scanner(System.in);
		scoreArr[0] = scanner.nextInt();
		scoreArr[1] = scanner.nextInt();
		scoreArr[2] = scanner.nextInt();
		for(int i=0;i<2;i++) {
			for(int k =0;k<2;k++) {
				if(scoreArr[k]<scoreArr[k+1]) {
				int imp = scoreArr[k];
				scoreArr[k] = scoreArr[k+1];
				scoreArr[k+1] = imp;
				}
			}
		}
	for(int i = 0;i<3;i++) {
		System.out.println(i+1+"등"+scoreArr[i]);
	}
	}
}
