## Practice 2 : Abstract Class 문제

### 문제

  Animal 추상 클래스는 Dog 클래스와 Cat 클래스의 공통 조상 클래스로 이용된다. Animal의 eating 추상 메소드와 crying 추상 메소드는 각각의 자손 클래스에서 다른 기능을 수행하며 **완성된 메소드(concrete method**)가 된다.

  Animal 추상 클래스, Dog 클래스, Cat 클래스를 완성해보고 Test의 정상 작동을 확인하자

  ### **[설명]**

  **Animal** 추상 클래스를 작성하고자 한다. Animal 추상 클래스의 구성요소는 다음과 같다.

- **Animal 추상 클래스의 멤버변수 및 메소드**

    | 접근제어자 | 자료형 | 변수명 | 설명 |
    | --- | --- | --- | --- |
    | private | String | name | 동물의 이름를 담는 멤버 변수 |
    | public | int | hunger | 동물의 배고픈 정도를 담는 멤버 변수 |
    | private | Person | Owner | 동물의 주인 객체를 담은 멤버 변수 |

    | 접근제어자 | 메소드 타입 | 반환타입 | 메소드명 | 설명 |
    | --- | --- | --- | --- | --- |
    | public  | - | X(생성자) | Animal | Animal 생성자 |
    | public | abstract | void | eating | 밥을 먹어 배고픈 정도 변화시키는 메소드 |
    | public | abstract | void | crying | 울고 나서, 배고픈 정도를 변화시키는 메소드 |

  - **Cat 클래스의 멤버변수 및 메소드**

  | 접근제어자 | 자료형 | 변수명 | 설명 |
  | --- | --- | --- | --- |
  | public | int | cuteness | 고양이의 귀여운 정도를 담는 멤버 변수 |
  
  | 접근제어자 | 메소드 타입 | 반환타입 | 메소드명 | 설명 | 
  | --- | --- | --- | --- | --- |
  | public | - | X(생성자) | Cat | Cat 인스턴스 생성자 | 
  | public | - | void | eating | “냠냠” 소리를 내면서 밥을 먹어, 배고픈 정도 -1 만큼 변화시키는 메소드 | 
  | public | - | void | crying | “야옹” 울음 소리를 내면서 울고 나서, 배고픈 정도를 +2 만큼 변화시키는 메소드 | 

- **Dog 클래스의 멤버변수 및 메소드**
    
    | 접근제어자 | 자료형 | 변수명 | 설명 |
    | --- | --- | --- | --- |
    | public | int | activities | 강아지의 활발함 정도는 나타내는 멤버 변수 |
    
    | 접근제어자 | 메소드 타입 | 반환타입 | 메소드명 | 설명 |
    | --- | --- | --- | --- | --- |
    | public | - | X(생성자) | Dog | Dog 인스턴스 생성자 |
    | public | - | void | eating | “쩝쩝” 소리를 내면서 밥을 먹어, 배고픈 정도 -2 만큼 변화시키는 메소드 |
    | public | - | void | crying | “멍멍” 울음 소리를 내면서 울고 나서, 배고픈 정도를 +1 만큼 변화시키는 메소드 |

![image](https://user-images.githubusercontent.com/107465938/235878143-3d9507fe-4666-4254-87b3-81735331b9d5.png)

## Practice 4 : 다형성 이론 및 문제

  ### **문제 설명**

  Person 클래스를 작성하고자 한다. Person 클래스의 구성요소는 다음과 같다.

  - **Person 클래스의 멤버 변수 및 메소드**

    | 접근제어자 | 자료형 | 변수명 | 설명 |
    | --- | --- | --- | --- |
    | protected | String | name | 사람의 이름을 담는 멤버 변수 |
    | protected | int | age | 사람의 나이를 담는 멤버 변수 |
  
    | 접근제어자 | 메소드 타입 | 반환타입 | 메소드명 | 설명 | 
    | --- | --- | --- | --- | --- |
    | public | - | void | eat() | 밥을 먹는 행동을 수행하는 메소드 |
    
  - **Student 클래스의 멤버 변수 및 메소드**

    | 접근제어자 | 자료형 | 변수명 | 설명 |
    | --- | --- | --- | --- |
    | private | String | major | 학생의 전공을 담는 멤버 변수 |
  
    | 접근제어자 | 메소드 타입 | 반환타입 | 메소드명 | 설명 | 
    | --- | --- | --- | --- | --- |
    | public | - | void | study() | 전공을 공부하는 행동을 수행하는 메소드 |
    | public | - | void | eat() | 전공 서적을 읽으며 밥을 먹는 행동을 수행하는 메소드 |
    
  - **Teacher 클래스의 멤버 변수 및 메소드**

    | 접근제어자 | 자료형 | 변수명 | 설명 |
    | --- | --- | --- | --- |
    | private | String | subject | 선생님의 담당 과목을 담는 멤버 변수 |
  
    | 접근제어자 | 메소드 타입 | 반환타입 | 메소드명 | 설명 | 
    | --- | --- | --- | --- | --- |
    | public | - | void | teach() | 담당 과목을 가르치는 행동을 수행하는 메소드 |
    | public | - | void | eat()  | 수업 과목 강의 노트를 보며 밥을 먹는 행동을 수행하는 메소드 |

  위 구성요소를 바탕으로, 다음 순서에 따라 코드를 작성해보자

  ### 1단계 : 클래스 작성하기

  - Person 클래스를 작성하기
  - Student, Teacher 클래스를 Person 클래스를 상속 받아 작성하기.

  ### 2단계 : TestPeople 클래스의 main 문 작성하기

  - TestPeople 클래스에서 Person 배열을 만들어 Student, Teacher 객체를 할당한다. 멤버 변수는 자유롭게 하자.
  - for-each 문을 이용하여 배열 내의 Person 객체들의 eat() 메소드를 호출하고, instanceof 연산자를 이용하여 Student, Teacher 객체를 구분하여 각각이 가진 메소드인 study(), teach()를 호출 할 수 있도록 하자.
   
![image](https://user-images.githubusercontent.com/107465938/235878405-c2feccf1-8325-432a-a7df-671d7e2bdb59.png)

## Practice 6 : Interface 다형성 문제

- 문제 설명

  실행할 수 있음을 의미하는 Executable 인터페이스를 작성하여, 실행할 수 있는 것들을 한 곳에 묶어 다음과 같이 작성하려고 한다. 문제의 조건은 다음과 같다.

  - **Executable interface**

      | 접근제어자 | 반환타입 | 변수명 | 설명 |
      | --- | --- | --- | --- |
      | - | void | execute() | 무언가를 실행하는 메소드 |

  - **Phone 클래스**

      | 접근 제어자 | 자료형 | 변수명 | 설명 |
      | --- | --- | --- | --- |
      | private | String | number | 핸드폰 번호를 저장하는 멤버 변수 |
        
      | 접근 제어자 | 반환 타입 | 메소드명 | 설명 |
      | --- | --- | --- | --- |
      | public  | - | Phone(String number) | 전달받은 핸드폰 번호를 설정하는 생성자 |
      | public  | void | TurnOnPhone() | “핸드폰 켜가” 출력 |
      | public | void  | Calling() | “{number}에 전화 거는 중” 출력 |
      | public | void | execute() | TurnOnPhone(), Calling() 실행 |
  - **Car 클래스**

      | 접근 제어자 | 자료형 | 변수명 | 설명 |
      | --- | --- | --- | --- |
      | private | String | model | 차 모델명을 저장하는 멤버 변수 |
        
      | 접근 제어자 | 반환 타입 | 메소드명 | 설명 |
      | --- | --- | --- | --- |
      | public | X ( 생성자 ) | Car(String model) | 차 모델명을 설정하는 생성자 |
      | public  | void | StartCar() | “시동 켜기” 출력 |
      | public | void  | Driving() | “{model} 운전 중” 출력 |
      | public | void | execute() | StartCar(), Driving() 실행 |

![image](https://user-images.githubusercontent.com/107465938/235878230-cacbb1ad-1470-458c-be49-244c40a0cb60.png)

## Practice 8 : Inner Class 문제

- 문제 설명

  위의 Inner 클래스 응용 예제에서는 내부 클래스를 instance 클래스로 선언한 경우였다.

  이를 local 클래스로 선언하는 경우로 변경해보자.

  ### 기존 코드

    ```java
    import java.awt.Toolkit;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Date;
    import javax.swing.Timer;
    
    class TalkingClock {// outer class 
            private int interval; // interval between two announcements
            private boolean beep; // flag to turn beeps on or off
            
    				// TalkingClock Constructor
            public TalkingClock(int interval, boolean beep) {
            	this.interval = interval;
            	this.beep = beep;
            }
            
    				// TimePrinter inner class 시작
            public class TimePrinter implements ActionListener
            {
            	public void actionPerformed(ActionEvent event)
            	{
            			System.out.println("At the tone, the time is " + new Date());
            			if (beep) // 내부 클래스에서 외부 클래스의 변수 사용 가능!
    								 Toolkit.getDefaultToolkit().beep();
    							
            	}
            } // inner class 끝
            
            public void start() {
    					// Make InnerClass TimePrinter's instance
            	ActionListener listener = new TimePrinter();
            	Timer t = new Timer(interval, listener);
            	t.start(); // use Timer Class's start() method.
            }
    } // end of class
    ```

  TODO : start() 메소드안으로 TimePrinter 클래스를 옮겨서, Local 클래스 타입으로 inner 클래스를 변경해보자.

  !! 참고 : Local inner 클래스는 메소드나 초기화 블록 내에서 선언되며, 해당 블록 내에서만 사용할 수 있기 때문에 접근 제어자를 가질 수 없다. !!
  
  ![image](https://user-images.githubusercontent.com/107465938/235878449-e665f141-282c-4f04-8854-dc08bf023ee2.png)

