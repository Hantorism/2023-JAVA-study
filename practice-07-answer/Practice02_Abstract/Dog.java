package Practice02_Abstract;

public class Dog extends Animal {
    // TODO : Add Member Variance for Practice02_Abstract.Dog (activeness)
    public int activities;

    // TODO : Make constructor for Practice02_Abstract.Dog
    public Dog(String name, int hunger, Person Owner, int activities){
        // TODO : Have to use super( ... ) constructor
        super(name, hunger, Owner);
        this.activities = activities;
    }

    // TODO : Override Eating Method for Practice02_Abstract.Dog
    @Override
    public void eating() {
        System.out.println("쩝쩝");
        super.hunger -= 2;
    }

    // TODO : Override Crying Method for Practice02_Abstract.Dog
    @Override
    public void crying() {
        System.out.println("멍멍");
        super.hunger += 1;
    }

    @Override
    public String toString() {
        return super.toString() +
                "활발한 정도 : " + this.activities;
    }
}
