public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse(2147483647));
    }

    public static int reverse(int x) {
        long ans = 0;
        while(x != 0){
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        if(ans > 2147483647 || ans < -2147483648) return 0;
        else return (int) ans;
    }
}
