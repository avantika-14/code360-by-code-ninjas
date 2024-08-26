public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        int ch;
        for(int i=1;i<=n;i++){
            ch=65;
            for(int j=1;j<=i;j++){
                System.out.print((char)(ch)+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
