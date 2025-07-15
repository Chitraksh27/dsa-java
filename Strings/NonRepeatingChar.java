// Java program to find the first non-repeating character in a string

// Asked by Flipkart, Amazon, Microsoft, D-E-Shaw, MakeMyTrip, Ola Cabs, Payu, Teradata, Goldman Sachs, MAQ Software, InfoEdge, OATS Systems and Tejas Network

public class NonRepeatingChar {
    static char nonRepeatingChar(String s) {
        int n = s.length();

        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "racecar";

        System.out.println(nonRepeatingChar(s));
    }
}
