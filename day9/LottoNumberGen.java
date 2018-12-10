package day9;

import java.util.Random;

public class LottoNumberGen {
	public void test() {
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length;i++) {
					lotto[i] = random.nextInt(45)+1;
			}
		for(int i=0;i<lotto.length;i++) {
		System.out.println(lotto[i]);
		}
	}

}
