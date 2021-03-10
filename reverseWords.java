import java.util.*;

public class reverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("  sd  jj  "));
    }

    public static String reverseWords(String s) {
        int n = s.length();
        int index = 0;
        Deque<String> stack = new LinkedList<>();
        while(index<n){
            while(index<n && s.charAt(index)==32){
                index++;
            }
            int start = index;
            while(index<n && s.charAt(index)!=32){
                index++;
            }
            if(start < n) stack.push(s.substring(start, index));
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
            ans.append(" ");
        }
        ans.delete(ans.length()-1, ans.length());
        return ans.toString();
    }
}
