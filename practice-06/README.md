## Practice 1 : 조상 클래스의 참조변수 활용 이론

<details>
<summary>이론 설명</summary>

### **[이론]**

1. `조상 클래스의 참조변수`를 이용해서 `자손 클래스의 인스턴스`를 참조할 수 있다.
   하지만 조상 클래스의 참조변수로는 자손 클래스의 멤버에 접근할 수 없다.<br>
   **Example** : 조상 클래스의 참조변수로 자손 클래스의 멤버에 접근 불가.
   ```java
   class UpperClass {
      int a;
      void methodA() {
          System.out.println("UpperClass methodA()");
      }
   }
   class LowerClass extends UpperClass {
       int b;
       void methodB() {
           System.out.println("LowerClass methodB()");
       }
   }
   public class test {
      public static void main(String[] args) {
          UpperClass up = new LowerClass();
          up.methodA();
          up.methodB(); // error
      }
   }
   ```
2. 조상 클래스를 상속받는 자손 클래스들을 하나의 배열에 담고 싶다면, 다음과 같은 과정으로 가능하다.

   1. `조상 클래스의 참조변수`를 이용해서 배열을 생성한다.
   2. `자손 클래스의 인스턴스`를 생성해서 조상 클래스의 참조변수에 대입한다.
   3. `조상 클래스의 참조변수`를 이용해서 배열의 요소에 접근한다.
      <br> 이때, 조상 클래스의 참조변수로는 자손 클래스의 멤버에 접근할 수 없다. -> 주석 참고

   ```java
   class UpperClass {
        public int a;
        void methodA() {
             System.out.println("UpperClass methodA()");
        }
        UpperClass() {
            a = 10;
        }
   }

   class LowerClassA extends UpperClass {
       public int b;
       LowerClassA() {
           a = 10;
           b = 20;
       }
   }
   class LowerClassB extends UpperClass {
       public int c;
       LowerClassB() {
           a = 30;
           c = 40;
       }
   }
   public class test {
      public static void main(String[] args) {
          UpperClass[] arr = new UpperClass[3];
          arr[0] = new UpperClass();
          arr[1] = new LowerClassA();
          arr[2] = new LowerClassB();

          for(int i = 0; i < arr.length; i++) {
               arr[i].methodA();
          }
          arr[0].a = 100; // not error
          arr[1].a = 200; // not error
          arr[2].a = 300; // not error

          arr[0].b = 100; // error
          arr[1].b = 200; // not error
          arr[2].b = 300; // error

          arr[0].c = 100; // error
          arr[1].c = 200; // error
          arr[2].c = 300; // not error
      }
   }
   ```

</details>

<br><br>

## Practice 2 : 조상 클래스의 참조변수 활용 문제

<details>
<summary>문제 설명</summary>

### **[문제]** 도형을 담는 배열

다음과 같은 도형 클래스가 있다.

Shape 클래스 (조상 클래스): 도형의 넓이를 출력하는 printArea() 메소드를 포함한다. <br>
Rectangle 클래스 (자손 클래스1): 사각형의 가로와 세로를 가지며, 넓이를 계산하는 calculateArea() 메소드를 포함한다. <br>
Circle 클래스 (자손 클래스2): 원의 반지름을 가지며, 넓이를 계산하는 calculateArea() 메소드를 포함한다. <br>

#### TODO 1

Shape 클래스의 참조변수를 사용하여 Rectangle과 Circle 클래스의 인스턴스를 저장하는 배열을 만들어 보자. <br>
**0번째 요소**에는 `Rectangle` 인스턴스를 `Width = 4`, `Height = 5`로, **1번째 요소**에는 `Circle` 인스턴스를 `radius = 3`으로 저장한다. <br>

 

#### TODO 2

배열의 각 요소(배열의 모든 요소)에 저장된 도형의 넓이를 출력하는 printArea() 메소드를 호출한다. <br>

</details>

<br><br>

## Practice 3 : Overriding(오버라이딩) 이론

<details>
<summary>이론 설명</summary>

### **[이론]**

**오버라이딩**이란 상속 관계에 있는 `조상 클래스의 메서드`를 `자손 클래스`에서 재정의하는 것을 말한다.
오버라이딩을 통해 조상 클래스의 메서드를 자손 클래스에서 재정의하면, 자손 클래스의 인스턴스를 생성하여 해당 메서드를 호출하면 자손 클래스에서 재정의한 메서드가 호출된다.
재정의 하는 방법으로는 조상 클래스의 메서드와 동일한 메서드(메서드명, 매개변수, 반환타입 일치)를 자손 클래스에 정의하면 된다.
그리고 메서드 앞에 `@Override` 어노테이션을 붙여주면 오버라이딩을 했는지를 컴파일러가 체크해준다.

해당 내용을 코드로 구현하면 다음과 같다.

```java
class UpperClass {
    void methodA() {
        System.out.println("UpperClass methodA()");
    }
}
class LowerClass extends UpperClass {
    @Override
    void methodA() {
        System.out.println("LowerClass methodA()");
    }
}
public class test {
    public static void main(String[] args) {
        UpperClass upper = new UpperClass(); // 조상 클래스 참조변수, 조상 클래스 인스턴스
        LowerClass lower = new LowerClass(); // 자손 클래스 참조변수, 자손 클래스 인스턴스
        UpperClass test = new LowerClass(); // 조상 클래스 참조변수, 자손 클래스 인스턴스
     // LowerClass err = new UpperClass(); // 자손 클래스 참조변수, 조상 클래스 인스턴스 (X)
        upper.methodA(); // UpperClass methodA()
        lower.methodA(); // LowerClass methodA()
        test.methodA(); // LowerClass methodA()
    }
}
```

#### 출력 결과

    UpperClass upper : UpperClass
    LowerClass lower : LowerClass
    UpperClass test : LowerClass

조상 클래스의 참조변수는 조상 클래스의 인스턴스를 참조할 수 있고,(출력결과 첫번째 줄)<br>
자손 클래스의 참조변수는 자손 클래스의 인스턴스를 참조할 수 있다.(출력결과 두번째 줄)<br>
추가로 Overriding을 통해 재정의한 메서드는 조상 클래스의 참조변수로 자손 클래스의 인스턴스를 참조할 경우에는
자손 클래스에서 재정의한 메서드가 호출된다. (출력결과 세번째 줄)<br>

</details>
<br><br>

## Practice 4 : Overriding(오버라이딩) 문제

<details>
<summary>문제 설명</summary>

### **[문제]** Overriding

### **[설명]**

이 코드는 `Bike` 클래스와 `Car` 클래스는 `Vehicle` 클래스를 상속받는다. <br>
이 과정 중에서 overriding을 통해 `display()` 메서드를 재정의해두었다. <br>

이번 과제에서는 이미 만들어져 있는 크기 3인 vehicles 배열에 각각의 인스턴스를 넣고, <br>
for문을 통해 각각의 인스턴스의 display() 메서드를 호출한다. <br>

**TODO 1 : vehicles 배열을 조건에 맞게 채우시오.**

1.  첫 번째 인덱스에는 Vehicle 클래스의 인스턴스를 넣는다.
2.  두 번째 인덱스에는 Bike 클래스의 인스턴스를 넣는다.
3.  세 번째 인덱스에는 Car 클래스의 인스턴스를 넣는다.

**TODO 2 : for문을 통해 vehicles 배열의 각 인덱스에 있는 인스턴스의 display() 메서드를 호출하시오.**

출력 결과 : <br>
This is a vehicle. <br>
This is a bike. <br>
This is a car. <br>

</details>

<br><br>

## Practice 5 : Abstract Class 이론

<details>
<summary>이론 설명</summary>

### **[이론]**

- `Abstract` 클래스 (추상 클래스)란?

  완전하지 않은 클래스로, 하나 이상의 추상 메소드(구현되지 않은 메소드)를 포함한다.
  추상 클래스는 객체를 생성할 수 없으며, 다른 클래스가 상속받아 구현해야 한다.
  추상 클래스의 목적은 공통적인 기능을 상속받아 사용하고, 필요한 기능을 자식 클래스에서 구현하도록 하는 것이다.

- 추상 클래스 규칙

  1. abstract 키워드를 사용하여 추상 클래스를 선언합니다.
  2. 추상 클래스는 하나 이상의 추상 메소드를 포함할 수 있습니다. 추상 메소드는 선언부만 있고 구현부가 없는 메소드입니다.
  3. 추상 클래스를 상속받은 클래스는 반드시 추상 클래스의 추상 메소드를 구현해야 합니다. 만약 구현하지 않으면 해당 클래스도 추상 클래스로 선언해야 합니다.

- 추상 클래스 사용 예시

  ```java
  // 추상 클래스
  abstract class Animal {
      abstract void makeSound(); // 추상 메소드

      void displayInfo() { // 일반 메소드
          System.out.println("This is an animal.");
      }
  }

  // 구체 클래스 1
  class Dog extends Animal {
      @Override
      void makeSound() { // 추상 메소드 구현
          System.out.println("Woof!");
      }
  }

  // 구체 클래스 2
  class Cat extends Animal {
      @Override
      void makeSound() { // 추상 메소드 구현
          System.out.println("Meow!");
      }
  }

  // Main 클래스
  public class Main {
     public static void main(String[] args) {
        // 객체 생성
        Dog dog = new Dog();
        Cat cat = new Cat();

        // 구체 클래스에서 구현된 메소드 호출
        dog.makeSound(); // 출력: Woof!
        cat.makeSound(); // 출력: Meow!

        // 추상 클래스의 일반 메소드 호출
        dog.displayInfo(); // 출력: This is an animal.
        cat.displayInfo(); // 출력: This is an animal.
     }
  }
  ```

</details>

<br><br>

## Practice 6 : Abstract Class 문제

<details>
<summary>문제 설명</summary>

### **[문제]** 추상 클래스 Vehicle

### **[설명]**

코드는 추상 클래스 Vehicle을 상속받은 Car 클래스와 Bicycle 클래스를 구현하였다. <br>
추상 클래스 Vehicle에는 추상 메소드 start()와 stop()이 있고, 일반 메소드 displayInfo()가 있다. <br>
Car 클래스와 Bicycle 클래스는 추상 메소드 start()와 stop()을 구현하고 있다. <br>

- **TODO 부분을 채워서 코드를 완성해보자.**
  모든 추상 메서드들에 대해 상속받는 클래스가 구현해야 한다. 구현하는 과정에 있어서, <br>
  @Override 어노테이션을 사용하면 오버라이딩을 하고 있다는 것을 명시적으로 표현할 수 있다. <br>
  추가로 구현하는 추상 메서드에 대해 매개변수, 리턴 타입, 접근 제한자 등을 완전히 동일하게 구현해야 한다. <br>

#### 출력결과

    Car starts.
    Car stops.
    Bicycle starts.
    Bicycle stops.
    This is a vehicle.
    This is a vehicle.

</details>

<br><br>

## Practice 7 : Interface 1

<details>
<summary>문제 설명</summary>

### **[문제]** 맥주가 마시고 싶어요 (변형)

### **[설명]**

상속을 통해 구현한 '맥주가 마시고 싶어요'를 인터페이스를 활용하여 구현해보자

Beer 클래스를 Interface로 변형한 뒤, Cass와 Hoegaarden 클래스가 Beer 인터페이스를 구현하도록 변경한다.

기존 코드는 다음과 같다.

```java
class Beer {
    String type;
    String model;
    int ABV;

    Beer(String type, String model, int ABV) {
        this.type = type;
        this.model = model;
        this.ABV = ABV;
    }

    void drink() {
        System.out.println(model + "을(를) 마십니다");
    }

    void getType() {
        System.out.println(model + "의 타입 : " + type);
    }

    void getABV() {
        System.out.println(model + "의 도수 : " + ABV);
    }
}

class Cass extends Beer {
    Cass(String type, String model, int ABV) {
        super(type, model, ABV);
    }
}

class Hoegaarden extends Beer {
    String flavor;

    Hoegaarden(String type, String model, int ABV, String flavor) {
        super(type, model, ABV);
        this.flavor = flavor;
    }

    void drink() {
        System.out.println(flavor + "맛 " + model + "을(를) 마십니다\n");
    }

    void getFlavor() {
        System.out.println(model + "의 맛 : " + flavor);
    }
}

public class BeerTest {
    public static void main(String[] args) {
        Hoegaarden h1 = new Hoegaarden("밀맥주", "호가든", 5, "레몬");
        Hoegaarden h2 = new Hoegaarden("밀맥주", "호가든", 5, "일반");
        Cass c = new Cass("밀맥주", "카스", 6);

        order(h1);
        order(h2);
        order(c);
    }

    static void order(Beer b) {
        if (b instanceof Hoegaarden) {
            Hoegaarden h = (Hoegaarden) b;
            h.getType();
            h.getABV();
            h.getFlavor();
            h.drink();
        } else if (b instanceof Cass) {
            Cass c = (Cass) b;
            c.getType();
            c.getABV();
            c.drink();
        }
    }
}
```

<span style="color:red"> HINT : 공통된 부분만 빼내면 된다. </span>

</details>

<br><br>

## Practice 8 : Interface 2

<details>
<summary>문제 설명</summary>

### **[문제]** 맥북이 사고 싶어요

### **[설명]**

맥북이 사고 싶어요.

그램 말고 맥북이 사고 싶어요.

인텔 실리콘 맥북 말고 애플 실리콘 맥북이 사고 싶어요.

메서드의 매개변수로 맥북(애플 실리콘)이 들어오면 구매하는 메서드를 작성해보자

- **PC Interface**

  getModel 메서드 : 반환타입 void, 접근제어자 public

  getPrice 메서드 : 반환타입 void, 접근제어자 public

  getManufacture : 반환타입 void, 접근제어자 public

- **Macbook Class**

  PC Interface를 구현하는 클래스

  model(String), price(Integer), manufacturedAt(Integer), version(String)을 멤버변수로 갖는다

  getModel 메서드 : 출력 예시 - `모델 : 맥북`

  getPrice 메서드 : 출력 예시 - `가격 : 2400000`

  getManufacture 메서드 : 출력 예시 - `제조년월 : 2023`

  getVersion() : 반환타입 String, 접근제어자 public, 출력 예시 - `버전 : 애플 실리콘`

  생성자의 매개변수로 model(String), price(Integer), manufacturedAt(Integer), version(String)을 받는다

- **Gram Class**

  PC Interface를 구현하는 클래스

  model(String), price(Integer), manufacturedAt(Integer)을 멤버변수로 갖는다

  getModel 메서드 : 출력 예시 - `모델 : 그램`

  getPrice 메서드 : 출력 예시 - `가격 : 1100000`

  getManufacture 메서드 : 출력 예시 - `제조년월 : 2022`

  생성자의 매개변수로 model(String), price(Integer), manufacturedAt(Integer)을 받는다

  | 인스턴스 타입 | 인스턴스 이름 | model      | price   | manufacturedAt | version       |
  | ------------- | ------------- | ---------- | ------- | -------------- | ------------- |
  | Macbook       | m1            | "맥북에어" | 2400000 | 2023           | "애플 실리콘" |
  | Macbook       | m2            | "맥북프로" | 1500000 | 2021           | "인텔 실리콘" |
  | Gram          | g1            | "그램"     | 1100000 | 2022           |               |

```java
public class Practice08 {
    public static void main(String[] args) {
        // TO DO

        order(m1);
        order(m2);
        order(g1);
    }

    static void order( ? ) {
        if ( 그램인지 체크 ) {
            System.out.println("이게 아니야");
        } elif ( 맥북인지 체크 ) {
            if ( 인텔 실리콘인지 체크 ) {
                System.out.println("이게 아니야");
            } elif ( 애플 실리콘인지 체크 ) {
                System.out.println("이걸로 주세요");
            }
        }
    }
}
```

<span style="color:red"> HINT : 공통된 부분만 빼내면 된다. </span>

#### 출력결과

```java
모델 : 맥북프로
가격 : 2400000
제조년월 : 2023
버전 : 애플 실리콘
이걸로 주세요

모델 : 맥북에어
가격 : 1500000
제조년월 : 2021
버전 : 인텔 실리콘
이게 아니야

모델 : 그램
가격 : 1100000
제조년월 : 2022
이게 아니야
```

</details>
