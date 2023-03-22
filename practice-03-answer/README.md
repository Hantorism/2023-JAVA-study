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

일반적인 자료형의 경우 값을 할당하기 위해 값을 만드는 과정이 단순히 0과 같이 입력하면 되지만,
사용자 정의 자료형은 클래스의 경우 new 연산자와 `생성자`를 이용해야하기 때문에 다른점이 존재하는 것이다.


**[코드]**

Card 객체를 배열에 선언하여, for 문을 통해서 배열 전체에 객체를 할당하는 코드입니다.

```java
public class Practice0{
    public static void main(String[] args){
      Card[] Deck = new Card[54]; // Card 객체를 배열에 선언

      int a;
      for(a = 0; a < 13; a++) {
          Deck[a] = new Card("SPADE", "BLACK", a+1); 
      }
      for(a = 13 * 1 ; a < 13 * 2 ; a++) {
          Deck[a] = new Card("DIAMOND", "RED", a - 13*1 + 1);
      }
      for(a = 13 * 2 ; a < 13 * 3 ; a++) {
          Deck[a] = new Card("HEART", "RED", a - 13*2 + 1);
      }
      for(a = 13 * 3; a < 13 * 4 ; a++) {
          Deck[a] = new Card("CLOVER", "BLACK", a - 13*3 + 1);
      }
      Deck[52] = new Card("JOKER", "RED", -1);
      Deck[53] = new Card("JOKER", "BLACK", -1);

      for(a = 0; a < 54; a++) {
          System.out.println(Deck[a].toString());
      }
    }
}

class Card{ 
    String suit; // diamond, heart, clover, spade, joker
    String color; // red, black
    int rank; // a + 2~10 + j, q, k --> 1 ~ 13

  Card(String suit, String color, int rank){
      this.suit = suit;
      this.color = color;
      this.rank = rank;
  }

  public String getSuit() {
      return suit;
  }

  public String getColor() {
      return color;
  }

  public int getRank() {
      return rank;
  }

  public String toString() {
      return this.suit + " " + this.color + " " + this.rank;
  }

}
```

</details>
<br>

## Practice 1 : 객체 배열 예제 1

<details>
<summary> 문제 설명</summary>

**[문제]** 조장은 사다리 타기로 뽑을까요?

**[설명]** 

- 요구사항 1. Student 클래스를 작성하세요.
  - 멤버 변수로는 이름(name), 학번(studentID), 전공(major)이 포함됩니다.
- 요구사항 2. Student 객체를 5개 담을 수 있는 배열을 선언하여, 객체를 담아줍니다.
  - 학생들에 대한 정보는 다음과 같습니다.
  
  |학생 이름| 학번        | 전공        | 
  |-----------|-----------|---|
  |김자바| 202220736 | software  |
  |박홍길| 202220712 | software  |
  |최원딤| 202020842 | Mathematics |
  |이장원| 201320712 | economics |      
  
  

**[코드]**

```java
public class Practice01{
  public static void main(String[] args){
    Student[] group = new Student[4];
    // TO DO : assign student instance to array with information
    group[0] = new Student("김자바", 202220736, "software");
    group[1] = new Student("박홍길", 202220712, "software");
    group[2] = new Student("최원딤", 202020842, "Mathematics");
    group[3] = new Student("이장원", 201320712, "economics");
    //
    
    for(int a = 0; a < 4; a++){
      System.out.println(group[a].name + " " + group[a].studentID + " " + group[a].major);
    }
    
    int captain = (int)(Math.random() * 4); // 0부터 4까지 무작위로 조장 선정
    System.out.println(group[captain].name + " 조장님 잘 부탁드려요~");
  }
}

class Student{
  // TO DO : make variable
  public String name;
  public int studentID;
  public String major;

  public Student(String name, int studentID, String major){
    this.name = name;
    this.studentID = studentID;
    this.major = major;
  }
}

```

출력 결과 :
(마지막 문장은 4명 중에 무작위로 선정됩니다.)

김자바 202220736 software <br>
박홍길 202220712 software <br>
최원딤 202020842 Mathematics <br>
이장원 201320712 economics <br>
최원딤 조장님 잘 부탁드려요~ <br>



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

## Practice 3 : private 접근 제어자

<details>
<summary> 문제 설명</summary>

**[문제]** private.. 그거 어떻게 쓰는건데..

**[설명]** 이전 시간에 수업한 접근 제어자 관련 예제이다.

변수나 메서드의 사용 권한은 다음과 같은 접근 제어자를 사용하여 설정할수 있다.

1. private
2. default
3. protected
4. public

접근 제어자는 private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다. 하나씩 순서대로 살펴보자.

>### private : 해당 클래스에서만 접근 가능
>접근제어자가 private으로 설정되었다면 private 이 붙은 변수, 메서드는 해당 클래스에서만 접근이 가능하다.
>### default : 같은 패키지에서만 접근 가능
>접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수, 메서드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능하다.
>### protected : 같은 패키지 또는 해당 클래스를 상속 받은 클래스
>접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메서드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근이 가능하다.
>### public : 어디에서나 접근 가능
>접근제어자가 public으로 설정되었다면 public 접근제어자가 붙은 변수, 메서드는 어떤 클래스에서라도 접근이 가능하다.
>
>[출처] : https://wikidocs.net/232 (점프 투 자바)
**[코드]**

```java
public class Practice03{
    public static void main(String[] args){
        
    }
}
```

</details>

<br>
