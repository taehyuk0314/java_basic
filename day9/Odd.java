package day9;
public class Odd {
	public int Odd(int num) {
		
		int sum =0;
		
		for(int i=0;i<=num;i++) {
			if(i%2!=0) {
				sum += i;
			}
		}
		return sum;
	}
}
