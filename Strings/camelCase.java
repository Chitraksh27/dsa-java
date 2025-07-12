// Java program to print all words in the dictionary that match with a given pattern pat consiting of uppercase letters

// Asked by Ola Cabs

import java.util.*;

public class camelCase {
    public static List<String> camelCase(String[] arr, String pat) {
        List<String> result = new ArrayList<>();

        for (String word : arr) {
            int i = 0, j = 0;

            while (i < word.length() && j < pat.length()) {
               if (Character.isLowerCase(word.charAt(i)))
                i++;
               else if (word.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
               } 
               else {
                break;
               }
            }
            if (j == pat.length())
                result.add(word);
        }

        return result;
    }
    public static void main(String[] args) {
        String[] arr = {"Hi", "Hello", "HelloWorld", "HiTech", "HiGeek", "HiTechWorld"};
        String pat = "HA";

        System.out.println(camelCase(arr, pat));
    }
}
