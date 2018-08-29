import java.util.Scanner;
/** this is the program.**/
final class Solution {
/** this is the main class.**/
private Solution() { }
    public static void main(final String[] args) {
        //** main function**/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 1;
        int temp = 0;
        final int ten = 10;
        final int seven = 7;
        for (int i = 1; i <= n; i++) {
            x = i;
            while (x != 0) {
                if (x % ten == seven) {
                    temp = temp + 1;
                }
                x = x / ten;
            }
        }
        System.out.println(temp);
    }
}
