import java.util.*;
import java.io.*;
/**
 * Class for solution.
 */
class Solution {
    /**
     * args.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        try {
            File test1 = new File("File1.txt");
            Scanner s = new Scanner(test1);
            String s1 = "";
            while (s.hasNext()) {
                s1 += s.nextLine();

            }
            File test2 = new File("File2.txt");
            s = new Scanner(test2);
            String s2 = "";
            while (s.hasNext()) {
                s2 += s.nextLine();
            }
            String lcs = "";
            for (int i = 0; i < s2.length(); i++) {
                for (int j = i + 1; j <= s2.length(); j++) {
                    if (s1.contains(s2.substring(i, j))) {
                        if (s2.substring(i, j).length() > lcs.length()) {
                            lcs = s2.substring(i, j).replaceAll(" ", "");
                        }
                    }
                }
            }
            final int hundred = 100;
            System.out.println(lcs + "\tand its length is\t" + lcs.length());
            int numerator = lcs.length() * 2 * hundred;
            System.out.println(numerator);
            int denominator = s1.length() + s2.length();
            System.out.println(denominator);
            System.out.println((numerator / denominator));
        } catch (Exception e) {
            System.out.println("Empty Directory");
        }
    }
}
