import java.util.Scanner;
final class Solution {
	private Solution() { }
	/* Fill the main function to print resultant of addition of matrices*/
	/**
	 * { function_description }
	 *
	 * @param      args  this is the string
	 */
	public static void main(final String[] args) {
		/** this is the main function**/
		Scanner scan = new Scanner(System.in);
		int size1 = scan.nextInt();
		int size2 = scan.nextInt();
		int[][] arr1 = new int[size1][size2];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = scan.nextInt();

			}
		}
		int size3 = scan.nextInt();
		int size4 = scan.nextInt();
		int[][] arr2 = new int[size3][size4];
		for (int m = 0; m < arr2.length; m++) {
			for (int n = 0; n < arr2[m].length; n++) {
				arr2[m][n] = scan.nextInt();

			}

		}
		int[][] arr3 = new int[size1][size2];
		final int l = 3;
		if (size1 == l && size2 == l) {
			for (int a = 0; a < size1; a++) {
				for (int b = 0; b < size2; b++) {
					arr3[a][b] = arr1[a][b] + arr2[a][b];
					System.out.print(arr3[a][b]);
					if (b < size2 - 1) {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
		} else {
			System.out.println("not possible");
		}
	}
}