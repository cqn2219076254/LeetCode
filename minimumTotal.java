import java.util.*;

public class minimumTotal {
    public static void main(String[] args) {
        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        l1.add(2);
        l2.add(3);
        l2.add(4);
        l3.add(6);
        l3.add(5);
        l3.add(7);
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);
        System.out.println(solution2(triangle));
        l0.add(-10);
        triangle.clear();
        triangle.add(l0);
        System.out.println(minimumTotal(triangle));
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for(int i=1; i<n; i++){
            List<Integer> nums = triangle.get(i);
            for(int j=0; j<=i; j++){
                int now = triangle.get(i).get(0);
                triangle.get(i).remove(0);
                if(j == 0) triangle.get(i).add(triangle.get(i-1).get(0) + now);
                else if(j == i) triangle.get(i).add(triangle.get(i-1).get(i-1) + now);
                else triangle.get(i).add(Math.min(triangle.get(i-1).get(j-1), triangle.get(i-1).get(j)) + now);
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            ans = Math.min(ans, triangle.get(n-1).get(i));
        }
        return ans;
    }

    public static int solution2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for(int i=n-1; i > -1; i--) {
            for(int j=0; j<=i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
                System.out.print(dp[j] + " ");
            }
            System.out.println("");
        }
        return dp[0];
    }
}
