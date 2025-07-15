// Java program to check if one string is a rotation of another

// Asked by Oracle and Adobe

public class StringRotations {
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String temp = s1 + s1;

        return temp.contains(s2);
    }
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(areRotations(s1, s2));
    }
}
