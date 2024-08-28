import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long m = 1;
		int n = sc.nextInt();
		if(n!=0){
			while(n!=0){
			m*=x;
			n--;
			}
			System.out.print(m);
		}
		else
			System.out.print(1);
	}
}
