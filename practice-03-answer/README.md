# 3회차 문제

## Practice 0 : 객체를 배열에 담아보자.

<details>
<summary>문제 설명</summary>

**[문제]** 이론 설명입니다. 천천히 읽어주세요

**[설명]** 배열의 선언 방식은 다음과 같다. -> **practice-01 README.md** 내용 !

- **배열이란?**

  **동일한 자료형(Data Type)의 데이터를 연속된 공간에 저장하기 위한 자료구조**이다.

  JAVA에서의 배열은 C언어에서의 배열과 거의 유사하지만, 한 가지 다른 점이 있다.

  C언어에서의 배열은 `int arr[]` 의 방식으로 변수명을 선언하였지만,

  JAVA에서의 배열은 `int arr[]` 뿐만 아니라, `int[] arr` 의 방식도 지원한다.


- **배열을 선언하는 방식**

```java
  1. 생성과 동시에 초기화
  자료형[] 변수명 = {데이터1, 데이터2, 데이터3, ... };
  
  int[] array = {0,1,2,3,4}; // for example
  
  2. 크기를 지정해서 생성 후에 할당
  자료형[] 변수명 = new 자료형[크기];
  
  int[] num = new int[3]; // 크기가 3인 배열 생성
  num[0] = 0; // 0번 index에 값 할당
  num[1] = 1; // 1번 index에 값 할당
  num[2] = 2; // 2번 index에 값 할당
 ```

여기까지가 practice-01에서 적어둔 배열에 관한 내용이다.

이전까지 실습으로 다룬 내용으로 **클래스를 사용자 정의 자료형**라는 것을 파악할 수 있었다. 
사용자가 정의하는 대로 멤버 변수가 구성되고,매소드 또한 사용자의 정의대로 존재하는 것을 생각해보자.
그렇다면 위의 `자료형` 자리에 사용자 정의 자료형인 `클래스`의 이름이 들어간다면 어떻게 될까?

####  객체들을 배열에 담는 방법은 다음과 같다.
  ```java
    자료형[] 변수명 = new 자료형[크기];
    클래스이름[] 변수명 = new 클래스이름[크기];
    
    int[] num = new int[3]; // int형 데이터가 들어가며, 크기가 3인 배열 num 생성
    num[0] = 0; // 0번 index에 값 할당
    num[1] = 1; // 1번 index에 값 할당
    num[2] = 2; // 2번 index에 값 할당
  
    Card[] deck = new Card[30]; // Card형(Card 객체)이 들어가며, 크기가 30인 배열 deck 생성
    deck[0] = new Card("RED", spade, 1); // 0번 index에 값 할당(여기선 생성자를 통해 객체를 생성하여 할당)
    deck[1] = new Card("Black", diamond, 5); // 1번 index에 값 할당
          ...
    deck[29] = new Card("RED", heart, 3); // 29번 index에 값 할당
  ```

일반적인 자료형을 배열에 담는 과정과 큰 틀은 완전히 동일하다.

1. 크기를 지정하여 배열을 생성한다.
2. 배열의 각각 index에 값을 할당한다.

다만 여기서 2번의 과정이 객체를 담기 때문에 조금은 복잡해진 것뿐이다.

`num[0] = 0` ~~> `deck[0] = new Card[]`

일반적인 자료형의 경우 값을 할당하기 위해 값을 만드는 과정이 단순히 0과 같이 입력하면 되지만, 사용자 정의 자료형은 클래스의 경우 new 연산자와 `생성자`를 이용해야하기 때문에 다른점이 존재하는 것이다.


**[코드]**

```java
public class Practice0{
    public static void main(String[] args){
            
    }
}
```

</details>
<br>

## Practice 1 : 객체 배열 예제 1

<details>
<summary> 문제 설명</summary>

**[문제]**

**[설명]**

**[코드]**

```java
public class Practice01{
    public static void main(String[] args){
        
    }
}
```

</details>

<br>

## Practice 2 : 객체 배열 예제 2

<details>
<summary> 문제 설명</summary>

**[문제]**

**[설명]**

**[코드]**

```java
public class Practice02{
    public static void main(String[] args){
        
    }
}
```

</details>

<br>

## Practice 3 : 객체 배열 예제 3

<details>
<summary> 문제 설명</summary>

**[문제]**

**[설명]**

**[코드]**

```java
public class Practice03{
    public static void main(String[] args){
        
    }
}
```

</details>

<br>
