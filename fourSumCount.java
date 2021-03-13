import java.util.*;

public class fourSumCount {
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        System.out.println(fourSumCount(A, B, C, D));
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int x = -a - b;
                if (map.containsKey(x)) map.put(x, map.get(x) + 1);
                else map.put(x, 1);
            }
        }
        int count = 0;
        for (int c : C) {
            for (int d : D) {
                if(map.containsKey(c + d)) {
                    count += map.get(c + d);
                }
            }
        }
        return count;
    }
}
