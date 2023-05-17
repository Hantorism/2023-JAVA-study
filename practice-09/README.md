# Practice 01 - Generic 1

### [문제 설명]
완성된 지네릭 클래스 Box를 이용하여 TODO를 채워 다음과 같은 출력 결과를 만들어보세요.

### [출력 결과]
```java
Hello World!
1234
```

<br><br>
# Practice 02 - Generic 2

### [문제 설명]
Pair 지네릭 클래스는 두 개의 값을 저장할 수 있는 클래스이다.
하나의 지네릭 클래스에 여러 개의 타입 파라미터를 사용할 수 있다. ex) `<A, B>`

1. Pair 클래스의 TODO 채우기
   - 멤버변수
   - 생성자
  
2. PairTest 클래스의 main문의 TODO
    - 이름, 학번을 담을 수 있는 studentInfo 객체 생성
    - ID, PW를 숫자의 형태로 담을 수 있는 IDPWInfo 객체 생성
    - 남자, 여자의 이름을 담을 수 있는 coupleInfo 객체 생성

Pair 클래스를 이용하여 다음과 같은 출력 결과를 만들어보세요.

### [출력 결과]
```java
--------Student--------
이름 : 김나박
학번 : 2020207361

--------ID/PW--------
ID : 2020207361
PW : 1234

--------Couple--------
남자 : 이명건
여자 : NULL 
```

<br><br>

# Practice 03 - ArrayList 1

### [문제 설명]
### 교수님 저 성적이 이상합니다. 저번 시험에 10등 했는데요??

위의 메일을 받은 교수님은 학생의 성적표(ReportCard)에 잘못된 성적이 들어가있는 것을 발견했다.
학점 중에서 **B0를 지우고**, A0를 주려했으나 예의가 없어 **B+을 주기로 결정**하였다.

아래의 메소드들을 참고하여서 학생의 성적표를 수정해보자.

1. ArrayListObject.**add**(E element) <br>
   설명 : ArrayList의 맨 뒤에 element를 추가한다. <br>
   반환값 : 추가 성공 시 true, 실패 시 false

2. ArrayListObject.**add**(int index, E element) <br>
   설명 : ArrayList의 index번째에 element를 추가한다. <br>
   반환값 : 추가 성공 시 true, 실패 시 false

3. ArrayListObject.**remove**(int index) <br>
   설명 : ArrayList의 index번째의 element를 삭제한다. <br>
   반환값 : 삭제 성공 시 삭제된 element, 실패 시 null

### [출력 결과]
```java
귀하의 성적은 다음과 같습니다.
[A+, A0, B0, A+]
귀하의 변경된 성적은 다음과 같습니다.
[A+, A0, B+, A+]
```
<br><br>

# Practice 04 - ArrayList 2

### [문제 설명]

이전의 Practice 03에서는 ArrayList의 기본적인 메소드들을 사용해보았다.
그리고 ArrayList에 String 타입의 데이터를 저장하였었다. 이번엔 직접 정의한 클래스를 넣어보자. <br> 완성된 Customer 클래스가 있다. 이 클래스를 이용하여 ArrayList에 데이터를 넣어보자.


추가로 사용해야할 메소드는 다음과 같다. <br>
ArrayListObject.**get**() <br>
설명 : ArrayList의 index번째의 element를 반환한다. 
반환값 : index번째의 element


1. Customer 객체를 저장할 수 있는 ArrayList Shop을 생성한다.
2. Customer 객체를 3개 생성한다.
3. 3개의 Customer 객체를 Shop에 추가한다.
4. Shop의 내용을 출력한다.
5. Customer 객체 중 money가 0 이하인 객체를 삭제한다.
6. Shop의 내용을 다시 출력한다.

### [출력 결과]

```java
    고객 [이름=홍길동, 나이=20,자금=10000]
    고객 [이름=리드미, 나이=30,자금=20000]
    고객 [이름=박상준, 나이=24,자금=0]
    0원 이하의 고객을 제거한 후
    고객 [이름=홍길동, 나이=20,자금=10000]
    고객 [이름=리드미, 나이=30,자금=20000] 
```

<br><br>

# Practice 05 - ArrayList 3

### [문제 설명]

Stack 구조를 이용하여 ArrayList를 구현해보자.
자세한 구현 내용은 코드에 전부 포함되어 있다.

### [출력 결과]

```java
3
2
1
C++
Python
Java
```

