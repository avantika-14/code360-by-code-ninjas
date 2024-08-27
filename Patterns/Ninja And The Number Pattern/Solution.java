public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom=j;
                int right=(2*n-2)-i;
                int left=(2*n-2)-j;
                int min=top;
                if(bottom<min)
                    min=bottom;
                if(left<min)
                    min=left;
                if(right<min)
                    min=right;
                System.out.print((n-min));   
            }
            System.out.println();
        }
    }
}
