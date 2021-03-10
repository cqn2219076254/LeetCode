public class findMedianSortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int i = 0, j = 0, k = 0;
        float mid;
        if ((x+y) % 2 == 0) {
            int z = (x+y) / 2;
            float mid1, mid2;
            while(true) {
                if (j == y || (i < x && nums1[i] < nums2[j])) {
                    mid1 = nums1[i];
                    i++;
                } else {
                    mid1 = nums2[j];
                    j++;
                }
                k++;
                if (k == z) {
                    if (j == y || (i < x && nums1[i] < nums2[j])) {
                        mid2 = nums1[i];
                    } else {
                        mid2 = nums2[j];
                    }
                    mid = (mid1 + mid2) / 2;
                    break;
                }
            }
        }
        else {
            int z = (x+y) / 2 + 1;
            do {
                if (j == y || (i < x && nums1[i] < nums2[j])) {
                    mid = nums1[i];
                    i++;
                } else {
                    mid = nums2[j];
                    j++;
                }
                k++;
            } while (k != z);
        }
        return mid;
    }
}
