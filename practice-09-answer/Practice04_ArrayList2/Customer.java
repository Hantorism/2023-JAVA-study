package Practice04_ArrayList2;

public class Customer {
    private String name;
    private int age;
    private int money;

    public Customer(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getMoney() {
        return money;
    }
    
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "고객 [이름=" + name + ", 나이=" + age + ", 자금=" + money + "]";
    }
}
