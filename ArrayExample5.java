package day5_180822_ArrayStudy;

import java.util.Scanner;

import day4_180821_OopStudy.AccountExample;

/**
 * 레퍼런스 타입 배열 선언, 생성, 초기화 다차원배열
 * 
 * @author Namekun
 *
 */

public class ArrayExample5 {
	public static void main(String[] args) {
		String[][] array = new String[3][100];
		array[0][0] = "AAA";
		array[2][0] = "ZZZ";
		
		//String[][] array2 = new String[][]{{"a","b","c"},{"d","e","f"},{"g","h","i"}};
		String[][] array2 = {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
	}
}
