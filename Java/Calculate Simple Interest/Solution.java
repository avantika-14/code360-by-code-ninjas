import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		double p,r,t,result;
		p = sc.nextDouble();
		r = sc.nextDouble();
		t = sc.nextDouble();
		result = p*r*t/100;
		int re = (int)result;
		System.out.print(re);
		
	}
}
