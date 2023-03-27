package practice01;

class practice01 {
    public static void main(String[] args) {
        Car car1 = new Car("small", 1111, 1, "Hantor");
        Car car2 = new Car("mid", 1234, 2);

        System.out.println(car1.toString() + "\n");
        System.out.println(car2.toString());
    }
}

class Car{

    // TO DO : Write member variable

    //
    // TO DO : Make constructor with full parameters

    //
    // TO DO : Make constructor using this() constructor with only carType, carNumber, carCondition

    //

    public String toString() {
        return "carType : " + this.carType + ", carNumber : " + this.carNumber +
                ", carCondition : " + this.carCondition + ", customerName : " + this.customerName;
    }
}