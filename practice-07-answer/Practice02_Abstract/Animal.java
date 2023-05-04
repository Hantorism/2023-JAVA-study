package Practice02_Abstract;

abstract class Animal{
    // TODO : Add Member Variables for Animal(name, Owner, hunger)
    private String name;
    private Person Owner;
    public int hunger;

    // TODO : Make Animal Constructor for Animal
    public Animal(String name, int hunger, Person Owner) {
        this.name = name;
        this.hunger = hunger;
        this.Owner = Owner;
    }

    // TODO : Make abstract Method eating(), crying()
    public abstract void eating();
    public abstract void crying();

    public void Active(){
        System.out.println();
        System.out.println("배고픈 정도 : " + this.hunger);
        this.eating();
        System.out.println("배고픈 정도 : " + this.hunger);
        this.crying();
        System.out.println("배고픈 정도 : " + this.hunger);
        System.out.println();
    }

    @Override
    public String toString() {
        return "이름 : " + this.name + "\n"
                + "배고픔 정도 : " + this.hunger +"\n"
                + Owner.toString();
    }
}
