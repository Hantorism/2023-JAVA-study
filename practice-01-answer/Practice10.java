import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("더하기 할 두 숫자를 입력하세요!");
            int num1, num2, result;
            // TO DO
            num1 = sc.nextInt();
            if(num1 == -1) break;
            num2 = sc.nextInt();
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            //

        }
    }
}

/*
 * 출력 예시
 * 
 * 더하기 할 두 숫자를 입력하세요!
 * 1 3
 * 1 + 3 = 4
 * 더하기 할 두 숫자를 입력하세요!
 * 4 5
 * 4 + 5 = 9
 * 더하기 할 두 숫자를 입력하세요!
 * 10 21
 * 10 + 21 = 31
 * 더하기 할 두 숫자를 입력하세요!
 * -1
 */