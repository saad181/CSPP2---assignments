import java.util.Scanner;
/**this is a program**/
final class Solution {
	/**this is a program**/
	private Solution() { }

	/**@param args this is a string **/
	public static void main(String[] args) {
		/** this is used for scanning purpose*/
		Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        int result = power(base,exponent);
        System.out.println(result);
	}
	/**
	@param base variable
     @param exponent variable
      
	Need to write the power function and print the output.
	**/
	public static int power(final int base, final int exponent) {
		if (exponent > 0)
		{
			return base * power(base, exponent - 1);
		}
		return 1;
	}
}
