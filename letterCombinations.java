import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    static char[][] table = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}};

    static int[] l = {0, 0, 3, 3, 3, 3, 3, 4, 3, 3};

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        List<String> last;
        int len = digits.length();
        for(int i=0; i<len; i++) {
            last = ans;
            int num = digits.charAt(i) - '0';
            ans = new ArrayList<>();
            for (int j=0; j<l[num]; j++) {
                if (last.size() == 0) {
                    ans.add(String.valueOf(table[num][j]));
                }
                else {
                    for(String item: last) {
                        ans.add(item+table[num][j]);
                    }
                }
            }
        }
        return ans;
    }
}
