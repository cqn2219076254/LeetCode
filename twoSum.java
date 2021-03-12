import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                ans[0] = i;
                ans[1] = map.get(diff);
                break;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
