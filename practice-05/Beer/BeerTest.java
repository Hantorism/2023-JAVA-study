package Beer;

class Beer {

}

class Cass extends Beer {

}

class Hoegaarden extends Beer {

}

public class BeerTest {
    public static void main(String[] args) {
        // TO DO

        order(h1);
        order(h2);
        order(c);
    }

    static void order(Beer b) {
        if (b instanceof Hoegaarden) {
            // TO DO
        } else if (b instanceof Cass) {
            // TO DO
        }
    }
}