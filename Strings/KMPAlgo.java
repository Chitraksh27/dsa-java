// Java program to return all indices of occurrences of one string in another using KMP algorithm

// Asked by Microsoft

import java.util.*;

public class KMPAlgo {
    static void constructLPS(String pat, int lps[]) {
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) 
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        int [] lps = new int[m];

        constructLPS(pat, lps);
        int i = 0, j = 0;

        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                result.add(i - j);
                j = lps[j - 1];
            }

            else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        String txt = "abcab";
        String pat = "ab";

        ArrayList<Integer> indices = search(pat, txt);

        for (Integer in : indices) {
            System.out.print(in + " ");
        }
    }
}
