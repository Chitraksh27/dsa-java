// Java program to add two binary strings and return resultant string

// Asked by Amazon, Microsoft and Facebook

public class AddBinaryStrings {
    static String addBinary(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1;
        int carry = 0;

        while (carry != 0 || i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += s1.charAt(i--) - '0';
            if (j >= 0)
                sum += s2.charAt(j--) - '0';
            
            result = result.insert(0, sum % 2);
            carry = sum / 2;
        }

        int firstOneIndex = result.indexOf("1");

        if (result.indexOf("1") == -1) {
            return "0";
        }
        return result.substring(firstOneIndex);
    }
    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        System.out.println(addBinary(s1, s2));
    }
}
