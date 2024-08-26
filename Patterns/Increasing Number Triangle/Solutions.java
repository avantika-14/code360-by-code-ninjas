public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int a=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                a++;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
