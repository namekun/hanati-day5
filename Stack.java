package day5_180822_ArrayStudy;

/**
 * 
 * Stack을 직접 array를 이용해서 만들어보자 Stack은 Last In First Out의 구조
 *
 */
public class Stack {
	private int[] array;

	public Stack(int i) {
		array = new int[i];
	}

	/**
	 * stack에 데이터 삽입
	 * 
	 * @param a - 들어갈 데이터
	 */
	public void push(int a) {
		// 배열안에 값이 0인가? 그럼 값을 삽입
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = a;
				break;
			}
		}
	}

	/**
	 * stack에서 데이터 제거
	 * 
	 * @return
	 */
	public void pop() {
		// 배열에서 값이 0이 아닌 가장 마지막 인덱스를 찾는다.
		int lastIdx = 0;
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] != 0) {
				lastIdx = i;
				break;
			}
		}
		// 그 값을 빼준다.
		int popVal = array[lastIdx];
		array[lastIdx] = 0;
		System.out.printf("Pop! : %d\n", popVal);

	}

	public void length() {
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				cnt++;
			}
		}
		System.out.printf("현재 Stack의 Size는 %d입니다.\n", cnt);
	}

	public static void main(String[] args) {

		// test를 위한 출력
		Stack stack = new Stack(5);
		stack.push(5);
		stack.length();
		stack.push(1);
		stack.length();
		stack.push(9);
		stack.length();
		stack.pop();
		stack.pop();
		stack.pop();

	}
}
