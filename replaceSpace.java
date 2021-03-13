public class replaceSpace {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        int n = s.length();
        int m = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == ' ') m++;
        }
        char[] arr = new char[n + 2 * m];
        int i=n-1, j=n+2*m-1;
        while(i >- 1){
            if(s.charAt(i) == ' ') {
                arr[j--] = '0';
                arr[j--] = '2';
                arr[j--] = '%';
                i--;
            }
            else arr[j--] = s.charAt(i--);
        }
        return String.valueOf(arr);
    }
}
