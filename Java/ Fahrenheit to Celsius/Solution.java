import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		for(int i=s; i<=e; i+=w){
			float celsius = (5.0f/9.0f)*(i-32.0f);
			System.out.println(i+"\t"+(int)celsius);
		}
		
		
	}
}
