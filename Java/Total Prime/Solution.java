import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
	
	// Write your totalPrime function here
	public boolean isPrime(int num){
		if(num<=1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i == 0)
				return false;
		}
		return true;
	}
	public int totalPrime(int s, int e){
		int count=0;
		for(int i=s;i<=e;i++){
			if(isPrime(i))
				count+=1;		
		}
		return count;
	}
}

class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
