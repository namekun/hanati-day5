package day5_180822_ArrayStudy;

/**
 * 다차원 배열
 * 
 * @author Namekun
 */

public class ArrayExample2 {
	public static void main(String[] args) {
		char[][] charTwoDim = { { 'a', 'b' }, { 'c' } };

		for (char[] a : charTwoDim) {
			System.out.println(a);
		}

		char[][] TeachArray = new char[10][10];
		TeachArray[0][0] = 'A';
		TeachArray[0][1] = 'C';
		TeachArray[9][2] = 'D';

		for (int i = 0; i < TeachArray.length; i++) {
			for (int j = 0; j < TeachArray[i].length; j++) {
				System.out.print(TeachArray[i][j] + " ");
			}
			System.out.println();
		}

		int[][] arr2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		int[][] gugudan = new int[8][9];

		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan[i].length; j++) {
				gugudan[i][j] = (i + 2) * (j + 1);
				System.out.printf(" %d * %d = %d", i+2,j+1,gugudan[i][j]);
			}
			System.out.println();
		}

	}
}
