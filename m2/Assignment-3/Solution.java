import java.util.Scanner;
/**this is a program.**/
final class Solution {
/**this is a program.**/
    private Solution() { }
/**@param args this is a string **/
    public static void main(final String[] args) {
        /** this is used for scanning purpose.*/
        Scanner s = new Scanner(System.in);
        long base = s.nextLong();
        long exponent = s.nextLong();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
    @param base variable
     @param exponent variable
     @return value is 1
      Need to write the power function and print the output.
    **/
    public static long power(final long base, final long exponent) {
        if (exponent > 0) {
            return (base * power(base, exponent - 1));
        }
        return 1;
    }
}
