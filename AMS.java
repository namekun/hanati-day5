package day5_180822_ArrayStudy;

import java.util.Scanner;

/**
 * 은행 계좌 관리 애플리케이션
 * @author KOSTA
 *
 */

public class AMS {
	public static void main(String[] args) {
		AccountManager AM = new AccountManager(100);
		
	      Account account = new Account("1111-2222-3333", "임다", 1111, 10000);
	      AM.add(account);
	      AM.add(new Account("2222-2222-3333", "선근", 1111, 200000));
	      AM.add(new Account("3333-2222-3333", "백선", 1111, 300000));
	      AM.add(new Account("4444-2222-3333", "다빈", 1111, 400000));
	      AM.add(new Account("5555-2222-3333", "영민", 1111, 1000000));
	      AM.add(new Account("5555-2455-3333", "다빈", 1111, 1000000));

	      Account[] list = AM.list();
	      
	      for (Account account2 : list) {
	         System.out.println(account2.toString());
	      }
	      System.out.println();
	      
	      System.out.println(AM.get("4444-2222-3333"));
	      System.out.println();
	      
	      Account[] search = AM.search("다빈");
	      
	      
	      for (Account account2 : search) {
			System.out.println(account2.toString());
		}
	      System.out.println();
	      
	     AM.remove("1111-2222-3333");
	     Account[] list2 = AM.list();
	     for (Account account2 : list2) {
			System.out.println(account2.toString());
		}
	}
}
