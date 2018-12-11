package day9;


public class Gugudan {
	public String Gugudan(int dan) {
		
		int[] gu = new int[9];
		String res = "";
		int mult = 0;
		for(int i=0;i<gu.length+1;i++) {
			if(i!=0) {
			res += dan+"*"+i+"="+dan*i+"\t";
			}
		}
			return res;
	} 
}
