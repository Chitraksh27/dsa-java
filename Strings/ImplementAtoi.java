// Java program to convert a string to an integer format without using built-in methods

// Asked by Morgan Stanley, Amazon, Microsoft, Payu, Adobe and Code Brew

public class ImplementAtoi {
    public static int myAtoi(String s) {
        int sign = 1, index = 0, result = 0;

        while (index < s.length() && s.charAt(index) == ' ')
            index++;

        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            if (s.charAt(index) == '-') {
                sign = -1;
                index++;
            }
            index++;
        }

        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > 7)) 
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + (s.charAt(index) - '0');
            index++;
        }

        return result * sign;
    } 
    public static void main(String[] args) {
        String str = "-0012chtr27";

        System.out.println(myAtoi(str));
    }
}