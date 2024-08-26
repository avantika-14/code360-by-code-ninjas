public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            int ch = 65 + (n-1);
            for(int j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
