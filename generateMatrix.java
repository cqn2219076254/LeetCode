public class generateMatrix {
    public static void main(String[] args) {
        System.out.println(generateMatrix(3));
    }

    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int m = n - 1;
        int x = 1;
        int i=0, j=0;
        for(; m>=n/2; m--) {
            for(; j<m; j++) {
                ans[i][j] = x;
                x++;
            }
            for(; i<m; i++) {
                ans[i][j] = x;
                x++;
            }
            for(; j>n-m-1;j--) {
                ans[i][j] = x;
                x++;
            }
            for(; i>n-m-1; i--) {
                ans[i][j] = x;
                x++;
            }
            i++;
            j++;
        }
        if(n % 2 == 1) ans[n/2][n/2] = n * n;
        return ans;
    }
}
