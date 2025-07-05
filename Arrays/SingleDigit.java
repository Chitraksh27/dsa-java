// Given an integer n, we need to repeatedly find the sum of its digits until the result becomes a single-digit number

// Asked by Amazon

public class SingleDigit {
    static int singleDigit(int n) {
        if (n == 0)
            return 0;

        if (n % 9 == 0)
            return 9;

        return n % 9;
    }
    public static void main(String[] args) {
        int n = 1234;

        System.out.println(singleDigit(n));
    }
}
