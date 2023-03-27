package Practice04;

public class Animal {
    // TO DO : 멤버 변수 중 공통부 작성하기 (공통부 1,2,3)
                            // 공통부 1
                            // 공통부 2
                            // 공통부 3
    //

    public Animal(String name, int age) {
        this.name = name;   // 생성자 공통부 1
        this.age = age;     // 생성자 공통부 2
    }

    // TO DO : 메소드들 중에 공통부 작성하기 (공통부 4)

    //

}

class Dog extends Animal{

    // TO DO: 공통부가 아닌 멤버 변수는 따로 작성한다.

    //

    public Dog(String name, int age, int tail_length) {
        super(name, age);       // 조상 클래스의 생성자로 매개변수 전달
        this.tail_length = tail_length; // 자손 클래스의 멤버 변수에 값 할당
    }

    // TO DO: 공통부가 아닌 부분은 따로 작성한다.

    //
}

class Cat extends Animal{

    // TO DO: 공통부가 아닌 멤버 변수는 따로 작성한다.

    //

    public Cat(String name, int age, int claw_length) {
        super(name, age);       // 조상 클래스의 생성자로 매개변수 전달
        this.claw_length = claw_length; // 자손 클래스의 멤버 변수에 값 할당
    }

    // TO DO: 공통부가 아닌 부분은 따로 작성한다.

    //
}