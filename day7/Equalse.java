package day7;

import java.util.Scanner;

public class Equalse {
public void Equalse(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("학색이름과 점수를 입력하세요");
	String name1 = scanner.next();
	int num1 = scanner.nextInt();
	String name2 = scanner.next();
	int num2 = scanner.nextInt();
	String name3 = scanner.next();
	int num3 = scanner.nextInt();
	
	String result = "";
	if(num1>num2&&num2>num1) {
		result += "1등" +name1+"\t";
		result += "2등" +name2+"\t";
		result += "3등" +name3+"\t";
	}else if(num1>num2&&num2>num1) {
		result += "1등" +name1+"\t";
		result += "2등" +name3+"\t";
		result += "3등" +name2+"\t";
	}else if(num2>num1&&num1>num3) {
		result += "1등" +name2+"\t";
		result += "2등" +name1+"\t";
		result += "3등" +name3+"\t";
	}else if(num2>num3&&num3>num2) {
		result += "1등" +name2+"\t";
		result += "2등" +name3+"\t";
		result += "3등" +name1+"\t";
	}else if(num3>num1&&num1>num2) {
		result += "1등" +name3+"\t";
		result += "2등" +name1+"\t";
		result += "3등" +name2+"\t";
	}else{
		result += "1등" +name3+"\t";
		result += "2등" +name2+"\t";
		result += "3등" +name1+"\t";
	}
	System.out.println(result);
}
}
