// Java program to check if a string is a palindrome sentence

// Asked by Facebook

public class PalindromeSentence {
    static boolean sentencePalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Too hot to hoot";
        System.out.println(sentencePalindrome(s)); 
    }
}
