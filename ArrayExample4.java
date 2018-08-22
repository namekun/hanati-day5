package day5_180822_ArrayStudy;

import java.util.Scanner;

import day4_180821_OopStudy.AccountExample;

/**
 * 레퍼런스 타입 배열 선언, 생성, 초기화
 * 
 * @author Namekun
 *
 */

public class ArrayExample4 {
	public static void main(String[] args) {
		// Account account = new Account("1111-2222-3333","임다", 1234, 100000);
		Account[] accounts = new Account[100];
		int idx = 0;
		
		//은행 계좌 개설
		accounts[idx] = new Account("1111-2222-3333","임다", 1234, 100000); idx++;
		accounts[idx] = new Account("1334-5552-3232","하이", 1324, 600000); idx++;
		accounts[idx] = new Account("1656-4562-3768","이후", 4321, 700000); idx++;
		accounts[idx] = new Account("2342-2456-7878","호호", 1675, 9000000); idx++;
		
		// 전체 계좌 목록 출력
		for (int i =0; i<idx; i++) {
			System.out.println(accounts[i].toString());
		}
		
		// 계좌번호로 계좌 조회
		String num = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("검색하고 싶은 계좌번호를 입력해주세요 : ");
		num = sc.nextLine();
		
		Account account = null;
		for (int i = 0; i < idx; i++) {
//			Account acc = accounts[i];
//			String numm = acc.getAccountNum();
//			boolean eq = numm.equals(num);
			if(accounts[i].getAccountNum().equals(num)) { // == 이걸로 비교하면 주소값비교하는거라서 안됩니다. equals로 하면 true, false로 나오기 때문에 훨씬 간단하게 비교가능.
				account = accounts[i];
				break;
			}
		}
		
		if(account != null) {
			System.out.println(account.toString());
		} else {
			System.out.println("검색된 계좌는 존재하지 않는 계좌입니다.");
		}
		
	}
}
