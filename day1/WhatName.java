package day1;

import java.util.Scanner;

public class WhatName {

	public static void main(String[] args) {
		System.out.println("당신의 이름,나이,사는곳은?");
		Scanner scanner =new Scanner(System.in);
		String name = scanner.next();
		String age = scanner.next();
		String adder = scanner.next();
		System.err.println(name+"이고"+age+"이고"+adder+"입니다");
	}

}
