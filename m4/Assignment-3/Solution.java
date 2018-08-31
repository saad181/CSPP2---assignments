import java.util.Scanner;
/** this is binary to decimal program.**/
final class Solution {
     /** this is a program.**/
     private Solution() { }
     /**@param args this is string.**/
    public static void main(final String[] args) {
        /** this is string.**/
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /**
     * { function_description.}
     *
     * @param      s     {is a variable.}
     *
     * @return     { k }
     **/
    static String binaryToDecimal(final String s) {
        /** this is the function for binary to decimal.**/
        int j;
        int k = 0;
        for (j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '1') {
                k = (int) (k + Math.pow(2, s.length() - 1 - j));
            }
        }
        return k + "";
    }
    }


