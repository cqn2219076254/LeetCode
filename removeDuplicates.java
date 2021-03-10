import java.util.Deque;
import java.util.LinkedList;

public class removeDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        int n = s.length();
        Deque<Character> characters = new LinkedList<>();
        for(int i=n-1; i>-1; i--) {
            if(characters.isEmpty()) characters.push(s.charAt(i));
            else {
                if(s.charAt(i) == characters.peek()) characters.pop();
                else characters.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!characters.isEmpty()) {
            sb.append(characters.pop());
        }
        return sb.toString();
    }
}
