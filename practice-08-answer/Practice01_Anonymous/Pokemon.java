package Practice01_Anonymous;

public abstract class Pokemon {
    String name;
    String type;

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void Cry(){
        System.out.println("This should be changed by anonymous class.");
    }

    public abstract void Attack();

    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("타입: " + type);
    }
}
