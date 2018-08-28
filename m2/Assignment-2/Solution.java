import java.util.Scanner;
/**this is a program.**/
final class Solution {
    /**this is a program.**/
    private Solution() { }
    /**
     *@param args this is a string
    this is a main method
    **/
    public static void main(final String[] args) {
        /**this is used for the scanning purpose**/
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQEquation(a, b, c);
    }
    /**
    @param a variable
     @param b variable
      @param c variable
    Need to write the rootsOfQuadraticEquation function and print the output.**/
    static void rootsOfQEquation(final int a, final int b, final int c) {
        double root1;
        double root2;
        final int four = 4;
        root1 = (-b + (Math.sqrt((b * b) - four *a * c))) / (2 * a);
        root2 = (-b - (Math.sqrt((b * b) - four * a * c))) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
}
