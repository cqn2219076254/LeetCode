import java.util.*;

public class intersection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 1, 2}, new int[]{0, 1, 1})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) set.add(i);
        for (int i : nums2) {
            if (set.contains(i)) {
                set1.add(i);
            }
        }
        int[] ans = new int[set1.size()];
        int index = 0;
        for(int i : set1) {
            ans[index] = i;
            index++;
        }
        return ans;
    }
}
