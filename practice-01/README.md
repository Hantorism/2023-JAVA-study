# 1회차 문제

## Practice 1 : 간단한 출력문
<details>

**[문제]** "Hello World!" 출력하기

**[설명]** "Hello World!"를 출력합니다.

**[코드]**
```java
public class Practice01 {
  public static void main(String[] args) {
    // TO DO
    
  }
}
```
</details>

## Practice 2 : 배열 1
<details>

**[문제]** 자바에서 배열 써보기

**[설명]** 1,2,3,4,5를 요소로 갖는 int형 배열을 선언하여, 출력해봅니다.

- **배열이란?**

  **동일한 자료형(Data Type)의 데이터를 연속된 공간에 저장하기 위한 자료구조**이다.

  JAVA에서의 배열은 C언어에서의 배열과 거의 유사하지만, 한 가지 다른 점이 있다.

  C언어에서의 배열은 `int arr[]` 의 방식으로 변수명을 선언하였지만,

  JAVA에서의 배열은 `int arr[]` 뿐만 아니라, `int[] arr` 의 방식도 지원한다.


- **배열을 선언하는 방식**

```java
  1. 생성과 동시에 초기화
  자료형[] 변수 = {데이터1, 데이터2, 데이터3, ... };
  
  int[] array = {0,1,2,3,4}; // for example
  
  2. 크기를 지정해서 생성 후에 할당
  자료형[] 변수 = new 자료형[크기];
  
  int[] num = new int[3]; // 크기가 3인 배열 생성
  num[0] = 0; // 0번 index에 값 할당
  num[1] = 1; // 1번 index에 값 할당
  num[2] = 2; // 2번 index에 값 할당
 ```
**[코드]**
```java
public class Practice02 {
  public static void main(String[] args) {
    // TO DO
    
    System.out.println("num[0] = " + num[0]);
    System.out.println("num[1] = " + num[1]);
    System.out.println("num[2] = " + num[2]);
    System.out.println("num[3] = " + num[3]);
    System.out.println("num[4] = " + num[4]);
  }
}
```
</details>

## Practice 3 : for 문
<details>

**[문제]** 별 찍기

**[설명]** for 문을 이용하여 별 찍기를 진행합니다. 결과는 다음과 같습니다. 자바에서의 for문과 C 에서의 for문의 구조는 대부분 유사합니다.

**[코드]**
```java
public class Practice03 {
  public static void main(String[] args) {
    // TO DO
  }
}

/*
출력 예시

*
**
***
****
*****
******
*******
********
*********

*/
```
</details>

## Practice 4 : 이중 for 문
<details>

**[문제]** 주사위 두 개 던지기

**[설명]** : 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오. 출력 결과는 다음과 같습니다. 

1 + 5 = 6 <br>
2 + 4 = 6 <br>
3 + 3 = 6 <br>
4 + 2 = 6 <br>
5 + 1 = 6 <br>

**[코드]**
```java
public class Practice04 {
  public static void main(String[] args) {
    // TO DO

  }
}

/*
출력결과
1 + 5 = 6
2 + 4 = 6
3 + 3 = 6
4 + 2 = 6
5 + 1 = 6
*/
```
</details>

## Practice 5 : 이중 for each
<details>

**[문제]** 2차원 배열을 for-each 문법을 통해 출력해보자.

**[설명]** 자바에는 C언어와 다르게 배열에 대해서 각각의 요소(element)를 대상으로 접근할 수 있는 문법이 존재한다. <br> 
`iterate`로 사용할 수 있는 자료형은 루프를 돌릴수 있는 자료형(배열 및 ArrayList 등)만 가능하다. 다음과 같은 문법을 통해 반복할 대상에 대해서 index를 1씩 증가시키면서 접근할 수 있다.
  ```java
  // for-each 문법
  for (type var: iterate) { // iterate에서 원소를 하나씩 차례로 꺼내서 var에 할당하고 
      body-of-loop	// body-of-loop를 실행하는 구문.
  }
  
  // 사용 예시
  int [] array = {1,2,3,4};
  for(int element : array) {
          System.out.println(element);
  }
  
  /*
  출력 결과
  1
  2
  3
  4
  */
  ``` 

**[코드]**
```java
public class Practice05 {
  public static void main(String[] args) {
    int[][] dim = {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12}
    };
    
    // TO DO
    
  }
}

/*
출력 예시

1 2 3 4 
5 6 7 8 
9 10 11 12
*/
```

</details>

## Practice 6 : switch 문 1
<details>

**[문제]** switch문 기초 1

**[설명]** 1을 입력할 시에, “1번을 선택하셨습니다.”, 2를 입력할 시에, “2번을 선택하셨습니다.”를 출력합니다. 그 외의 입력의 경우에 return을 통해 프로그램을 종료합니다.

**[코드]**
```java
import java.util.Scanner;

public class Practice06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    switch (num) {
      // TO DO
      
    }
  }
}

/*
출력 예시

1
1번을 선택하셨습니다.
*/
```
</details>

## Practice 7 : switch 문 2
<details>

**[문제]** 자넨 재수강일세.

**[설명]** 학점(알파벳) 입력 시, 소수점으로 바꿔주는 코드다. 

입/출력 예시는 다음과 같다.

| 입력 | 출력 |
| --- | --- |
| A+ | A+ = 4.5 |
| A | A = 4.0 |
| A0 | A0 = 4.0 |
| B+ | B+ = 3.5 |
| B | B = 3.0 |
| B0 | B0 = 3.0 |
| 그 외 | 재수강 |

**[코드]**
```java
import java.util.Scanner;

public class Practice07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a letter grade : ");
    String letterGrade = scanner.nextLine();
    
    double gradePoint;
    
    // TO DO
    
    System.out.println(letterGrade + " = " + gradePoint);
  }
}

/*
출력 예시 1
Enter a letter grade: A
A = 4.0

출력 예시 2
Enter a letter grade: A0
A0 = 4.0

출력 예시 3
Enter a letter grade: C
재수강
*/
```
</details>

## Practice 8 : Scanner 클래스
<details>

**[문제]** : Scanner을 사용하여, 정수 2개를 입력받기

[설명] : 이번 예제는 코딩하는 예제가 아닌 읽어보는 예제입니다.

- Scanner?

  JAVA에서 사용자 입력 또는 파일에 대한 입력은 대부분 Scanner 클래스를 통해 진행합니다. 클래스는 기본적으로 ********객체********를 생성하고, 이를 이용하는 방식으로 진행하므로 Scanner 클래스를 사용하기 위해서는 객체의 생성이 선행되어야 합니다.

  일반적인 객체의 생성 방법 및 사용 방법은 다음과 같습니다.

    ```java
    // 객체 생성 방법
    클래스_이름 객체_이름 = new 클래스_이름();
    Scanner sc = new Scanner(System.in); // System.in은 나중에 다시 언급하겠습니다!
    int num = sc.nextInt(); // 키보드로 입력한 Int형 값을 입력스트림으로부터 가져온다.
    ```

    ```java
    // 실제 사용 방법 1
    import java.util.Scanner; // Scanner 클래스가 존재하는 패키지
    public class Main {
    	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // sc라는 scanner 객체 생성
            int A = sc.nextInt(); // 다음 Int형 데이터를 가져오는 메소드(nextInt)
            sc.close(); // Scanner 객체 sc 종료하기.
        }
    }
    ```

    ```java
    // 실제 사용 방법 2
    import java.util.Scanner;
    
    public class ScannerTest1 {
    	public static void main(String[] args) {
    		int num1 = 0;
    		int num2 = 0;
    		
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.print("첫번쨰 정수 : ");
    		num1 = sc.nextInt();
    		System.out.print("두번쨰 정수 : ");
    		num2 = sc.nextInt();
    		
    		System.out.println("첫번쨰 정수 : "+num1);
    		System.out.println("두번쨰 정수 : "+num2);
    		System.out.print("두 수의 합   : ");
    		System.out.println(num1+num2);
    		sc.close();
    	}
    }
    
    /*
    첫번쨰 정수 : 3
    두번쨰 정수 : 4
    첫번쨰 정수 : 3
    두번쨰 정수 : 4
    두 수의 합   : 7
    */
    ```

</details>

## Practice 9 : Scanner 클래스 2
<details>

**[문제]** Scanner 클래스를 이용하여 입력한 정수에 대해 판단을 진행하자.

**[설명]** Scanner 클래스를 이용하여 0이 아닌 정수 한 개를 입력 받고, 정수가 양수인 경우 “숫자는 양수”를 출력하고, 음수인 경우 “숫자는 음수”를 출력한다.

**[코드]**
```java
import java.util.Scanner;

public class Practice09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // TO DO
  }
}
```
</details>

## Practice 10 : Scanner 클래스 3
<details>

**[문제]** 두 숫자를 입력하면 더한 값을 출력하는 과정을 반복하는 코드를 작성해보자. 

**[설명]** Scanner 클래스를 이용하여 두 양의 정수를 입력 받고, 입력받은 두 수의 합을 출력하는 것을 무한히 반복한다. 종료하려면 -1을 입력한다.

**[코드]**
```java
import java.util.Scanner;

public class Practice10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true) {
      System.out.println("더하기 할 두 숫자를 입력하세요!");
      int num1, num2, result;
      
      // TO DO
      
    }
  }
}

/*
출력 예시

더하기 할 두 숫자를 입력하세요!
1 3
1 + 3 = 4
더하기 할 두 숫자를 입력하세요!
4 5
4 + 5 = 9
더하기 할 두 숫자를 입력하세요!
10 21
10 + 21 = 31
더하기 할 두 숫자를 입력하세요!
-1
*/
```
</details>

## Practice 11: String 클래스 - 이론

<details>

**[문제]** String 클래스

**[설명]** 이번 예제도 코딩하는 예제가 아닌 읽어보는 예제입니다.

- **String 클래스**

  > C언어에서는 문자열을 char형 배열로 표현하지만, 자바에서는 문자열을 위한 String이라는 클래스를 별도로 제공합니다. String 클래스에는 문자열과 관련된 작업을 할 때 유용하게 사용할 수 있는 다양한 메소드가 포함되어 있습니다. - 코딩의 시작, TCP school
  >

  String 또한 앞서 다룬 Scanner와 마찬가지로 클래스에 속한다. 따라서 new 연산자를 통해 생성을 진행하는 것이 일반적이나, 친절한 자바에서는 간단한 방법을 통해 String 객체를 생성할 수 있도록 지원한다.

- String 클래스의 객체 생성 방법

    ```java
    // 방법 1. 다른 클래스와 마찬가지로 new 연산자를 통해 생성하는 방법
    String str = new String("Hello");
    
    // 방법 2. 문자열 리터럴을 직접 할당하여 객체를 생성하는 방법
    String str2 = "Hello";
    ```

- 참고 !

  String 클래스는 **+ 연산자**를 통해 문자열을 합칠 수 있도록 지원한다. 이 때, 이전의 문자열에 추가로 붙이는 것처럼 보이지만, String 객체는 불변이므로 새로운 문자열 리터럴을 생성하여 새롭게 할당한다.

    ```java
    public class StringTest3 {
    
    	public static void main(String[] args) {
    		String str1 = "휴 강";
    		System.out.println(str1);
    
    		String str2 = "의에 늦었네요. 수업 시작하겠습니다.";
    		str1 += str2; // str1에는 str1과 str2의 내용을 합친 문자열이 새롭게 할당된다.
    
    		System.out.println(str1);
    	}
    }
    /*
    출력결과
    휴 강
    휴 강의에 늦었네요. 수업 시작하겠습니다.
    */
    ```
</details>

## Practice 12 : String 클래스 - substring

<details>

**[문제]** 문자열을 잘라봅시다.
**[설명]** String 클래스에 존재하는 **substring** 메소드를 이용하여 주어진 문자열을 자른다.

→ String.substring(start) // 문자열  start위치부터 끝까지 문자열 자르기 <br>
→ String.substring(start, end) // 문자열  start위치 부터 end -1 까지 문자열 발췌
```java
public class StringTest2 {
	public static void main(String[] args) {
		String str = "012345678";
        // TO DO : 
		// 0번째 index부터 2(3-1)번째 index까지
		// 1번째 index부터 문자열 끝까지
	}
}
/*
출력 결과
012
12345678
*/
```
</details>

## Practice 13 : String 클래스를 이용한 for 문

<details>

**[문제]** 자바는! 이게! 되네!

**[설명]** “자바는”, “이게”, “되네”를 갖는 String형 배열 strs를 for-each 방법을 통해 접근하여, 각각의 문자열 끝에 “!”를 붙여서 출력을 진행해보자.

다시 보는 for-each 문법

```java
for (type var : iterate) { // iterate에서 원소를 하나씩 차례로 꺼내서 var에 할당하고 
    body-of-loop           // body-of-loop를 실행하는 구문.
}
```

[코드]

```java
public class StringTest1 {

	public static void main(String[] args) {
		String [] strs = {
				"자바는", "이게", "되네"
		};
		// TO DO with for-loop

		//
	}
}
/*
자바는! 이게! 되네!
*/
```
</details>