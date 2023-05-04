package Practice02_Abstract;

public class Person {
    private String name;
    private String phone_number;

    public Person(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "주인 이름 : " + this.name  + "\n" +
                "핸드폰 번호 : " + this.phone_number + "\n";
    }
}
