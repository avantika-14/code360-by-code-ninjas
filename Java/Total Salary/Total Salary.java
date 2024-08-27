import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		int b;
		double hra, da, allow, pf, totalSalary;
		char grade;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		grade = sc.next().charAt(0);
		switch(grade){
			case 'A':
				allow = 1700;
				break;
			case 'B':
				allow = 1500;
				break;
			default:
				allow = 1300;
		}
		double basic = (double) b;
		hra = 0.2 * basic;
		da = 0.5 * basic;
		pf = 0.11 * basic;
		totalSalary = basic + hra + da + allow - pf;
		System.out.printf("%.0f\n",totalSalary);
		
	}
}
