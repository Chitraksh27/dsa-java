// Java program to implement Atoi function to convert a string to an integer

// Asked by Morgan Stanley, Microsoft, Amazon, Payu, Adobe and Code Brew

public class Atoi {
    static int myAtoi(String s) {
        int result = 0, sign = 1, index = 0;

        while (index < s.length() && s.charAt(index) == '0') {
            index++;
        }

        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        while (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            if (s.charAt(index++) == '-')
                sign = -1;
        }

        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <='9') {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = 10 * result + (s.charAt(index) - '0');
            index++;
        }
        return result * sign;
    }
    public static void main(String[] args) {
        String str = "-0012chr4";

        System.out.println(myAtoi(str));
    }
}