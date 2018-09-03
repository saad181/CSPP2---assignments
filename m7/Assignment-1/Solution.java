import java.util.Scanner;
/**
this is the length of the string.
*/
class InputValidator {
    String data;
    private int length;
    /**
     * Constructs the object.
     *
     * @param      da    { for input. }
     */
    InputValidator(final String da) {
         data = da;
        length = da.length();
    }
    /**
     * { function_description }
     *
     * @return     { it returns the true or false. }
     */
    public boolean validateData() {

        int six = 6;
        if (length >= six) {
            return true;
        }
        else {
            return false;
        }
    }
}
public class Solution {
    /**
     * { args is for arguments. }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
    /** this is the main method.**/
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
