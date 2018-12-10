package day9;
import java.util.Scanner;
public class ScoreArray {
	public void test() {
		System.out.println("점수입력");
		Scanner scanner =new Scanner(System.in);
		int[] a = new int[3];
		String res = "";
		for(int i =0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i= 0; i<a.length;i++) {
			if(i<a.length-1) {
				res += a[i]+",";
			}else {
				res += a[i];
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		ScoreArray a = new ScoreArray();
		a.test();
	}
}

