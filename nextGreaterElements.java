import java.util.*;

public class nextGreaterElements {
    public static void main(String[] args) {
        int[] ans = nextGreaterElements(new int[]{1, 2, 1});
        for (int an : ans) {
            System.out.println(an);
        }
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < 2 * n; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % n]){
                ans[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ans;
    }
}
