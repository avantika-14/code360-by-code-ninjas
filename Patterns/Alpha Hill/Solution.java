public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            char ch = 65;
            for(int j=(n-i);j>=1;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            ch-=2;
            for(int j=i;j>1;j--){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
