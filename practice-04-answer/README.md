# 4회차 문제

## Practice 0 : this() 생성자 이론

<details> <summary>문제 설명</summary>

### **[문제]** this() 이론

### **[설명]** this()를 이용한 클래스 내의 다른 생성자 호출

클래스는 최소한 한 가지 이상의 생성자를 갖고 있어야한다. 
사용자가 생성자를 따로 작성하지 않는다면 기본 생성자 `ClassName(){ }`을 제공한다.

그리고 이 생성자는 2개 이상 존재할 수 있고, 객체를 생성하는 방식에 따라서 각기 다른 생성자가 호출된다.
밑의 코드를 예시로 보자. 

```java
class Student {
    String name;
    int studentId;

    Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    Student(String name) {
        this.name = name;
        this.studentId = -1;
    }

    Student() {
        this.name = null;
        this,studentId = -1;
    }
}
```
위의 코드에서는 3가지의` Student` 클래스에 대한 생성자가 존재한다. 하나의 메소드 명으로 여러 가지의
다른 기능을 수행할 수 있는 것으로 `다형성`의 일종으로도 여긴다.

위의 코드를 리팩토링(출력 결과는 유지한 채 코드를 수정하는 것)하면 다음과 같다.
```java
class Student{
	String name;
	int studentId;
	
	Student(String name, int studentId){  // 1
		this.name = name;
		this.studentId = studentId;
        System.out.println("constructor 1");
	}
	
	Student(String name){ // 2
		this(name, -1);
        System.out.println("constructor 2");
	}
	
	Student(){ // 3
		this(null, -1);
        System.out.println("constructor 3");
	}
}
```
`this() 생성자`는 클래스의 생성자 또는 클래스 내의 다른 생성자를 호출하는 메서드이다.
`this() 생성자`를 사용하기 위해서는 생성자 내의 구현부에서 가장 위에(처음에) 실행되어야한다.

`this() 생성자`는 전달받은 매개변수를 다른 생성자로 전달하여, 다른 생성자의 코드를 진행하고 다시
원래의 구현부로 돌아와 나머지 코드을 실행한다. 여기서 다른 생성자를 택하는 것은 자바 컴파일러가 생성자에 입력한
매개변수의 개수를 보고, 적당한 것을 선택한다.

여러가지 형식으로 매개변수를 입력하고, 이에 따라 어떤 생성자가 호출되는지 파악하기 위한 코드를 작성해보았다.
`Student` 클래스는 위의 코드와 동일하여 따로 첨부하지 않았다.

```java
public class practice01 {
	public static void main(String [] args) {
		System.out.println("--std1--");
		Student std1 = new Student("FULL",1234);
		System.out.println("------");
		
		System.out.println("--std2--");
		Student std2 = new Student("HALF");
		System.out.println("------");
		
		System.out.println("--std3--");
		Student std3 = new Student();
		System.out.println("------");
	}
}
/*
출력결과
--std1--
constructor 1
------
--std2--
constructor 1
constructor 2
------
--std3--
constructor 1
constructor 3
------  
 */
```

std1 : 제일 위의 생성자 코드만 진행 <br>
std2 : 가운데 생성자 코드부터 시작하여, 제일 위의 생성자 코드를 진행하고, 가운데 생성자 코드의 나머지 부분을 진행 <br>
std3 : 마지막 생성자 코드부터 시작하여, 제일 위의 생성자 코드를 진행하고, 마지막 생성자 코드의 나머지 부분을 진


</details>

<details> <summary>정답</summary>

### **[코드]**

</details>

## Practice 1 : this() 생성자 적용

<details>
<summary>문제 설명</summary>

### **[문제]** this() 생성자 이용하기

### **[설명]** 
`this()` 생성자를 이용해 코드를 간단하게 작성해보자. 이번 예제에서는 `Car` 클래스를 작성하고자 한다.
우선 `Car` 클래스에는 멤버 변수로 다음을 갖는다.

|접근제어자| 자료형 | 변수명      |
|---|---|----------|
|public|String| carType  |
|public|int| carNumber |
|public|int| carInfo  |
|public|String|customerName|

생성자는 모두 public 접근 제어자를 갖으며, 총 2개 존재한다. 
1. 모든 멤버 변수에 대해 매개변수로 갖는다.
2. `customerName`을 제외한 멤버 변수 전부를 매개변수로 갖으며, `customerName`에 "none"을 할당한다.

<span style="color:red"> HINT : 1번 생성자를 먼저 작성한 이후에 2번 생성자에서 this() 생성자를 호출하자.</span>
<br>

</details> 

<details>
<summary>정답</summary>

### **[코드]**

```java
class practice01 {
    public static void main(String[] args) {
        Car car1 = new Car("small", 1111, 1, "Hantor");
        Car car2 = new Car("mid", 1234, 2);

        System.out.println(car1.toString() + "\n");
        System.out.println(car2.toString());
    }
}

class Car{

    // TO DO : write member variable and make 2 constructor with conditions.  
    public String carType; // small, mid, large
    public int carNumber; // 1000 ~ 9999
    public int carCondition;   // 1 for good, 0 for bad.
    public String customerName;

    public Car(String carType, int carNumber, int carCondition, String customerName) {
        this.carType = carType;
        this.carNumber = carNumber;
        this.carCondition = carCondition;
        this.customerName = customerName;
    }

    public Car(String carType, int carNumber, int carCondition){
        this(carType, carNumber, carCondition, "none");
    }
    //

    public String toString() {
        return "carType : " + this.carType + ", carNumber : " + this.carNumber +
                ", carCondition : " + this.carCondition + ", customerName : " + this.customerName;
    }
}

```

</details>

## Practice 2 : static keyword (변수)

<details>
<summary>문제 설명</summary>

### **[문제]** static keyword

### **[이론]**

- static keyword

    > Static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당됩니다.
    > Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있는 장점을 가지지만
    > Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재하게 됩니다.
    
    > 출처 : 코딩팩토리(https://coding-factory.tistory.com/524)
    
    변수/메소드를 생성할 때, 인스턴스 변수/메소드로 생성할 것인 지, 클래스 변수/메소드로 생성할 것인지는
    `static` keyword가 결정한다. `static`을 붙이지 않고 생성할 경우 인스턴스 변수/메서드로 생성되고,
    `static` keyword를 붙일 경우 클래스 변수/메서드로 생성된다.
    
    `static` keyword가 붙은 메서드들은 클래스가 메모리에 올라갈 때(실행할 때), 바로 정적(static) 메서드가 생성되기 때문에, 따로
    객체를 생성하지 않고 사용할 수 있다. 따라서 이전에 클래스를 이용하지 않는 매서드들에서 `void static add` 등과 같은 식으로 선언된 것을 확인
    할 수 있었다.

`static` keyword는 변수로 쓰이는 경우 대부분 공유의 목적으로 이용된다. `static`이 붙은 변수들의 경우 공통된 메모리 공간을 이용하기 때문에,
**서로 다른 객체에서 해당 변수를 이용하여도 같은 메모리 공간에 접근하여 데이터 값을 변동시킬 수 있다.**
 
```java
public class Practice03 {

  public static void main(String[] args) {
    Counter c1 = new Counter();
    System.out.println("c1's count_static " + c1.count_static); 
    // c1.count_static == Counter.count_static
    System.out.println("c1's count_normal " + c1.count_normal + "\n");

    Counter c2 = new Counter();
    System.out.println("c2's count_static " + c2.count_static);
    // c2.count_static == Counter.count_static
    System.out.println("c2's count_normal " + c2.count_normal + "\n");

    Counter c3 = new Counter();
    System.out.println("c3's count_static " + c3.count_static);
    // c3.count_static == Counter.count_static
    System.out.println("c3's count_normal " + c3.count_normal + "\n");

    System.out.println("c1's count_static " + c1.count_static);
    System.out.println("c1's count_normal " + c1.count_normal + "\n");
  }

}

class Counter{
  public static int count_static = 0;
  public int count_normal = 0;

  public Counter() {
    count_static += 1;
    count_normal += 1;
  }

}

/* 출력 결과
c1's count_static 1
c1's count_normal 1

c2's count_static 2
c2's count_normal 1

c3's count_static 3
c3's count_normal 1

c1's count_static 3
c1's count_normal 1
 */
```

static이 붙은 멤버 변수(클래스 변수)의 경우에는 서로 다른 객체에서 접근하여도,
공통된 메모리를 사용하여 값이 같이 변동되는 것을 확인할 수 있다.

### **[설명]**

한터 직영점을 다루는 사장님이 운영하는 여러 매장에 대해서 소득과 고객 수를 파악하려고 한다.
소득은 멤버변수로 선언이 되어 객체마다 다른 값을 갖도록 하고 **고객 수를 통합**하여 파악하려고 한다. TO DO 부분을 채워서 해당 출력 결과를 얻도록 만들어보자.

1. getOrder() 메소드 <br>
  호출 시에 orderNumber을 1 증가시키고, 해당 객체의 income에 price만큼 더한다.
2. main 메소드의 TODO 부분 채우기 <br>
  orderNumber의 값을 출력한다.
</details>

<details>
<summary>정답</summary>

### **[코드]**

```java
public class Practice02 {
	public static void main(String args[]) {
		Shop[] shops = new Shop[5];
		for(int a=0; a<3; a++) {
			shops[a] = new Shop("한터 " + (a+1) +"호점", 10000 *(a + 1));
		}
		
		shops[0].getOrder();	shops[0].getOrder();	shops[0].getOrder();
		shops[1].getOrder();	shops[1].getOrder();
		shops[2].getOrder();	
		
		for(int a=0; a<3; a++) {
			shops[a].getInfo();
		}
		
		// TO DO 1 : print orderNumber value
		//System.out.println("Total orderNumber " + Shop.orderNumber);
		//System.out.println("\nTotal orderNumber " + shops[0].orderNumber);
        System.out.println("\nTotal orderNumber " + (TODO));
		//
	}
}

class Shop{
	public String name;
	static int orderNumber = 0;
	public int price;
	public int income = 0;
	
	public Shop(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// TO DO 2 : make getOrder Method
	public void getOrder() {
		orderNumber++;
		this.income += price;
	}
	//
	
	public void getInfo() {
		System.out.println("\nSHOP NAME : " + this.name);
		System.out.println("MENU PRICE : " + this.price);
		System.out.println("SHOP INCOME : " + this.income);
	}
}

```

</details>


## Practice 3 : 다형성 (오버라이딩)

<details>
<summary>문제 설명</summary>

### **[문제]**

### **[설명]**

</details>

<details>
<summary>정답</summary>

### **[코드]**

</details>

## Practice 4 : 상속 기초


<details>
<summary>문제 설명</summary>

### **[문제]**

### **[설명]** super

</details>

<details>
<summary>정답</summary>

### **[코드]**

</details>

## Practice 5 : 상속 응용


<details>
<summary>문제 설명</summary>

### **[문제]**

### **[설명]** super

</details>

<details>
<summary>정답</summary>

### **[코드]**

</details>