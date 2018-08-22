package day5_180822_ArrayStudy;

/**
 * 레퍼런스 타입 배열 선언, 생성, 초기화
 * 
 * @author Namekun
 *
 */

public class ArrayExample3 {
	public static void main(String[] args) {

		String[] teams;
		teams = new String[10];
		teams[0] = "두산 베어스"; // 묵시적 생성이 가능하다.
		teams[1] = "SK 와이번스";
		teams[2] = "한화 이글스";
		teams[9] = "NC 다이노스";

		for (int i = 0; i < teams.length; i++) {
			int count = 0;

			if (teams[i] != null) {
				count = teams[i].length();
			}

			System.out.println((i + 1) + "위 : " + teams[i] + "(" + count + ")");
		}
	}
}
