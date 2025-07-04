
import java.util.*;

// Java program to check if two strings are anagrams of each other

// Asked by Flipkart, Directi, Adobe, Google, Nagarro, Media.net

public class Anagram {
    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }
    }
}
