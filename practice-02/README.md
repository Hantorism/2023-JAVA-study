# 2회차 문제

### 이번 회차 예제 중 Practice 1~6는 이전에 작성한 Student 클래스 코드에 추가적으로 작성하는 방식이므로, 작성한 Student 클래스 코드를 다음 문제에도 이용하시면 됩니다.

## Practice 0 : 접근 제어자
<details>

### 접근제어자
자바에는 접근 제어자가 4개 존재한다.

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

그렇다면 간단하게 접근 제어자에 대한 코드를 보고 넘어가도록 하자. 자세한 내용은 다음 회차에서 다룰 예정이다.

**[코드]**
```java
public class public_class {
    //[접근제어자] [자료형] [변수명]
	private int private_var; // private 접근제어자  
	int default_var;        // default 접근제어자
	protected int protected_var; // protected 접근제어자
	public int public_var;  // public 접근제어자
}
class default_class{
    //...    
}

private class private_class{
    //...
}
```

**이번 예제에서는 default( 작성하지 않는 경우 기본 값) 접근 제어자로 코드를 작성할 예정이다.**


</details>
<br>


## Practice 0.5 : 클래스 이론 정리
<details>

**[문제]** 클래스

**[설명]** 이번 예제도 이해를 돕기 위한 예제입니다. 편하게 읽어주세용.

### 자바의 변수
```java
class Variable {
    int instanceV;                 // default 접근제어자, 멤버 변수 중 인스턴스 변수  
    static int StaticV;            // default 접근제어자, 멤버 변수 중 클래스 변수

    void function(int localV1)        // default 접근제어자, 지역변수1 : localV1					
    {
        int localV2;                // default 접근제어자, 지역변수2 : localV2
    }
}
```
- **멤버 변수**

    **클래스 변수**와 **인스턴스 변수**가 존재한다.


- **클래스 변수**

  정의 : 맴버변수 중 static과 함께 선언된 변수 <br>
  특징 : 모든 인스턴스에 대해 공통된 저장공간을 갖기 때문에 항상 공통된 값을 갖는다. <br>
  외부에서 사용하는 경우에도 인스턴스를 생성하지 않고 변수에 바로 접근할 수 있다. ex) Variable.StaticV <br>
  생성시기 : 클래스가 메모리에 로딩되었을 때


- **인스턴스 변수**
  
  정의 : 맴버변수 중 static 없이 선언된 변수 <br> 
  특징 : 각각의 인스터스마다 독립된 값을 다른 저장공간에 갖기 때문에 인스턴스마다 다른 값을 가질 수 있다. <br>
  생성시기 : 인스턴스가 생성되었을 때


- **지역 변수**

  정의 : 맴버변수를 제외한 모든 변수 ex) 메서드 내애서 선언된 변수<br>
  특징 : 클래스의 메서드 내에 선언되어 선언된 블럭( { } )에서만 사용 가능 <br>
  생성시기: 메서드 내의 변수 선언문이 실행되었을 때

여기까지의 내용은 C언어의 구조체 내용과 꽤 유사하다. 추가로 자바의 클래스는 변수뿐만 아니라 `메서드(함수)`또한 갖는다.

### 객체의 정의

1) 사전적 정의: 실제로 존재하는 것
2) 객체지향이론에서의 정의: 실존하는 것뿐만 아니라 개념, 논리와 같은 무형적인 것
3) **프로그래밍에서의 정의: 클래스에 정의된 내용대로 메모리에 생성된 것**

이러한 객체를 생성하기 위해선, 주어진 클래스를 바탕으로 객체를 만들어야한다. 이 과정을 **인스턴스화**라고 부른다.
즉, 객체나 인스턴스나 비슷한 의미를 갖는다. 하지만 특정 클래스로부터 만들어졋다는 의미를 더욱 강조하기 위해 인스턴스라는 표현을 사용한다.

```java
class Cat {
    String Name;  // default 접근 제어자, String 타입으로 선언된 인스턴스 변수 Name
    int Weight;   // default 접근 제어자 ...
    int Age;
    
    
    void Crying(){  // 선언부
      System.out.println("야옹"); // 구현부
    }
    
    void Eat() { // 선언부
      System.out.println("냠냠"); // 구현부 1
      this.Weight += 1;         // 구현부 2
    }
}
```

메서드란 클래스 내의 함수로 특정 작업을 수행하는 동작의 묶음을 의미한다.
메서드는 크게 선언부와 구현부로 구분된다. <br>
선언부에서는 **반환타입** **매서드명** (매개변수)의 구조를 갖는다. <br>

지금까지의 내용을 Crying이라는 메서드에 적용하여 하나하나 분리해보자.

- 선언부 : void Crying()
  - 반환타입 : void
  - 메서드명 : Crying
  - 매개변수 : 없음
- 구현부 : System.out.println("야옹");

( 접근 제어자가 허가한다면 ) 객체의 메서드를 **객체이름.메서드명** 문법을 통해 메서드를 호출할 수 있다.
이렇게 여러 클래스에 대한 기본적인 구조를 설명하였다. 
이를 통해 클래스는 크게 멤버 변수와 메서드로 구분되며, 멤버 변수에는 클래스 변수, 인스턴스 변수가 존재하는 것을 파악할 수 있었다.

이제 클래스를 이용하여 객체를 생성해보는 과정을 진행할 것이다. 사실 이전 실습 시간에서 객체를 생성해본 적이 있다.
String 클래스와 Scanner 클래스를 이용하여 여러 가지 코드를 작성해 보았기 때문이다.

객체는 기본적으로 **new 연산자**를 이용하여 생성된다. new 연산자 + 생성자의 조합으로 클래스가 인스턴스화 된다.
그렇다면 생성자란 무엇일까? 다음 코드를 보자.

```java
class Account{
    int accountNumber;
    String name;
    
    Account(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }
    
    Account(){
        this.accountNumber = 0;
        this.name = null;
    }
}
```

### 생성자란?

  인스턴스(객체)가 생성될 때 호출되는 인스턴스 초기화 메서드이다.
  생성자가 호출 됨으로써 인스턴스의 변수들이 초기화되고, 인스턴스 생성 시 필요한 것들이 실행된다.

  > 참고!! <br> 한가지 주의할 것은 생성자를 통해 인스턴스가 생성되는 것이 아니다.
  생성자는 인스터스의 변수들을 초기화하며 인스턴스 생성 시 필요한 것들을 실행하는 역할이고,
  실제 인스턴스 생성(메모리 상에 생성)은 연산자 new 를 통하여 진행한다.
  > 1. new 연산자를 통해 메모리에 변수명의 이름으로 메모리 할당하여 인스턴스 생성
  > 2. 생성자를 통해 해당 인스턴스의 멤버 변수를 초기화 및 설정

생성자 선언에는 두 가지 규칙이 존재한다.
1) 클래스와 같은 이름으로 만들 것
2) 반환 값을 적지말 것

만약 클래스 내에 생성자가 정의되지 않아있다면, 컴파일러는 자동적으로 기본 생성자를 추가하여 컴파일을 진행한다. 
기본 생성자의 구조는 다음과 같다.

`클래스이름(){ }`

사용자가 생성자를 생성하는 방식에는 여러가지가 존재한다. 매개변수가 존재하는 방식과 매개변수가 존재하지 않는 방식이다.
일반적으로는 매개변수로 입력한 값을 객체의 인스턴스 변수에 할당하여 값을 지정해준다.

추가적인 `this()` 생성자와 `super()` 생성자에 대해선 이후에 다루도록 하겠다.

이제 위의 코드를 아까처럼 하나하나씩 뜯어보자.

- 선언부 : Account(int accountName, String name)
  - 생성자는 항상 메서드명 위치에 클래스의 이름을 적어주어야 한다.
  - 이 생성자는 int형 변수와 String타입 변수를 매개변수로 받는다.
- 구현부1 : this.accountNumber = accountNumber;
  - 클래스 내에서 `this.변수명`을 사용한다면, 객체의 멤버 변수 중 `변수명`에 해당하는 변수에 접근할 수 있다. 예를 들어
`this.name`은 해당 클래스의 `name`이라는 멤버 변수에 접근하는 것이다.
  -  생성하려는 객체의 accountNumber이라는 멤버변수에 매개 변수로 받은 accountNumber의 값을 할당한다.
- 구현부2 : this.name = name;
  - 위의 내용과 동일하게 매개변수로 받은 name을 객체의 변수 중 name에 할당한다.

이제 이를 적용한 코드를 아래에서 보자.

**[코드]**

```java
public class Practice01 {
  public static void main(String[] args) {
      
    // 생성자 1을 이용하여 객체 생성
    Account account1 = new Account(1234, "HANTOR", 100000);
    
    // 생성자 2를 이용하여 객체 생성하고, 각각의 멤버에 접근하여 값 할당
    Account account2 = new Account();
    account2.name = "JAVA";
    account2.money = 1000;
    account2.accountNumber = 5678;
    
    // 두 객체에 존재하는 메서드 호출
    account1.showmethemoney();
    account2.showmethemoney();
  }
}

class Account{
  int accountNumber; // int형으로 선언된 멤버 변수 ( 인스턴스 변수, default 접근 제어자 )
  String name;      // String 타입으로 선언된 멤버 변수 ( 인스턴스 변수, default 접근 제어자 ) 
  int money;        // int형으로 선언된 멤버 변수 ( 인스턴스 변수, default 접근 제어자 )
  
  // 생성자 1 : 매개변수를 이용하여 객체 생성
  Account(int accountNumber, String name, int money){
    this.accountNumber = accountNumber;
    this.name = name;
    this.money = money;
  }
  
  // 생성자 2 : 매개변수를 입력하지 않고 객체 생성
  Account(){
    this.accountNumber = 0; 
    this.name = null;
    this.money = 0;
  }
  
  void showmethemoney() {
    System.out.println(this.name + " : " +this.money);
  }
}
/*
출력 결과
HANTOR : 100000
JAVA : 1000     
*/
```

</details>

<br>

## Practice 1 : 클래스 기초 예제 1

<details>

**[문제]** 다음과 같은 멤버 변수를 갖는 Student 클래스를 선언하시오.

**[설명]**
### 작성할 멤버 변수의 조건들
| 접근제어자   | 타입     | 변수명  | 설명 |
|---------|--------|------|-------|
| default | String | name | 학생의 이름 |
| default | int     | ban    | 반 번호 |
| default | int     | no     | 번호  |
| default | int     | kor    | 국어 성적 |
| default | int     | math   | 수학 성적|
| default | int     | eng    | 영어 성적 |

**[코드]**
```java
class Student{
    // TO DO : 조건에 맞게 Student 멤버 변수 선언하기
    // default 접근 제어자는 작성하지 않는 경우, 자동으로 설정됩니다.
    String name;
    int ban;
    int no;
    int kor;
    int math;
    int eng; 
    //
}
```

</details>
<br>


## Pracitce 2 : 클래스 기초 예제 2

<details>

**[문제]** 멤버 변수의 정보를 가져오는 함수를 작성해보자

**[설명]** 일반적으로 JAVA에서는 멤버 변수에 직접적으로 접근하는 방법을 권장하지 않는다. 이에 관해서는 이후에 다루게 **캡슐화**를 지키기 위함인데, 이에 관해서는 차후에 다루도록 하겠다.

따라서 멤버 변수에 접근하는 메서드를 만들어서, 간접적으로 멤버 변수의 값을 가져오도록 하자. 메서드들의 조건은 다음과 같다.
지금 작성하게 될 메서드들은 모두 멤버 변수를 반환하는 메서드로, 이를 JAVA에서는 getter 메서드라고 칭한다.

### 작성할 메서드의 조건

| 접근제어자   | 메서드명      | 기능                | 반환 타입  | 매개 변수 |
|---------|-----------|-------------------|--------|-------| 
| default | getName() | name 멤버 변수의 값을 반환 | String | 없음    |
| default | getBan()  | ban 멤버 변수의 값을 반환  | int    | 없음    |
| default | getNo()   | no 멤버 변수의 값을 반환   | int    | 없음    |
| default | getKor()  | kor 멤버 변수의 값을 반환  | int    | 없음    |
| default | getMath() | math 멤버 변수의 값을 반환 | int    | 없음    |
| default | getEng()  | eng 멤버 변수의 값을 반환  | int    | 없음    |

**[코드]**
```java
class Practice02 {
  public static void main(String[] args) {
    Student std = new Student();
    std.name = "HANTOR";
    std.ban = 2;
    std.no = 4;
    std.kor = 100;
    std.math = 90;
    std.eng = 95;

    System.out.println("학생의 이름 : " + std.getName());
    System.out.println("학생의 반 : " + std.getBan());
    System.out.println("학생의 번호 : " + std.getNo());
    System.out.println("국어 성적 : " + std.getKor());
    System.out.println("수학 성적 : " + std.getMath());
    System.out.println("영어 성적 : " + std.getEng());
  }
    
}

class Student{
  // Have to Paste Practice 01 code. 
    
  // TO DO : make getter method

  //
}
```


</details>


<br>

## Practice 3 : 클래스 기초 예제 3
<details>

**[문제]** 클래스에 메서드 추가하기

**[설명]** 조건에 맞게 3개의 메서드를 선언해보자.


### 작성할 메서드의 조건
| 접근 제어자  | 메서드명  | 기능                         | 반환 타입  | 매개 변수 |
|---------|-------|----------------------------|--------|-----|
| default | getTotal    | kor, eng, math의 값을 모두 더한다. | int    | 없음  |
| default | getAverage | 총점을 과목 수로 나눈 평균 값을 구한다.    | double | 없음  |
| default | getInfo | Practice 2의 출력 결과를 출력한다.   | void   | 없음 |

**[코드]**
```java
class Practice03 {
    public static void main(String args[]) {
      Student std = new Student(); // 기본 생성자를 통해 객체 생성하기
      std.name = "Hantor"; // 멤버 변수에 직접 접근하여 값 할당하기
      std.ban = 2;
      std.no = 4;
      std.kor = 90;
      std.math = 100;
      std.eng = 95;
      
      std.getInfo();
      System.out.println("학생의 총점:"+std.getTotal());
      System.out.println("학생의 평균:"+std.getAverage());
    }
}

class Student{
    // Have to Paste Practice 02 code.

    // TO DO : Make getTotal(), getAverage(), getInfo() Method
  
    //

}
```
</details>

<br>

## Practice 4 : 클래스 기초 예제 4
<details>

**[문제]** 생성자를 선언하여 Student 객체를 생성해보자.

**[설명]** JAVA에서는 객체를 생성하기 위해 `생성자`를 이용하여 객체를 생성한다. 앞서 다룬 Practice 2,3에서는 객체 생성 시, 기본으로 존재하는 기본 생성자 `Student() { };` 를 이용하여 객체를 생성하였다.
이제 생성자를 클래스에 직접 작성하고, 작성한 생성자로 객체를 생성하자.

### 작성할 생성자의 조건

| 메서드명    | 기능                      | 반환 타입   | 매개 변수 |
|---------|-------------------------|---------|-----|
| Student | Student 멤버 변수의 값을 할당한다. | 작성하지 않음 | Student의 모든 멤버 변수 |

### 새롭게 생성할 객체의 조건

| 변수명  | name  | ban  | no | kor | eng | math |
|------| --- | --- | --- | --- |-----| --- |
| std2 | "본인 이름" | 2 | 4 | 100 | 90  | 95 | 

**[코드]** 
```java
class Practice04 {
  public static void main(String args[]) {
    Student std = new Student("Hantor", 1, 30, 90, 88, 100);
    // TO DO : 직접 작성한 생성자로 객체를 하나 더 만들어보자 !
    
    //

    System.out.println("정보:"+std.getInfo());
    System.out.println("총점:"+std.getTotal());
    System.out.println("평균:"+std.getAverage());
    System.out.println();
    System.out.println("정보:"+std2.getInfo());
    System.out.println("총점:"+std2.getTotal());
    System.out.println("평균:"+std2.getAverage());
  }
}
class Student {
  // Have to Paste Practice 03 code.
  
  // TO DO : Student 객체 생성자 작성하기
  
  //
}
```
</details>

<br>

## Practice 5 : 클래스 기초 예제 5

<details>

**[문제]** 생성자의 응용

**[설명]** 클래스에 새로운 멤버 변수를 추가하자. `String` 타입으로 `level`이라는 변수명을 가진 변수이다.
그리고 앞서 만든 생성자의 코드에서 `level`에 들어가는 데이터를 설정도록 수정하자. 조건은 다음과 같다.

- 평균이 90점 이상인 경우 "상"
- 평균이 80점 이상 90점 미만인 경우 "중"
- 평균이 80점 미만인 경우 "하"로 정한다.

**[코드]**
```java
class Practice05{
  public static void main(String args[]) {
    Student std = new Student("Hantor", 1, 30, 90, 88, 100);
    
    System.out.println("정보:"+std.getInfo());
    System.out.println("총점:"+std.getTotal());
    System.out.println("평균:"+std.getAverage());
    System.out.println("수준:"+std.level);
  }
}
class Student {
  // Have to Paste Practice 04 code.
  
  // TO DO : level 변수 추가 및 생성자 수정
  
  //
}
```
</details>

<br>

## Practice 6 : 클래스 기초 예제 6
<details>

**[문제]** 어떻게 사람 이름이..

**[설명]** 항상 남을 돕는 박한터는 이름 때문에 힘들어하는 친구를 위해서 메서드를 작성하고자 한다. 
하지만 모든 친구들의 이름을 바꿔주는 건 아닌 것 같아서, 조건에 부합하는 이름만 변경해주려고 한다. 조건은 다음과 같다.

### 이름의 조건
1. 이름에 "자바", "객체", "클래스", "변수"가 들어가야 한다.
2. 이름이 3글자 이상이어야 한다.
3. 바꾸려는 이름도 앞의 1,2 조건을 만족해야 한다.

### 메서드의 조건

| 접근 제어자  | 메서드명       | 기능                    | 반환 타입 | 매개 변수 |
|---------|------------|-----------------------------------|-------|-------|
| default | modifyName | 조건에 만족하는 이름이라면, 매개 변수로 입력한 이름으로 변경한다.<br/> 변경하려는 이름이 대한 조건을 먼저 따진 후에, 현재 이름에 대한 조건을 확인한다. | void  | 바꿀 이름 |


**[코드]** 

```java
import java.util.Scanner;

public class Practice06 {
  public static void main(String[] args) {
    Student[] class1 = new Student[30]; // 클래스 배열! 다음 회차에 배웁니다.
    class1[0] = new Student("박자바", 1, 1, 100, 100, 100);
    class1[1] = new Student("김글래스", 1, 2, 100, 100, 100);
    class1[2] = new Student("최변수", 1, 3, 100, 100, 100);
    class1[3] = new Student("리드미", 1, 4, 100, 100, 100);
    class1[4] = new Student("객체", 1, 5, 100, 100, 100);

    Scanner sc = new Scanner(System.in);
    
    for (Student std : class1) {
      System.out.println("학생 이름 변경 전 : " + std.getName());
      String newName = sc.nextLine();
      std.modifyName(newName);
      System.out.println("학생 이름 변경 후 : " + std.getName() + "\n");
    }
  }
}


class Student {
  // Have to Paste Practice 05 code.

  // TO DO : modifyName() 메서드
}
```


</details>

<br>
