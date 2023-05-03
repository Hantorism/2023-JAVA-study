package Practice02_Abstract;

abstract class Animal{
    // TODO : Add Member Variables for Animal(name, Owner, hunger)
    

    // TODO : Make Animal Constructor for Animal
    

    // TODO : Make abstract Method eating(), crying()
    
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
