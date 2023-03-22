public class Practice03 {
    public static void main(String[] args) {
        // hint : Class 배열을 생성하는 방법
        // ClassName[] arrayName = new ClassName[arrayLength];
        Card[] deck = new Card[60];
        Card[] hand = new Card[5];

        // hint : 배열의 각 요소에 접근하는 방법
        // arrayName[index] = ?
        deck[0] = new Card("봉인된 자의 오른쪽 팔");
        deck[1] = new Card("봉인된 자의 왼쪽 팔");
        deck[2] = new Card("봉인된 자의 오른쪽 다리");
        deck[3] = new Card("봉인된 자의 왼쪽 다리");
        deck[4] = new Card("봉인된 엑조디아");

        // hint : deck의 5장의 카드를 hand로 가져와야 한다
        for (int i = 0; i < 5; i++) {
            draw(deck, hand, i);
        }

        // hint : hand의 각 카드의 이름을 체크하는 메소드를 만들어보자
        boolean result = checkHand(hand);

        if (result) {
            System.out.println("게임에서 승리하였습니다");
        }
    }

    static void draw(Card[] deck, Card[] hand, int index) {
        // hint : deck의 첫 번째 요소를 hand로 옮기자
        hand[index] = deck[0];
        System.out.println(hand[index].name + "을 뽑았습니다");

        // hint : deck의 요소들을 다음 요소의 값으로 덮어씌우자
        // 덮어씌우는 배열의 개수는 뽑힌 카드의 수만큼 감소해야 한다
        for (int i = 0; i < 5 - index; i++) {
            deck[i] = deck[i + 1];
        }
    }

    static boolean checkHand(Card[] hand) {
        int count = 0;

        for (Card card : hand) {
            if (card.name.contains("엑조디아")) {
                count++;
            } else if (card.name.contains("오른쪽 팔")) {
                count++;
            } else if (card.name.contains("왼쪽 팔")) {
                count++;
            } else if (card.name.contains("오른쪽 다리")) {
                count++;
            } else if (card.name.contains("왼쪽 다리")) {
                count++;
            } else if (card.name.contains("엑조디아")) {
                count++;
            }
        }

        if (count == 5) {
            return true;
        }

        return false;
    }
}

class Card {
    String name;
    String description;
    int attack, defense;

    Card(String name) {
        this.name = name;
    }
}