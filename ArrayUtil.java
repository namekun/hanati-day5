package day5_180822_ArrayStudy;

/**
 * 
 * 배열 관련한 공통 기능 정의
 * 
 */

/**
 * @author KOSTA
 *
 */
/**
 * @author KOSTA
 *
 */
public class ArrayUtil {
	
	/**
	 * 배열 복사를 Method형태로
	 * @param arr - 복사하고자 하는 원본 배열
	 * @param increment - 증가치
	 * @return 복사된 배열
	 */ 
	public static int[] copyArray(int[] arr, int increment){
		int[] copy_array = new int[arr.length + increment];
		for (int i = 0; i < arr.length; i++) {
			copy_array[i] = arr[i];
		}
		return copy_array;
	}
	
	/**
	 * Method overloading
	 * 배열된 복사를 그대로 같은 크기로 복사한다
	 * @param arr
	 * @return
	 */
	public static int[] copyArray(int[] arr){
		int[] copy_array = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy_array[i] = arr[i];
		}
		return copy_array;
	}
	
	
	/**
	 * Array 오름차순 정렬
	 * @param arr - 정렬할 배열
	 * @return
	 */
	public static void ArraySort(int[] arr) {
		int tmp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 7, 8};
		int[] copiedArray = ArrayUtil.copyArray(array, 5);
		for(int i : copiedArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		ArrayUtil.ArraySort(copiedArray);
		for(int i : copiedArray) {
			System.out.print(i + " ");
		}
		
	}
	
}
