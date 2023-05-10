package Practice01_Anonymous;
// 출력 결과
// 이름: 피카츄
// 타입: 전기
// 귀여운 정도: 100
// 피카피카
// 백만볼트

// 이름: 꼬부기
// 타입: 물
// 축축한 정도: 100
// 꼬북꼬북
// 물대포

// 이름: 파이리
// 타입: 불꽃
// 뜨거운 정도: 100
// 파이파이
// 화염방사

public class AnonymousTest {
    public static void main(String[] args) {

        Pokemon Pikachu = new Pokemon("피카츄", "전기"){
            private int cuteness = 100;

            @Override
            public void Cry(){
                System.out.println("피카피카");
            }
            @Override
            public void Attack(){
                System.out.println("백만볼트");
            }
            @Override
            public void showInfo(){
                super.showInfo();
                System.out.println("귀여운 정도: " + cuteness);
            }
        };

        Pokemon Squirtle = new Pokemon("꼬부기", "물"){
            private int dampness = 100;

            @Override
            public void Cry(){
                System.out.println("꼬북꼬북");
            }
            @Override
            public void Attack(){
                System.out.println("물대포");
            }
            @Override
            public void showInfo(){
                super.showInfo();
                System.out.println("축축한 정도: " + dampness);
            }
        };

        Pokemon Charmander = new Pokemon("파이리", "불꽃"){
            private int hotness = 100;

            @Override
            public void Cry(){
                System.out.println("파이파이");
            }
            @Override
            public void Attack(){
                System.out.println("화염방사");
            }
            @Override
            public void showInfo(){
                super.showInfo();
                System.out.println("뜨거운 정도: " + hotness);
            }
        };

        Pokemon[] pokemonBox = {Pikachu, Squirtle, Charmander};
        for(Pokemon pokemon : pokemonBox){
            pokemon.showInfo();
            pokemon.Cry();
            pokemon.Attack();
            System.out.println();
        }
        
    }
}
