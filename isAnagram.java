public class isAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("car", "rac"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int n = s.length();
        int[] s_arr = new int[26];
        for(int i=0; i<n; i++){
            s_arr[s.charAt(i)-97]++;
        }
        for(int i=0; i<n; i++) {
            s_arr[t.charAt(i)-97]--;
        }
        for(int i=0; i<26; i++){
            if(s_arr[i] != 0) return false;
        }
        return true;
    }
}
