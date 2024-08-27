public class Solution {
    public static void symmetry(int n) {
        // Write your code here
         n = 2*n;
        for(int i=1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                // Condition for first half of the rows.
                if (i < n/2 && (j <= i || j >= (n-i-1))) {
                    System.out.print("*");
                }
                // Condition for the second half of the rows.
                else if (i >= n/2 && (j < (n-i-1) || j > i)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

                System.out.print(" ");
            }

            // End the current row of the pattern.
            System.out.println();
        }
    }
}
