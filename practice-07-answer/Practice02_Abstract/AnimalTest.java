package Practice02_Abstract;

public class AnimalTest {
    public static void main(String[] args) {
        Person[] OwnerClub = new Person[2];
        OwnerClub[0] = new Person("HANTOR", "010-1234-5678");
        OwnerClub[1] = new Person("JAVA", "010-1111-2222");

        Animal[] LoveHouse = new Animal[2];
        LoveHouse[0] = new Cat("Tom", 5, OwnerClub[0], 5);
        LoveHouse[1] = new Dog("Frodo", 5, OwnerClub[1], 10);

        for(Animal a : LoveHouse) {
            System.out.println(a.toString()); // 동물의 정보를 출력
            a.Active(); // 울기 전 배고픈 정도, 울고 난 후 배고픈 정도, 밥 먹고 난 후 배고픈 정도를 출력
        }

    }
}
