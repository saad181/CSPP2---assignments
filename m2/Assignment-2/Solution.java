import java.util.Scanner;
/**this is a program.**/
public class Solution {
    /**
     *@param args this is a string
    this is a main method
    **/
    public static void main(String[] args) {
        /**this is used for the scanning purpose**/
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
    @param a variable
     @param b variable
      @param c variable
    Need to write the rootsOfQuadraticEquation function and print the output.**/
    static void rootsOfQuadraticEquation(int a, int b, int c)
    {
        double root1;
        double root2;
        root1 = ( - b + (Math.sqrt((b * b) - 4 *a * c))) / (2 * a);
        root2 = ( - b - (Math.sqrt((b * b) - 4 * a * c))) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
}
