public class removeElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 3, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            while(nums[i] == val && n != 0 && n > i){
                nums[i] = nums[n-1];
                n--;
            }
        }
        return n;
    }
}
