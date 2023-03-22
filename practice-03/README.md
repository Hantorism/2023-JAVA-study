## Practice 4 : 클래스 실습 예제 - 1

<details>

### **[문제]** 듀얼에서 승리하자

추잡한 유희는 듀얼에서 어떻게든 승리하고자 한다. 유희를 도와 듀얼에서 승리해보자.

### **[설명]** 카드를 표현하기 위한 클래스와 생성자를 만들자

카드는 name(String), description(String), attack(int), defense(int)의 속성들을 갖는다.
<br>생성자는 카드의 이름을 입력받아 값을 할당해 주는 생성자를 만들면 된다

### **[코드]**

```java
public class Practice04 {
    public static void main(String[] args) {

    }
}

class Card {
    String name;
    String description;
    int attack, defense;

    Card(String name) {
        this.name = name
    }
}
```

</details>
<br>

## Practice 5 : 클래스 실습 예제 - 2

<details>

### **[문제]** 듀얼에서 승리하자

추잡한 유희는 듀얼에서 어떻게든 승리하고자 한다. 유희를 도와 듀얼에서 승리해보자.

### **[설명]** 카드를 저장할 수 있는 클래스 배열을 만든 뒤 덱을 미리 설정해두자.

클래스 배열은 각각 deck[60], hand[5]의 이름과 크기를 갖는다
<br> 또한 생성자를 통해 덱의 0~4 인덱스에 미리 엑조디아 카드를 만들어보자
<br> 엑조디아 카드의 구성은 아래와 같으며 각 인덱스별 어느 카드가 위치할지는 상관 없다.
<img width="609" alt="스크린샷 2023-03-22 오후 12 20 24" src="https://user-images.githubusercontent.com/52846766/226793718-181c3279-a587-4fb4-8898-271820016dff.png"><br>
<img width="387" alt="스크린샷 2023-03-22 오후 12 21 22" src="https://user-images.githubusercontent.com/52846766/226793843-fe4e3ba6-e6eb-4a3b-83dc-4b4e61986243.png">

### **[코드]**

```java
public class Practice04 {
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
    }
}

class Card {
    String name;
    String description;
    int attack, defense;

    Card(String name) {
        this.name = name
    }
}
```

</details>
<br>

## Practice 6 : 클래스 실습 예제 - 3

<details>

### **[문제]** 듀얼에서 승리하자

추잡한 유희는 듀얼에서 어떻게든 승리하고자 한다. 유희를 도와 듀얼에서 승리해보자.

### **[설명]** 카드를 뽑을 수 있는 Draw Method를 구현해보자

deck 배열에서 순차적으로 카드를 뽑아 hand 배열로 옮길 수 있는 메서드를 구현해보자.

- 메서드는 static 형태로 Practice04 내에 구현하면 되며, 매개변수로 두 Card[](deck, hand)와 뽑아야 할 카드의 개수를 받아야 한다.
- 카드를 뽑을 경우, Deck 배열 내 각 인스턴스들의 인덱스는 1만큼 감소해야 한다 (1개씩 앞으로 옮겨져야 한다)

### **[코드]**

```java
public class Practice04 {
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
}

class Card {
    String name;
    String description;
    int attack, defense;

    Card(String name) {
        this.name = name;
    }
}
```

</details>
<br>

## Practice 7 : 클래스 실습 예제 - 4

<details>

### **[문제]** 듀얼에서 승리하자

추잡한 유희는 듀얼에서 어떻게든 승리하고자 한다. 유희를 도와 듀얼에서 승리해보자.

### **[설명]** 내가 뽑은 카드를 확인해보자

듀얼에서 승리하기 위해서는 서로 다른 5장의 엑조디아 카드가 필요하고, 지금 5장의 카드를 뽑은 상태이다.
<br> 승리 조건을 확인하기 위해 지금 뽑은 5장의 카드의 이름을 확인해보자
<br> 서로 다른 엑조디아 카드일 경우, 추잡한 유희는 이 듀얼에서 승리하게 될 것이다

### **[코드]**

```java
public class Practice04 {
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
```

</details>
<br>
