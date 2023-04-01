package practice02;

public class Practice02 {
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

    //

    public void race() {
        System.out.println("Racing " + brand + " sports car at " + speed + " km/h\n");
    }

    public void showCost() {
        System.out.println("My car's cost is " + cost + ". Watch Out\n");
    }
}