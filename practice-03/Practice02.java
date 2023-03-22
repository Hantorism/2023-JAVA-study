public class Practice02 {

    public static void main(String[] args) {
        Account ac = new Account();
        ac.setNumber(100); // ac.number : error !!!! can't use private variable in another class.
        System.out.println(ac.getNumber());

    }

}

class Account{
    // TO DO : make member variable and method with conditions.

    //
}

// 출력결과: 100