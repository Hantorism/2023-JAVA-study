package Practice02_Abstract;

class Cat extends Animal{
    // TODO : Add Member Variance for Practice02_Abstract.Cat (cuteness)
    public int cuteness;

    // TODO : Make constructor for Practice02_Abstract.Cat
    public Cat(String name, int hunger, Person Owner, int cuteness){
        // TODO : Have to use super( ... ) constructor
        super(name, hunger, Owner);
        this.cuteness = cuteness;
    }

    // TODO : Override Eating Method for Practice02_Abstract.Cat
    @Override
    public void eating() {
        System.out.println("냠냠");
        super.hunger -= 1;
    }

    // TODO : Override Crying Method for Practice02_Abstract.Cat
    @Override
    public void crying() {
        System.out.println("야옹");
        super.hunger += 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "귀여운 정도 : " + this.cuteness;
    }
}



