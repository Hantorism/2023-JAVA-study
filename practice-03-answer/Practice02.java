public class Practice02 {

    public static void main(String[] args) {
        Account ac = new Account();
        ac.setNumber(100);
        // ac.number : error !!!! can't use private variable in another class.
        System.out.println(ac.getNumber());

    }

}

class Account{
    // TO DO
    private int number;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //
}