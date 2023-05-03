package Practice06_Interface;

public class Car implements Executable {
    // TODO : Add Member Variables for Car(model)
    private String model;

    // TODO : Make constructor for Car
    public Car(String model) {
        this.model = model;
    }

    // TODO : Make TurnOnCar() Method
    public void TurnOnCar(){
        System.out.println("시동 걸기");
    }

    // TODO : Make Driving() Method
    public void Driving(){
        System.out.println(model + " 운전 중");
    }

    // TODO : Override execute to use above two methods.
    @Override
    public void execute() {
        TurnOnCar();
        Driving();
    }
}
