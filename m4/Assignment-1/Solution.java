import java.util.Scanner;
/**
 * program for largest number.
 */
final class Solution {
    /** this the main class.**/
    private Solution() { }
    /** @param args this is the string.**/
    public static void main(final String[] args) {
        /** this the main function.**/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

