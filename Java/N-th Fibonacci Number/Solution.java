import java.util.* ;
import java.io.*; 
public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
        int mod = 1000000007;
        int a=0;
        int b=1;
        int res=0;
        if(n<2)
            return 1;
        for(int i=2;i<=n; i++){
            res = a+b;
            a=b;
            b=res;
            if(b>mod)
                b=b-mod;
        }
        return b;
    }
}
