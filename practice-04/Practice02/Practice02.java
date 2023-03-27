package practice02;

public class Practice02 {
    public static void main(String args[]) {
        Shop[] shops = new Shop[5];
        for(int a=0; a<3; a++) {
            shops[a] = new Shop("한터 " + (a+1) +"호점", 10000 *(a + 1));
        }

        shops[0].getOrder();	shops[0].getOrder();	shops[0].getOrder();
        shops[1].getOrder();	shops[1].getOrder();
        shops[2].getOrder();

        for(int a=0; a<3; a++) {
            shops[a].getInfo();
        }

        // TO DO 1 : print orderNumber value

        //
    }
}

class Shop{
    public String name;
    static int orderNumber = 0;
    public int price;
    public int income = 0;

    public Shop(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // TO DO 2 : make getOrder Method

    //

    public void getInfo() {
        System.out.println("\nSHOP NAME : " + this.name);
        System.out.println("MENU PRICE : " + this.price);
        System.out.println("SHOP INCOME : " + this.income);
    }
}
