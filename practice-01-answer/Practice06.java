import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // TO DO : 입력 받은 숫자를 출력
        switch(num) {
            case 1:
                System.out.println("1번을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("2번을 선택하셨습니다.");
                break;
            default:
                return;
        }
        //

    }
}

/*
 * 출력 예시
 * 1
 * 1번을 선택하였습니다.
 */
