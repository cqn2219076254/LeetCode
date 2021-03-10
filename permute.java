import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permute {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> out = new ArrayList<Integer>();
        for(int num : nums){
            out.add(num);
        }
        dfs(ans, out, nums.length, 0);
        return ans;
    }

    public static void dfs(List<List<Integer>> ans, List<Integer> out, int n, int m){
        if (m == n) {
            ans.add(new ArrayList<Integer>(out));
        }
        for (int i = m; i < n; i++) {
            Collections.swap(out, m, i);
            dfs(ans, out, n, m + 1);
            dfs(ans, out, n, m + 1);
            Collections.swap(out, m, i);
        }
    }
}
