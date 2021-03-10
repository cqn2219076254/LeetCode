public class firstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
    }

    public static int firstMissingPositive(int[] nums){
        int n = nums.length;
        boolean[] bucket = new boolean[n + 1];
        for(int num : nums){
            if(num > 0 && num < n+1) bucket[num] = true;
        }
        for(int i=1; i<n+1; i++){
            if(!bucket[i]) return i;
        }
        return n+1;
    }
}
