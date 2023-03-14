# 2회차 문제

## Practice 1 : 클래스 이론 정리
<details>

**[문제]** 클래스

**[설명]** 이번 예제는 이해를 돕기 위한 예제입니다. 편하게 읽어주세용.

우선 객체의 정의는 다음과 같이 정리할 수 있다.

1) 사전적 정의: 실제로 존재하는 것
2) 객체지향이론에서의 정의: 실존하는 것뿐만 아니라 개념, 논리와 같은 무형적인 것
3) **프로그래밍에서의 정의: 클래스에 정의된 내용대로 메모리에 생성된 것**

이러한 객체를 생성하기 위해선, 주어진 클래스를 바탕으로 객체를 만들어야한다. 이 과정을 **인스턴스화**라고 부른다.
즉, 객체나 인스턴스나 비슷한 의미를 갖는다. 하지만 특정 클래스로부터 만들어졋다는 의미를 더욱 강조하기 위해 인스턴스라는 표현을 사용한다.

자바에 존재하는 변수들 목록은 다음과 같다.
```java
class Variable {
    int instanceV;                 // 멤버 변수 중 인스턴스 변수  
    static int StaticV;            // 멤버 변수 중 클래스 변수

    void function(int localV1)        // 지역변수1 : localV1					
    {
        int localV2;                // 지역변수2 : localV2
    }
}
```
- **멤버 변수**

    **클래스 변수**와 **인스턴스 변수**가 존재한다.


- **클래스 변수**

  정의 : 맴버변수 중 static과 함께 선언된 변수 <br>
  특징 : 모든 인스턴스에 대해 공통된 저장공간을 갖기 때문에 항상 공통된 값을 갖는다. <br>
  외부에서 사용하는 경우에도 인스턴스를 생성하지 않고  바로 접근할 수 있다. ex) Variable.StaticV <br>
  생성시기 : 클래스가 메모리에 로딩되었을 때


- **인스턴스 변수**
  
  정의 : 맴버변수 중 static 없이 선언된 변수 <br> 
  특징 : 각각의 인스터스마다 독립된 값을 저장공간을 갖기 때문에 다른 값을 가질 수 있다. <br>
  생성시기 : 인스턴스가 생성되었을 때


- **지역 변수**

  정의 : 변수들 중 클래스 영역을 제외한 영역에서 선언된 변수로 맴버변수를 제외한 모든 변수<br>
  특징 : 클래스의 메서드 내에 선언되어 선언된 블럭( { } )에서만 사용 가능 <br>
  생성시기: 메서드 내의 변수 선언문이 실행되었을 때

여기까지의 내용은 C언어의 구조체 내용과 꽤 유사하다. 여기서 자바의 클래스는 변수뿐만 아니라 메서드(함수)또한 갖는다.

```java
class Cat {
    String Name;  	
    int Weight;		
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
선언부에서는 **반환타입** **메소드명** (타입 변수명 ...)의 구조를 갖는다. 타입 변수명 ...를 보통 매개변수라고 표현한다. <br>
이를 Crying이라는 메서드에 적용하여 하나하나 분리해보자.

- 선언부 : void Crying()
  - 반환타입 : void
  - 메소드명 : Crying
  - 매개변수 : 없음
- 구현부 : System.out.println("야옹");

객체의 메서드를 이용하기 위해선 **객체이름.메서드명**을 통해 메서드를 호출할 수 있다.
이렇게 여러 클래스에 대한 기본적인 구조를 설명하였다. 
이를 통해 클래스는 크게 멤버 변수와 메소드로 구분되며, 멤버 변수에는 클래스 변수, 인스턴스 변수가 존재하는 것을 파악할 수 있었다.

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

- 생성자란?

  인스턴스(객체)가 생성될 때 호출되는 인스턴스 초기화 메서드이다.
  생성자가 호출 됨으로써 인스턴스의 변수들이 초기화되고, 인스턴스 생성 시 필요한 것들이 실행된다.

  > 참고!! <br> 한가지 주의할 것은 생성자를 통해 인스턴스가 생성되는 것이 아니다.
  생성자는 인스터스의 변수들을 초기화하며 인스턴스 생성 시 필요한 것들을 실행하는 역할이고,
  실제 인스턴스 생성은 연산자 new 를 통하여 진행한다.

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
  - 생성자는 항상 메소드명 위치에 클래스의 이름을 적어주어야 한다.
  - 이 생성자는 int형 변수와 String타입 변수를 매개변수로 받는다.
- 구현부1 : this.accountNumber = accountNumber;
  -  생성하려는 객체의 accountNumber이라는 멤버변수에 매개 변수로 받은 accountNumber의 값을 할당한다.
- 구현부2 : this.name = name;
  - 위의 내용과 동일하게 매개변수로 받은 name을 객체의 변수 중 name에 할당한다.

이제 이를 적용한 코드를 아래에서 보자.

**[코드]**

```java
public class Practice1 {
  public static void main(String[] args) {
    Account account = new Account(1234, "HANTOR", 100000);
    account.showmethemoney();
  }
}

class Account{
  int accountNumber;
  String name;
  int money;
  
  Account(int accountNumber, String name, int money){
    this.accountNumber = accountNumber;
    this.name = name;
    this.money = money;
  }

  Account(){
    this.accountNumber = 0;
    this.name = null;
  }
  
  void showmethemoney(){
    System.out.println(this.money);
  }
  
  
}
```

</details>
