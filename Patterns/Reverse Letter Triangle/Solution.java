public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=n;i>=1;i--){
            int ch = 65;
            for(int j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
