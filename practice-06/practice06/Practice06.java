package practice06;

abstract class Vehicle {
    abstract void start(); // 추상 메소드
    abstract void stop(); // 추상 메소드

    void displayInfo() { // 일반 메소드
        System.out.println("This is a vehicle.");
    }
}

// 구체 클래스 1
class Car extends Vehicle {
    // 여기 참고해서 구현해보세요!
    @Override
    void start() {
        System.out.println("Car starts.");
    }

    // TO DO : 추상 메서드인 stop() 메소드 구현
    // 기능 : "Car stops." 출력


   //
}

// 구체 클래스 2
class Bicycle extends Vehicle {
    // TO DO : 추상 메서드인 start() 메소드, stop() 메소드 구현
    // 기능 : "Bicycle starts." 출력, "Bicycle stops." 출력




    //
}

// Main 클래스
public class Practice06 {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // 구체 클래스에서 구현된 메소드 호출
        car.start(); // 출력: Car starts.
        car.stop(); // 출력: Car stops.
        bicycle.start(); // 출력: Bicycle starts.
        bicycle.stop(); // 출력: Bicycle stops.

        // 추상 클래스
        car.displayInfo(); // 출력: This is a vehicle.
        bicycle.displayInfo(); // 출력: This is a vehicle.
    }
}