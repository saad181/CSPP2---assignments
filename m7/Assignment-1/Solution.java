import java.util.*;
class InputValidator
{
	String data;
	int length;
	InputValidator(String da) {
		 data = da;
        length = da.length();
	}
	public boolean validateData() {
		if (length >= 6) {
			return true;
		}
		else {
			return false;
		}
		}
		}
public class Solution
{
	public static void main(String [] args)
	/** this is the main method**/
    {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);
    	System.out.println(i.validateData());
    }
}
