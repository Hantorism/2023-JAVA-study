package practice07;

interface Beer {
    void drink();

    void getType();

    void getABV();
}

class Cass implements Beer {
    String type;
    String model;
    int ABV;

    Cass(String type, String model, int ABV) {
        this.type = type;
        this.model = model;
        this.ABV = ABV;
    }

    public void drink() {
        System.out.println(model + "을 마십니다");
    }

    public void getType() {
        System.out.println(model + "의 타입 : " + type);
    }

    public void getABV() {
        System.out.println(model + "의 도수 : " + ABV);
    }
}

class Hoegaarden implements Beer {
    String type;
    String model;
    String flavor;
    int ABV;

    Hoegaarden(String type, String model, int ABV, String flavor) {
        this.type = type;
        this.model = model;
        this.ABV = ABV;
        this.flavor = flavor;
    }

    public void drink() {
        System.out.println(flavor + "맛 " + model + "을(를) 마십니다\n");
    }

    public void getType() {
        System.out.println(model + "의 타입 : " + type);
    }

    public void getABV() {
        System.out.println(model + "의 도수 : " + ABV);
    }

    public void getFlavor() {
        System.out.println(model + "의 맛 : " + flavor);
    }
}

public class BeerTest {
    public static void main(String[] args) {
        Hoegaarden h1 = new Hoegaarden("밀맥주", "호가든", 5, "레몬");
        Hoegaarden h2 = new Hoegaarden("밀맥주", "호가든", 5, "일반");
        Cass c = new Cass("밀맥주", "카스", 6);

        order(h1);
        order(h2);
        order(c);
    }

    static void order(Beer b) {
        if (b instanceof Hoegaarden) {
            Hoegaarden h = (Hoegaarden) b;
            h.getType();
            h.getABV();
            h.getFlavor();
            h.drink();
        } else if (b instanceof Cass) {
            Cass c = (Cass) b;
            c.getType();
            c.getABV();
            c.drink();
        }
    }
}