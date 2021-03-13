public class reverseStr {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdaaab", 3));
    }

    public static String reverseStr(String s, int k) {
        char[] s_arr = s.toCharArray();
        int i = 0;
        while(i*k < s.length()){
            int x = Math.min((i+1)*k, s.length());
            for(int j=i*k; j<(x+i*k)/2; j++){
                char c = s_arr[j];
                s_arr[j] = s_arr[x + i * k - 1 -j];
                s_arr[x + i * k - 1 -j] = c;
            }
            i += 2;
        }
        return String.valueOf(s_arr);
    }
}
