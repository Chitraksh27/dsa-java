// Java program to convert an integer to its English words representation.

// Asked by Zoho, Amazon, Microsoft and Oracle

public class IntegertoWords {
    static String convertToWords(int n) {
        if (n == 0)
            return "Zero";

        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String[] multiplier = {"", "Thousand", "Million", "Billion"};

        StringBuilder res = new StringBuilder();
        int group = 0;

        while(n > 0) {
            if (n % 1000 != 0) {
                StringBuilder temp = new StringBuilder();
                int value = n % 1000;

                if (value >= 100) {
                    temp.append(units[value/100]).append(" Hundred ");
                    value %= 100;
                }

                if (value >= 20) {
                    temp.append(tens[value / 10]).append(" ");
                    value %= 10;
                }

                if (value > 0) {
                    temp.append(units[value]).append(" ");
                }

                temp.append(multiplier[group]).append(" ");

                res.insert(0, temp.toString());
            }
            n /= 1000;
            group++;
        }

        return res.toString().trim();
    }
    public static void main(String[] args) {
        int n = 10245;

        System.out.println(convertToWords(n));
    }
}
