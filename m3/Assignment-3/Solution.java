
import java.util.Scanner;
/*this is a program.*/
final class Solution {
/** this is a main class.**/
    private Solution() { }
    /*@param this is a string*/
    public static void main(final String[] args) {
       /* this is used for scanning purpose.*/
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        //gcd(n1,n2);
        System.out.println(gcd(n1, n2));
    }
    /**.
     * { function_description }.s
     *
     * @param      n1    The value of first number
     * @param      n2    The value of second number
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(final int n1, final int n2) {
    /** this method is for greatest common divisor.*/
        for (int i = n1; i > 1; i--) {
            if (n1 % i == 0) {
                if (n2 % i == 0) {
                    return i;
                }
                }

            }
        return 1;
        }

    }
