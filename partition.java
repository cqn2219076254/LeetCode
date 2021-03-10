import java.util.*;

public class partition {
    public static void main(String[] args) {
        System.out.println(partition("aba"));
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> temp = new ArrayList<>();
        backtrack(s, 0, temp, ans);
        return ans;
    }

    public static void backtrack(String s, int start, List<String> temp, List<List<String>> ans) {
        int n = s.length();
        if(start == n) {
            List<String> a = new ArrayList<>(temp);
            ans.add(a);
        }
        for(int i=start; i<n; i++){
            if(isPalindrome(s, start, i)){
                temp.add(s.substring(start, i+1));
                backtrack(s, i+1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int left, int right) {
        int i = (right + left) / 2;
        int j = (right + left + 1) / 2;
        while (i>=left && j<=right && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return right - left == j - i - 2;
    }
}
