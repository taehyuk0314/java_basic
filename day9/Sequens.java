package day9;
public class Sequens {
	public String Sequens(int number) {
		String res = "";
		int sum =0;
		for(int i =0;i<=number;i++) {
			if(i!=number) {
				res += i+"+";
			}else {
				res += i+"=";
			}
			sum += i;
		}
		return res+sum;
	}
}
