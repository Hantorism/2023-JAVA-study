## Practice 1 : 클래스 상속 예제 1

<details>
<summary>문제 설명</summary>

### **[문제]** 조상 클래스 뽑아내기

### **[설명]**

다음과 같은 클래스들이 있다. <br>

```java
class Marine {
	int x, y;
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }

	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank {
	int x, y;
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }

	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship {
	int x, y;
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }

	void load() { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}
```

3개의 클래스에서 공통된 부분을 뽑아내어 조상 클래스 `Unit`를 만들어보자. <br>
그리고 조상 클래스를 상속받아 각 클래스를 만들어보자. <br>
Test seems Correct가 출력되는 경우 정답이다. <br>

<span style="color:red"> HINT : 공통된 부분만 빼내면 된다. </span>

</details>

<details>
<summary>정답</summary>

```java
package practice03;

public class Practice03 {
	public static void main(String args[]) {
		Unit unit = new Unit();
		unit.move(1,1);
		unit.stop();
		System.out.println("Test seems Correct");
	}
}

class Unit {
	int x, y;

	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit {

	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit {

	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit {

	void load() { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}
```

### **[코드]**

</details>

<br></br>

## Practice 2 : 클래스 상속 예제 2

<details>
<summary>문제 설명</summary>

### **[문제]** 상속하고 또 상속하고

### **[설명]**

상속을 두 번 이용하는 예제이다. <br>
상속이 되는 구조는 다음과 같다.

**(조상) Vehicle -> Car -> SportsCar (자손)**

Vehicle의 멤버변수는 `speed`이다. <br>

Car의 멤버변수는 `brand`, `speed`이다. <br>
여기서 `speed`는 **Vehicle** 클래스에서 상속받고, `brand`는 **Ca**r 클래스에서 선언한다. <br>

SportsCar의 멤버변수는 `brand`, `speed`, `cost`이다. <br>
여기서 `brand`와 `speed`는 **Car** 클래스에서 상속받고, `cost`는 **SportsCar** 클래스에서 선언한다. <br>

SportsCar의 멤버변수와 생성자를 작성해보자.

<span style="color:red"> HINT : 생성자에서 상속받은 클래스의 생성자를 super()를 이용하여 호출할 수 있다.</span>
<br>

- SportsCar 멤버변수 조건

  | 접근제어자 | 자료형 | 변수명 |
  | ---------- | ------ | ------ |
  | public     | int    | cost   |

- SportsCar 생성자 조건

  | 접근제어자 | 생성자명  | 매개변수                          |
  | ---------- | --------- | --------------------------------- |
  | public     | SportsCar | String brand, int speed, int cost |

- 출력 결과
  ```java
  My car's cost is 99999999. Watch Out
  Racing Lamborghini sports car at 100 km/h
  Driving Lamborghini car at 100 km/h
  Vehicle is accelerating to 110 km/h
  Racing Lamborghini sports car at 110 km/h
  Vehicle is braking to 80 km/h
  Racing Lamborghini sports car at 80 km/h
  ```

</details>

<details>
<summary>정답</summary>

### **[코드]**

```java
package practice01;

public class Practice01 {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("Lamborghini", 100, 99999999);
        myCar.showCost();
        myCar.race();
        myCar.drive();

        myCar.accelerate(10);
        myCar.race();

        myCar.brake(30);
        myCar.race();

    }
}

class Vehicle{
    protected int speed; // protected : 자식 클래스에서 접근 가능

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println("Vehicle is accelerating to " + speed + " km/h\n");
    }

    public void brake(int amount) {
        speed -= amount;
        System.out.println("Vehicle is braking to " + speed + " km/h\n");
    }
}

class Car extends Vehicle {
    public String brand;

    public Car(String brand, int speed) {
        // super() : 부모 클래스의 생성자를 호출
        super(speed);
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving " + brand + " car at " + speed + " km/h\n");
    }
}


class SportsCar extends Car {
    // TO DO : SportsCar 클래스의 멤버변수와 생성자를 작성하시오.
    public int cost;

    public SportsCar(String brand, int speed, int cost) {
        super(brand, speed);
        this.cost = cost;
    }
    //

    public void race() {
        System.out.println("Racing " + brand + " sports car at " + speed + " km/h\n");
    }

    public void showCost() {
    	System.out.println("My car's cost is " + cost + ". Watch Out\n");
    }
}
```

</details>

<br></br>

## Practice 3 : 클래스 상속 + 포함 예제

<details>
<summary>문제 설명</summary>

### **[문제]** 상속도 하고! 포함도 하고! 다 했다 이말이야!

### **[설명]**

TO DO를 채워봅시다.

- Animal 클래스
  1. Animal 클래스의 멤버 변수
     - `name` : String 타입, public 접근 제어자
     - `age` : int 타입, public 접근 제어자
     - `owner` : Owner 타입, private 접근 제어자
  2. Animal 클래스는 생성자를 갖는다. 생성자는 `name`, `age`, `owner`를 매개변수로 받는다.
- Cat 클래스
  1. Cat 클래스는 Animal 클래스를 상속받기 때문에, 생성자에 super()를 사용하여 Animal 클래스의 생성자를 호출한다.
- Dog 클래스
  1. Dog 클래스는 Animal 클래스를 상속받기 때문에, 생성자에 super()를 사용하여 Animal 클래스의 생성자를 호출한다.
- Owner 클래스

  1. Owner 클래스의 멤버 변수
     - `name` : String 타입, private 접근 제한자
     - `phoneNumber` : String 타입, private 접근 제한자
  2. Owner 클래스는 생성자를 갖는다. 생성자는 `name`, `phoneNumber`를 매개변수로 받는다.

- 출력결과

  ```java
  John owns a Whiskers
  John's number is 555-1234
  Whiskers is eating
  Whiskers is meowing
  Whiskers is sleeping

  Jane owns a Fido
  Jane's number is 555-5678
  Fido is eating
  Fido is barking
  Fido is sleeping
  ```

</details>

<details>
<summary>정답</summary>

### **[코드]**

```java
package practice02;

public class Practice02 {
    public static void main(String[] args) {

        Owner owner1 = new Owner("John", "555-1234");
        Owner owner2 = new Owner("Jane", "555-5678");

        Cat cat1 = new Cat("Whiskers", 5, owner1);
        Dog dog1 = new Dog("Fido", 3, owner2);

        cat1.getOwnerInfo();
        cat1.eat();
        cat1.meow();
        cat1.sleep();
        System.out.println();

        dog1.getOwnerInfo();
        dog1.eat();
        dog1.bark();
        dog1.sleep();
    }
}

class Animal {
    public String name;
    public int age;
    // TO DO : Owner 타입의 멤버변수 owner를 추가하고, 생성자를 작성하시오.
    private Owner owner;

    public Animal(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    //

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void getOwnerInfo() {
        System.out.println(owner.getName() + " owns a " + name);
        System.out.println(owner.getName() + "'s number is " + owner.getPhoneNumber());
    }
}

class Cat extends Animal {
    public Cat(String name, int age, Owner owner) {
        // TODO : super() 생성자를 이용하여 Cat 클래스의 생성자를 작성하시오.
        super(name, age, owner);
        //
    }

    public void meow() {
        System.out.println(name + " is meowing");
    }
}

class Dog extends Animal {
    public Dog(String name, int age, Owner owner) {
        // TODO : super() 생성자를 이용하여 Dog 클래스의 생성자를 작성하시오.
        super(name, age, owner);
        //
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}


class Owner {
    // TO DO : Owner 클래스의 멤버변수와 생성자를 작성하시오.
    private String name;
    private String phoneNumber;

    public Owner(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
```

</details>

<br></br>

## Practice 4 : 다형성 (오버라이딩)

<details>
<summary>문제 설명</summary>

### **[문제]** 다형성 (오버라이딩)

### **[설명]**

우선 자바에서의 다형성 (Polymorphism)은 두 가지 의미를 갖는다.

> 1. 한 타입의 참조 변수로 여러 타입의 객체를 참조할 수 있는 능력
> 2. 하나의 객체나 메소드가 여러가지 다른 형태를 가질 수 있는 능력

자바에서의 다형성에는 `오버로딩`, `오버라이딩`, `형변환`, `인터페이스`, `추상클래스` 등이 존재한다.
이번 문제에서는 오버라이딩에 대해 다룰 예정이다.

</details>

<details>
<summary>정답</summary>

### **[코드]**

</details>

<br></br>

## Practice 4 : 상속 + 다형성 실습 1

<details>
<summary>문제 설명</summary>

### **[문제]** 맥주가 마시고 싶어요

### **[설명]**

조상 클래스가 될 Beer 클래스를 만들어봅시다

- 멤버 변수

  1. `type` : String 타입, public 접근 제어자, 맥주의 종류를 나타내기 위함
  2. `model` : String 타입, public 접근 제어자, 맥주의 상호명을 나타내기 위함
  3. `ABV` : int 타입, public 접근 제어자, 맥주의 알코올 도수를 나타내기 위함

- 생성자

  Beer 클래스는 오직 1가지의 생성자를 갖는다. 생성자는 `type`, `model`, `ABV`를 매개변수로 받는다

- 메서드

  Beer 클래스는 3가지의 메서드를 갖는다

  1. `drink()` : 반환타입 void, 출력 예시 - `model`을 마십니다
  2. `getType()` : 반환타입 void, 출력 예시 - `model`의 타입 : `type`
  3. `getABV()` : 반환타입 void, 출력 예시 - `model`의 도수 : `ABV`

</details>

<details>
<summary>정답</summary>

### **[코드]**

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
```

</details>

<br></br>

## Practice 5 : 상속 + 다형성 실습 2

<details>
<summary>문제 설명</summary>

### **[문제]** 맥주가 마시고 싶어요

### **[설명]**

Beer 클래스를 상속받을 두 클래스를 만들어봅시다

- Cass 클래스

  1. 멤버 변수

  - Beer 클래스와 동일한 멤버 변수를 갖는다. 굳이 만들어야 할까?

  2. 생성자

  - Cass 클래스는 오직 1가지의 생성자를 갖는다. 생성자는 `type`, `model`, `ABV`를 매개변수로 받는다.

    단, 이 생성자는 조상 클래스의 생성자(super())를 호출해야 한다.

  3. 메서드

  - Cass 클래스는 조상 클래스와 동일한 메서드를 갖는다. 굳이 만들어야 할까?

- Hoegaarden 클래스

  1. 멤버 변수

  - Beer 클래스의 멤버 변수와 더불어 `flavor` 멤버 변수를 갖는다.
  - `flavor` : String 타입, public 접근 제어자, 맥주의 맛을 나타내기 위함

  2. 생성자

  - Hoegaarden 클래스는 오직 1가지의 생성자를 갖는다. 생성자는 `type`, `model`, `ABV`, `flavor`을 매개변수로 받는다.

    이 때, 조상 클래스와 중복된 매개변수는 super() 생성자를 통해 값을 할당한다.

  3. 메서드

  - Hoegaarden 클래스는 조상 클래스의 메서드와 더불어 1개의 추가적인 메서드를 갖는다.
  - Hoegaarden 클래스는 조상 클래스의 `drink()` 메서드를 오버라이딩한다.
  - `drink()` : 반환타입 void, 출력 예시 - `flavor`맛 `model`을 마십니다.
  - `getFlavor()` : 반환타입 void, 출력 예시 - `model`의 맛 : `model`

</details>

<details>
<summary>정답</summary>

### **[코드]**

```java
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
```

</details>

<br></br>

## Practice 6 : 상속 + 다형성 실습 3

<details>
<summary>문제 설명</summary>

### **[문제]** 맥주가 마시고 싶어요

### **[설명]**

매개변수의 다형성을 활용하여 하나의 메서드를 통해 서로 다른 맥주를 주문해보자

생성해야 할 인스터스의 정보는 다음과 같다.

| 인스턴스 타입 | 인스턴스 이름 | type       | model    | ABV | flavor |
| ------------- | ------------- | ---------- | -------- | --- | ------ |
| Hoegaarden    | h1            | "밀맥주"   | "호가든" | 6   | "레몬" |
| Hoegaarden    | h2            | "밀맥주"   | "호가든" | 6   | "일반" |
| Cass          | c             | "보리맥주" | "카스"   | 6   |

작성해야 할 코드의 일부는 다음과 같다

```java
public class BeerTest {
    public static void main(String[] args) {
        // TO DO

        order(h1);
        order(h2);
        order(c);
    }

    static void order( ? ) {
        if (b instanceof Hoegaarden) {
            // TO DO
        } else if (b instanceof Cass) {
            // TO DO
        }
    }
}
```

출력 결과물은 다음과 같다

```java
호가든의 타입 : 밀맥주
호가든의 도수 : 6
호가든의 맛 : 레몬
레몬맛 호가든을 마십니다

호가든의 타입 : 밀맥주
호가든의 도수 : 6
호가든의 맛 : 일반
일반맛 호가든을 마십니다

카스의 타입 : 보리맥주
카스의 도수 : 6
카스을 마십니다
```

</details>

<details>
<summary>정답</summary>

### **[코드]**

```java
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

</details>
