package Practice06_Interface;

public class Phone implements Executable {
    // TODO : Add Member Variables for Phone(number)
    private String number;

    // TODO : Make Constructor for Phone
    public Phone(String number) {
        this.number = number;
    }

    // TODO : Make TurnOnPhone() Method
    public void TurnOnPhone(){
        System.out.println("핸드폰 켜기");
    }

    // TODO : Make Calling() Method
    public void Calling(){
        System.out.println(number + "에 전화 거는 중");
    }

    // TODO : Override execute to use above two methods.
    @Override
    public void execute() {
        TurnOnPhone();
        Calling();
    }
}