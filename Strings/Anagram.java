
import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);



    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2));
    }
}
