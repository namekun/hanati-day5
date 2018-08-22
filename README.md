# hanati-180822-day5

---

### 어제에 이어서 Array

---

* document 주석 자동완성(method별로) - alt + shift + j
* 변수를 한꺼번에 바꿔주는 단축키 - alt + shift + r

## Array 어제 한 Copy, Sort의 Method를 만들어보자

*day5_180822_ArrayStudy/ArrayUtil.java*

```java
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
	 * @return 복사된 배열
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
	 * return값이 필요 없기에 void
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
```

* call by reference?

  Call by Reference는 매개 변수의 원래 주소에 값을 저장하는 방식이다. Java에서는 클래스 객체를 인수로 전달한 경우에만 Call by Reference로 처리한다.

  ```java
  public class CallByValue {
          public static void swap(int x, int y) {
                 int temp = x;
                 x = y;
                 y = temp;
          }
          
  public static void main(String[] args) {
                 int a = 10;
                 int b = 20;
                 System.out.println("swap() 메소드 호출 <전>: a="+a+", b="+b);
                 swap(a,b);
                 System.out.println("swap() 메소드 호출 <후>: a="+a+", b="+b);
          }
  }
  ```

* call by Value!

  Java에서 인수로 기본 데이터형을 사용하면 모두 Call by Value가 된다. Call by Value는 주어진 값을 복사하여

  처리하는 방식이다. 따라서 메소드 내의 처리 결과는 메소드 밖의 변수에는 영향을 미치지 않는다.

  ```java
  class Number {
          public int a;
          public int b;
  }
  
  public class CallByReference {
          public static void swap(Number z) {
                 int temp = z.a;
                 z.a = z.b;
                 z.b = temp;
          }
  
          public static void main(String[] args) {
                 Number n = new Number();
                 n.a = 10;
        		  n.b = 20;
  	          System.out.println("swap() 메소드 호출 <전>: a="+n.a+", b="+n.b);
         		  swap(n);
         		  System.out.println("swap() 메소드 호출 <후>: a="+n.a+", b="+n.b);
          }
  }
  ```



  **[출처]** [▣ JAVA - Call by Value, Call by Reference](http://blog.naver.com/clown7942/110121061770)

---

## 2차원 배열

* 선언 

  ```java
  int[][] twoDim;
  ```

* 생성

  ```java
  twoDim = new int[2][5] // 세로 2, 가로 5의 2차원 배열 생성
  ```

* 초기화

  ```java
  twoDim[0][0] = 1;
  twoDim[0][1] = 2;
  twoDim[0][2] = 3;
  twoDim[0][3] = 4;
  twoDim[0][4] = 5;
  twoDim[1][0] = 6;
  twoDim[1][1] = 7;
  twoDim[1][2] = 8;
  twoDim[1][3] = 9;
  twoDim[1][4] = 10;
  ```

* 선언, 생성, 초기화를 동시에

  ```java
  int[][] twoDim = {{1,2,3,4,5},{6,7,8,9,10}}
  ```

* 다른 데이터 타입도 뭐..당연히 가능

  ```java
  char[][] charTwoDim = {{'a','b'},{'c','d'}}
  ```

* 2차원 배열 예시

*ArrayExample2*

```java
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
```

---

Quiz - Stack을 Array로 만들어보자

*내꺼*

```java
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
```

*희진's*

```java
/**
 * LIFO 구조의 스택 구현
 * @author 조희진
 *
 */
public class Stack {
   private int[] array;
   int index=-1;
   
   /**
    * @param num   배열 크기
    */
   Stack(int num){
      array = new int[num];
   }
   
   /**
    * @param value   stack에 들어갈 값
    */
   public void push(int value) {
      index++;
      array[index] = value;
      
   }
   
   /**
    * @return   stack에서 꺼낼 값
    */
   public int pop() {
      int popval =  array[index];
      array[index]=0;
      index--;
      return popval;
      
   }
   
   /**
    * @return   stack 길이
    */
   public int length() {
      int len;
      if(index<0) {
         len = 0;
      }
      else {
         len = index+1;
      }
      
      return len;
   }
   
   public static void main(String[] args) {
      Stack stack = new Stack(100);
      stack.push(5);
      stack.push(1);
      System.out.println(stack.length());
      stack.push(9);
      
      // 테스트를 위한 출력
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());

      System.out.println(stack.length());
      
      
   }

}
```

---

## 레퍼런스 타입의 배열 선언, 생성, 초기화

```java
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
```

* 클래스 캡슐화

  클래스를 말 그대로 Compact하게 만들어 줘야한다는 것.

  외부에서 접근하지 말고, 내부에서 접근하게 만들어 줘라. 스스로 처리하게

*ArrayExample4.java*

```java
package day5_180822_ArrayStudy;

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
		for (Account account : accounts) {
			System.out.println(getAccountNum() + " " +getAccountOwner() + " ****" + getRestMoney());
		}
	}
}
```

* 위와 같이 출력하면 있는 은행계좌 말고는 출력할 수 없어서 에러가 난다. 
* 왜냐하면, 배열안에 있는 데이터중 4개의 데이터 이외에는 모두 null값이기 때문.
* 그니까 객체 외부에서 데이터에 접근하려고하니까 이런일이 발생하는 것.
* 저 출력 메소드를 본 객체에서 메소드화 시켜서 만들어주자(캡슐화)

*account.java*

```
...
	public void print() {
		System.out.println(getAccountNum() + " " +getAccountOwner() + " **** " + getRestMoney());
	}
...
```

*AccountExample4.java*

```java
...
    		// 전체 계좌 목록 출력
		for (int i =0; i<idx; i++) {
			accounts[i].print();
		}
...
```

* sysout으로 출력하기보다 그냥 문자열로 포맷해주자...

*Account.java*

```java
...
	public String toString() {
		return getAccountNum() + " " +getAccountOwner() + " **** " + getRestMoney();
	} // 모든 정보를 문자열로 포맷팅
...
```

*ArrayExample.java*

```java
...
    		// 전체 계좌 목록 출력
		for (int i =0; i<idx; i++) {
			System.out.println(accounts[i].toString());
		}
...
```

---

## 캡슐화

캡슐화는 **중요한 데이터를 보존,보호하는 것**입니다.

캡슐화(encapsulation)는 **일반적으로 연관 있는 변수와 함수를 클래스로 묶는 작업**을 말합니다. 그런데 이 작업은 클래스 만드는 작업과 비슷하다고 여길 수도 있다. 하지만 캡슐화에는 은닉성이란게 있어서 클래스에 담는 내용 중 중요한 데이터나 기능을 외부에서 접근하지 못하게 할 수 있다.

일반 OOP에서 지원하는 캡슐화

일반 OOP 언어에서는 접근지정자를 제공

- public
- protected
- private

객체의 필드(속성), 메소드를 하나로 묶고, 실제 구현 내용을 외부에 감추는 것을 말한다.

외부 객체는 객체 내부의 구조를 얻지 못하며 객체가 노출해서 제공하는 필드와 메소드만 이용할 수 있다.

필드와 메소드를 캡슐화하여 보호하는 이유는 외부의 잘못된 사용으로 인해 객체가 손상되지 않도록 하는데 있다.

자바 언어는 캡슐화된 멤버를 노출시킬 것인지 숨길 것인지를 결정하기 위해 접근 제한자(Access Modifier)를 사용한다.

출처:http://webclub.tistory.com/156

---

## 동적 다차원배열

* 자바의 다차원 배열은 "배열의 배열참조"로 구현되기 때문에 다른 언어와 달리 배열이 반드시 "정방행렬"일 필요가 없다.

  ```java
  int[][] twoDim;                         // 선언
  	twoDim = new int[3][];           // 생성
  	twoDim[0] = new int[2]; 
  	twoDim[1] = new int[4];
  	twoDim[2] = new int[1];
  	twoDim[0][0] = 1;                    // 초기화
  	twoDim[0][1] = 2;
  	twoDim[1][0] = 3;
  	twoDim[1][1] = 4;
  // 선언/생성/초기화를 동시에
  	int twoDim[][] = {{1, 2}, {3, 4, 5, 6}, {7}};
  ```

---

### 자바의 명령행 인자 처리

* **Command Line Arguments**

  * main(String[] args) 메소드의의 전달인자(argument)로 들어가는 args  변수를  명령행 인자라고 하며, 사용자가 프로그램을 실행시킬 때 입력 하는 전달인자(java MyProgram ???)를 전달받기  위해 String형의 배열로 선언되어 있다(여러 개의 인자를 처리 가능)
  * 명령행 인자의 개수는 args.length를 통해 구할 수 있다.
  * 개별 인자는 args[0], args[1], args[2] 등으로 접근한다.

  ```java
  package day5_180822_ArrayStudy;
  
  // java FileReader [읽고자 하는 파일명1] [읽고자 하는 파일명2]
  public class FileReader {
  
  	public static void main(String[] args) {
  		if (args.length != 2) {
  			System.out.println("Usage : java FileReader [읽고자하는 파일명1] [읽고자하는 파일명2]");
  			return;
  		} 
  	String fileName1 = args[0];
  	String fileName2 = args[1];
  
  	System.out.println(fileName1);
  	System.out.println(fileName2);
  		
  	}
  
  }
  
  // 실행하려면 Run as - Run Configuration에서 Arguments - Program Argument에 값을 넣어주면 된다.
  ```
