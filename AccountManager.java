package day5_180822_ArrayStudy;

import java.util.Scanner;

/**
 * 배열을 이용한 은행 계좌 관리 코드
 * 
 * @author KOSTA
 *
 */

public class AccountManager {
	private Account[] accounts;
	private int cnt = 0;

	public AccountManager(int capacity) {
		accounts = new Account[capacity];
	}

	/**
	 * @param account
	 */
	public void add(Account account) {
		accounts[cnt] = account;
		cnt++;
	}

	/**
	 * @return 실제 값이 들어가 있는 것만 반환하도록 한다.
	 */
	public Account[] list() {
		Account[] val = new Account[cnt];
		for (int i = 0; i < cnt; i++) {
			val[i] = accounts[i];
		}
		return val;
	}

	/**
	 * @param accountNum // 중복될 수 없는 값이다.
	 * @return
	 */
	public Account get(String accountNum) {
		// 계좌번호로 계좌 조회
		Account tmp = null;
		
		// 계좌번호랑 일치하는 값이 존재한다면, tmp에 넣어준다
		for (int i = 0; i < cnt; i++) {
			if (accounts[i].getAccountNum().equals(accountNum)) {
				tmp = accounts[i];
				break;
			}
		}
		return tmp;
	}

	/**
	 * @param accountOwner
	 * @return
	 */
	public Account[] search(String accountOwner) {
		// 들어가있는 데이터개수를 새서 그 크기만큼 만들어준다.
		int idx = 0;
		for (int i = 0; i < cnt; i++) {
			if (accounts[i].getAccountOwner().equals(accountOwner)) {
				idx++;
			}
		}
		//크기에 맞는 배열을 만들어준다.
		Account[] result = new Account[idx];
		
		//값을 넣어준다.
		int resIdx = 0;
		for (int i = 0; i < cnt; i++) {
			if (accounts[i].getAccountOwner().equals(accountOwner)) {
				result[resIdx] = accounts[i];
				resIdx++;
			}
		}
		return result;
	}

	/**
	 * 계좌번호에 해당하는 데이터를 제거한다.
	 */
	public boolean remove(String accountNum) {

		for (int i = 0; i < cnt; i++) {
			// 해당하는 데이터 null값으로 초기화
			if (accountNum.equals(accounts[i].getAccountNum())) {
				accounts[i] = null;
			}
			// index를 한칸 씩 앞으로 당기자
			for (int j = i; j < cnt - 1; j++) {
				accounts[j] = accounts[j + 1];
			}
			accounts[cnt] = null;
			cnt--;
			return true;
		}
		
		return false;
	}

}
