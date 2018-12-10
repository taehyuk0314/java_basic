package day9;
import java.util.Scanner;
public class Odd {
	public void Odd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int sum =0;
		
		for(int i=0;i<=num;i++) {
			if(i%2!=0) {
				sum += i;
		}
		}System.out.println(sum);
	}
	public static void main(String[] args) {
		Odd d = new Odd();
		d.Odd();
	}
}
