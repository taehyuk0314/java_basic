package day9;

import java.util.Random;

public class LottoNumberGen {
	public String test() {
		Random random = new Random();
		String res ="";
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = random.nextInt(45)+1;
			if(i<lotto.length-1) {
				res += lotto[i]+",";
			}else {
				res += lotto[i];	
				System.out.println(res);
			}
		}			
		return res;
	}
}
