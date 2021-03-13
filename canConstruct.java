public class canConstruct {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aba"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        for(char c : magazine.toCharArray()) {
            mag[c - 97]++;
        }
        for(char c : ransomNote.toCharArray()) {
            if(mag[c - 97] <= 0) return false;
            mag[c - 97]--;
        }
        return true;
    }
}
