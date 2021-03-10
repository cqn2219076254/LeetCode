import java.util.*;
public class maxEnvelopes {
    public static void main(String[] args) {
        int[][] x = new int[6][2];
        x[0][0] = 1;
        x[0][1] = 3;
        x[1][0] = 3;
        x[1][1] = 5;
        x[2][0] = 6;
        x[2][1] = 7;
        x[3][0] = 6;
        x[3][1] = 8;
        x[4][0] = 8;
        x[4][1] = 4;
        x[5][0] = 9;
        x[5][1] = 5;
        System.out.println(Solution(x));
    }
    public static int Solution(int[][] envelopes) {
        int n = envelopes.length;
        letter[] letters = new letter[n];
        for (int i=0; i<n; i++) letters[i] = new letter(envelopes[i][0], envelopes[i][1]);
        Arrays.sort(letters, new Comparator<letter>() {
            @Override
            public int compare(letter l1, letter l2) {
                if(l1.w == l2.w){
                    return l1.h - l2.h;
                }
                return l1.w - l2.w;
            }
        });
        int max = 1;
        int now = 1;
        int w = letters[0].w;
        int h = -1;
        boolean boo = true;
        for(int i=0; i<n-1; i++) {
            if(boo){
                if(w < letters[i+1].w && letters[i].h < letters[i+1].h){
                    w = letters[i+1].w;
                    h = letters[i+1].h;
                    now += 1;
                    boo = false;
                }
            }
            else {
                if (w < letters[i + 1].w && h < letters[i + 1].h) {
                    w = letters[i + 1].w;
                    h = letters[i + 1].h;
                    now += 1;
                }
            }
        }
        if (now > max) max = now;
        return max;
    }

    static class letter{
        int w;
        int h;
        letter(int w, int h){
            this.w = w;
            this.h = h;
        }
    }
}
