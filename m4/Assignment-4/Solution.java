import java.util.Scanner;
/** this is the reverse of a string.**/
final class Solution {
       /**this is a program.**/
       private Solution() { }
       /**@param args this is a string.**/
    public static void main(final String[] args) {
        /** this is the string.**/
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**@param reverse1 varaible**/
    /**@return reverse1 variable**/
    static String reverseString(final String reverse1) {
        /** this the function for reverse of string.**/
        String s = "";
        for (int i = reverse1.length() - 1; i >= 0; i--) {
            //System.out.println(reverse.charAt(i));
            s = s + reverse1.charAt(i);
        }
        return s;
    }


}
