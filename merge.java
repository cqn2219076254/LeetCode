import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class merge {
    public static void main(String[] args) {
        int[][] intervals = new int[4][2];
        intervals[0][0] = 1;
        intervals[0][1] = 3;
        intervals[1][0] = 2;
        intervals[1][1] = 6;
        intervals[2][0] = 8;
        intervals[2][1] = 10;
        intervals[3][0] = 15;
        intervals[3][1] = 18;
        intervals = merge(intervals);
        System.out.println(Arrays.deepToString(intervals));
    }

    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                return i1[0] - i2[0];
            }
        });
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(intervals[0][0]);
        stack.push(intervals[0][1]);
        for(int i=1; i<n; i++){
            if(intervals[i][0] > stack.peek()){
                stack.push(intervals[i][0]);
                stack.push(intervals[i][1]);
            }
            else if(intervals[i][1] > stack.peek()) {
                stack.pop();
                stack.push(intervals[i][1]);
            }
        }
        n = stack.size() / 2;
        int[][] ans = new int[n][2];
        for(int i=n-1; i>-1; i--){
            ans[i][1] = stack.pop();
            ans[i][0] = stack.pop();
        }
        return ans;
    }
}
