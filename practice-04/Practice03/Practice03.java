package Practice03;

public class Practice03{
    public static void main(String[] args) {
        Customer cus = new Customer("README", "010-1111-2222");
        Account acc = new Account(1234, "Hantor", cus);
        acc.showInfo();
    }
}

class Account {
    // TO DO : Write member variable

    //

    public Account(int AccountNum, String bankName, Customer customer) {
        this.AccountNum = AccountNum;
        this.bankName = bankName;
        this.customer = customer;
    }

    public void showInfo(){
        System.out.println("AccountNum : " + this.AccountNum);
        System.out.println("bankName : " + this.bankName);
        System.out.println("customer " + this.customer);
    }
}

class Customer {
    // TO DO : Write member variable

    //

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "name : " + this.name + ", phoneNumber : " + this.phoneNumber;
    }
}
