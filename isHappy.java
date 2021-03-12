import java.util.*;

public class isHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        int next = getNext(n);
        while(next != 1){
            if(set.contains(next)) return false;
            set.add(next);
            next = getNext(next);
        }
        return true;
    }

    public static int getNext(int n) {
        int next = 0;
        while(n != 0){
            next += (int) Math.pow(n%10, 2);
            n /= 10;
        }
        return next;
    }
}
