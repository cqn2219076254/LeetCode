import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        char[] x = {'a', 'b', 'c'};
        reverseString(x);
        System.out.println(x);
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<n/2; i++) {
            char c = s[i];
            s[i] = s[n - 1 -i];
            s[n - 1 - i] = c;
        }
    }
}
