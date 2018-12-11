package day9;
public class NameScoreArray {
	public String test( String[] names,int[] scores) {
		

		String res = "";
			for(int i =0;i<names.length;i++) {
			res += i+1+"등 "+names[i]+" "+scores[i]+"점\t";
			}
			return res; 
		}
}


