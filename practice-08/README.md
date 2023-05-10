# Practice 01 - 익명 클래스

### [문제 설명]

사실 포켓몬스터 세상에는 각각의 종류별로 포켓몬은 1마리씩 밖에 존재하지 못한다. 따라서 여러 개의 클래스를 만들기보다는 추상 클래스로 공통된 부분을 작성하고, 익명 클래스로 각각의 포켓몬들의 특징을 구현하는 것이 효율적이다. 이번 실습에서는 이미 작성된 추상 클래스의 포켓몬의 공통된 부분과 익명 클래스를 이용하여 각각의 포켓몬들의 특징을 구현해보자.
 
1. 피카츄
 
    | 접근 제어자| 멤버 변수명 | 설명 |
    | :-----: | :-------: | :---------: |
    | private |   cuteness    |   피카츄 귀여웡    |
    
    | Override | 메소드 | 설명 |
    | :--------: | :-------: | :---------: |
    | O |   cry    |   "피카피카" 출력    |
    | O |   attack    |   "전기공격" 출력    |
    | O |   showInfo    |  Pokemon 클래스의 showInfo + cuteness 정보 출력   |

2. 꼬부기

     | 멤버 변수명 | 설명 |
     | :-------: | :---------: |
     |   dampness    |   꼬부기 축축해   |
     
     | Override | 메소드 | 설명 |
     | :--------: | :-------: | :---------: |
     | O |   cry    |   "꼬북꼬북" 출력    |
     | O |   attack    |   "물대포" 출력    |
     | O |   showInfo    |  Pokemon 클래스의 showInfo + dampness 정보 출력   |

3. 파이리

     | 멤버 변수명 | 설명 |
     | :-------: | :---------: |
     |   hotness    |   파이리 뜨겁다   |
     
     | Override | 메소드 | 설명 |
     | :--------: | :-------: | :---------: |
     | O |   cry    |   "파이파이" 출력    |
     | O |   attack    |   "화염방사" 출력    |
     | O |   showInfo    |  Pokemon 클래스의 showInfo + hotness 정보 출력   |

### 출력 결과
    
```java
이름: 피카츄
타입: 전기
귀여운 정도: 100
피카피카
백만볼트

이름: 꼬부기
타입: 물
축축한 정도: 100
꼬북꼬북
물대포

이름: 파이리
타입: 불꽃
뜨거운 정도: 100
파이파이
화염방사
```

# Practice 02 - 예외 처리 1

### [문제 설명]

주어진 코드에서 TODO 부분을 적절하게 채우세요.
###  힌트
- NullPointerException<br>
   참조하려는 객체가 null 값을 갖는 경우
- NoSuchElementException <br>
 컬렉션에서 요소를 가져오려고 할 때, 해당 요소가 없는 경우 ( 찾을 수 없는 경우)
- ArithmeticException <br>
→ 0으로 나누려는 것과 같은 수학 연산에서 오류가 발생한 경우
- IndexOutOfBoundsException <br>
→ 배열이나 리스트 등의 인덱스 범위를 벗어난 경우
- ClassCastException <br>
→ 클래스 형변환 예외로, 변환할 수 없는 클래스로 형변환하려고 시도하는 경우

### 출력 결과

```java
Index 4 out of bounds for length 4
```

# Practice 03 - 예외 처리 2

### [문제 설명]

주어진 코드의 문제점을 파악하고, 수정하세요

**힌트 : Exception은 모든 예외의 조상이다.**

### 출력 결과

```java
Index 4 out of bounds for length 4 
```
# Practice 04 - 람다식 1
![람다식1](https://user-images.githubusercontent.com/107465938/236723666-50d8c715-fcd3-45eb-afbc-448889c7bc12.png)

# Practice 05 - 람다식 2

### [문제 설명]

다음과 같은 함수형 인터페이스(추상 메소드가 한 개 존재하는 인터페이스)가 있다. 
```java
interface MathOperation {
    int operation(int a, int b);
}
```

이 인터페이스와 람다식을 이용하여 여러 개의 수학 연산을 수행하고자 한다.
연산의 종류는 다음과 같다.

1. 덧셈

2. 뺄셈

3. 곱셈

### 출력결과

```java
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
```

# Practice 06 - 람다식 3

### [문제 설명]

이번 문제에서는 Practice 05에서 제공하였던 인터페이스까지 구현해보는 문제이다.

인터페이스의 세부 사항은 다음과 같다.
1. 인터페이스 명 : `MakeDouble`
2. 추상 메소드 명 : `makeDouble`
3. `makeDouble`의 기능 : 매개변수로 받은 정수를 2배로 만들어 반환한다.

### 출력결과

```java
Before
arr[0] = 1
arr[1] = 2
arr[2] = 3
arr[3] = 4
arr[4] = 5
After
arr[0] = 2
arr[1] = 4
arr[2] = 6
arr[3] = 8
arr[4] = 10
```