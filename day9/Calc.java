package day9;
public class Calc {
	public String Calc(int a,String op,int b){
		
		int res = 0;
		switch(op) {
		case "+" : res = a+b; break; 
		case "-" : res = a-b; break; 
		case "*" : res = a*b; break; 
		case "/" : res = a/b; break; 
		case "%" : res = a%b; break;
		default : res =0; break;
		}
		return a+op+b+"="+res;
	}
}
