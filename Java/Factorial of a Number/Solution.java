import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fact = 1;
		if(n==0)
			System.out.print(1);
		else if(n>0){
			while(n!=0){
				fact*=n;
				n--;
			}
			System.out.print(fact);
		}
		else 
			System.out.print("Error");	
	}
}
