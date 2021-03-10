public class myAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }
    public static int myAtoi(String s) {
        if(s == null || s.length() < 1) return 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        long x = 0;
        int index = 0;
        while(index < n){
            if(arr[index] == 32) index++;
            else break;
        }
        if(index == n) return 0;
        if(arr[index] == 45) {
            index++;
            while(index < n && arr[index]>47 && arr[index]<58) {
                x = x * 10 - (arr[index] - 48);
                if (x < -2147483648) return -2147483648;
                index++;
            }
            return (int)x;
        }
        else if(arr[index]==43 || (arr[index]>47 && arr[index]<58)) {
            if(arr[index]==43) index++;
            while(index < n && arr[index]>47 && arr[index]<58) {
                x = x*10 + (arr[index] - 48);
                if(x>2147483647) return 2147483647;
                index++;
            }
            return (int)x;
        }
        else{
            return 0;
        }
    }
}
