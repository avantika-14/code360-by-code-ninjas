public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        n = 2*n;
        for(int row = 0; row < n-1; row++) {
            for(int col = 0; col < n; col++) {
                // Condition for first half of the rows.
                if (row < n/2 && (col <= row || col >= (n-row-1))) {
                    System.out.print("*");
                }
                // Condition for the second half of the rows.
                else if (row >= n/2 && (col < (n-row-1) || col > row)) {
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
