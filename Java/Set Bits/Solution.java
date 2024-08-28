import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int m=0;
		while(n!=0){
			int r = n%2;
			if(r==1)
				m+=1;
			n/=2;
		}
		return m;
	}
}
