package day9;
public class Bmi {
	public String Bmi(double w,double t) {
		
		double bmi = w/((t*t)/10000);
		String res = "";
		if(bmi>=40) {
			res = "고도비만";
		}else if(bmi>=35) {
			res ="중등도비만";
		}else if(bmi>30){
			res ="경도비만";
		}else if(bmi>25) {
			res ="과체중";
		}else if(bmi>18.5){
			res ="정상";
		}else {
			res ="저체중";
		}
		return bmi+"\n"+res;
	}
}
