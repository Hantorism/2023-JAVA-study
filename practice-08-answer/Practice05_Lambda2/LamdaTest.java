package Practice05_Lambda2;

// 출력 결과
// 10 + 5 = 15
// 10 - 5 = 5
// 10 * 5 = 50

public class LamdaTest {
    public static void main(String[] args) {
        // TODO : 정수 두 개를 입력받아 덧셈을 수행하는 인터페이스 add 구현
        MathOperation add = (a, b) -> a + b;

        // TODO : 정수 두 개를 입력받아 뺄셈을 수행하는 인터페이스 subtract 구현
        MathOperation subtract = (a, b) -> a - b;

        // TODO : 정수 두 개를 입력받아 곱셈을 수행하는 인터페이스 mulitply 구현
        MathOperation multiply = (a, b) -> a * b;

        // 구현한 두 개의 인터페이스 사용
        int result1 = add.operation(10, 5);
        int result2 = subtract.operation(10, 5);
        int result3 = multiply.operation(10, 5);

        System.out.println("10 + 5 = " + result1);
        System.out.println("10 - 5 = " + result2);
        System.out.println("10 * 5 = " + result3);
    }
}

// 덧셈, 뺄셈 등의 수학 연산을 수행하는 인터페이스
interface MathOperation {
    int operation(int a, int b);
}

