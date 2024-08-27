import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e=0, o=0;
		while(n!=0){
			int r = n%10;
			if (r%2 == 0)
				e+=r;
			else
				o+=r;
			n/=10;
		}
		System.out.print(e+"\t"+o);
	}
}
