import java.util.Scanner;
/**
this is the length of the string.
**/
class InputValidator {
    /**
     * decaring string.
     **/
    private String data;
    /**
     * declaring integer.
     **/
    private int length;
    /**
     * Constructs the object.
     *
     * @param      da    { for input. }
     **/
    InputValidator(final String da) {
         data = da;
        length = da.length();
    }
    /**
     * function_description.
     *
     * @return     { it returns the true or false. }
     **/
    public boolean validateData() {
        /**
         * declaring magic number.
         **/
        final int six = 6;
        if (length >= six) {
            return true;
        }
        return false;
    }
}
/**
 * Class for solution.
 **/
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * { args is for arguments. }
     *
     * @param      args  The arguments
     **/
    public static void main(final String[] args) {
    /** this is the main method.**/
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
