package practice03;

public class Practice03 {
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

        //
    }

    public void meow() {
        System.out.println(name + " is meowing");
    }
}

class Dog extends Animal {
    public Dog(String name, int age, Owner owner) {
        // TODO : super() 생성자를 이용하여 Dog 클래스의 생성자를 작성하시오.

        //
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}


class Owner {
    // TO DO : Owner 클래스의 멤버변수와 생성자를 작성하시오.

    //

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}