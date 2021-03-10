public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaa"));
        System.out.println(solution2("abab"));
    }

    public static String solution2(String s){
        if(s == null || s.length() < 1) return s;
        else{
            int start = 0, end = 0, length = s.length();
            for(int i=0; i<length; i++){
                int len1 = expandAroundCenter(s, i, i);
                int len2 = expandAroundCenter(s, i, i+1);
                int len = Math.max(len1, len2);
                if(end - start < len) {
                    start = i - len / 2;
                    end = i + (len+1) / 2;
                }
            }
            return s.substring(start, end+1);
        }
    }

    public static int expandAroundCenter(String s, int i, int j) {
        while (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j - i - 2;
    }

    public static String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        else if(s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) return s;
            else return String.valueOf(s.charAt(0));
        }
        else {
            char[] arr = s.toCharArray();
            int n = arr.length;
            boolean[][] dp = new boolean[n][n];
            int start = 0, end = 0;
            for(int i=0; i<n; i++) {
                dp[i][i] = true;
            }
            for(int i=1; i<n; i++) {
                for(int j=0; j<i; j++) {
                    if(arr[i] != arr[j]) {
                        dp[j][i] = false;
                    }
                    else{
                        if(i == j+1) {
                            dp[j][i] = true;
                            if(start == end) {
                                start = j;
                                end = i;
                            }
                        }
                        else{
                            if(dp[j+1][i-1]) {
                                dp[j][i] = true;
                                if(end - start < i - j) {
                                    start = j;
                                    end = i;
                                }
                            }
                        }
                    }
                }
            }
            return s.substring(start, end+1);
        }
    }
}
