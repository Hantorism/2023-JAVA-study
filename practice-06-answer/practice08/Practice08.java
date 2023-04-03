package practice08;

interface PC {
    public void getModel();

    public void getPrice();

    public void getManufacture();
}

class Macbook implements PC {
    String model;
    int price;
    int manufacturedAt;
    String version;

    Macbook(String model, int price, int manufacturedAt, String version) {
        this.model = model;
        this.price = price;
        this.manufacturedAt = manufacturedAt;
        this.version = version;
    }

    public void getModel() {
        System.out.println("모델 : " + model);
    }

    public void getPrice() {
        System.out.println("가격 : " + price);
    }

    public void getManufacture() {
        System.out.println("제조년월 : " + manufacturedAt);
    }

    public void getVersion() {
        System.out.println("버전 : " + version);
    }
}

class Gram implements PC {
    String model;
    int price;
    int manufacturedAt;

    Gram(String model, int price, int manufacturedAt) {
        this.model = model;
        this.price = price;
        this.manufacturedAt = manufacturedAt;
    }

    public void getModel() {
        System.out.println("모델 : " + model);
    }

    public void getPrice() {
        System.out.println("가격 : " + price);
    }

    public void getManufacture() {
        System.out.println("제조년월 : " + manufacturedAt);
    }
}

public class Practice08 {
    public static void main(String[] args) {
        // TO DO
        Macbook m1 = new Macbook("맥북프로", 2400000, 2023, "애플 실리콘");
        Macbook m2 = new Macbook("맥북에어", 1500000, 2021, "인텔 실리콘");
        Gram g1 = new Gram("그램", 1100000, 2022);

        order(m1);
        order(m2);
        order(g1);
    }

    static void order(PC p) {
        if (p instanceof Gram) {
            p.getModel();
            p.getPrice();
            p.getManufacture();

            System.out.println("이게 아니야\n");
        } else if (p instanceof Macbook) {
            Macbook m = (Macbook) p;

            if (m.version.equals("인텔 실리콘")) {
                m.getModel();
                m.getPrice();
                m.getManufacture();
                m.getVersion();

                System.out.println("이게 아니야\n");
            } else if (m.version.equals("애플 실리콘")) {
                m.getModel();
                m.getPrice();
                m.getManufacture();
                m.getVersion();

                System.out.println("이걸로 주세요\n");
            }
        }

    }
}
