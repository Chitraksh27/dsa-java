// Java program to check whether a string is a rotation of another string

// Asked by Oracle and Adobe

public class StringRotationsofEachOther {
   public static boolean areRotations(String s1, String s2) {
    if (s1.length() != s2.length())
        return false;
        
    String temp = s1 + s1;

    return temp.contains(s2);
   } 
   public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = "cdab";

    if (areRotations(s1, s2))
        System.out.println("Strings are rotations of each other");
    else 
        System.out.println("Strings are not rotations of each other");
   }
}
