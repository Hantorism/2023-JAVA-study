import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TO DO : 0이 아닌 정수를 입력하고, 양수면 "숫자는 양수"를. 음수면 "숫자는 음수"를 출력하기
        int num = sc.nextInt();
        System.out.println("숫자는 " + (num > 0 ? "양수" : "음수" ));
    }
}

/*
다른 답안
 int num = sc.nextInt();
        if(num > 0){
            System.out.println("숫자는 양수");
        } else {
            System.out.println("숫자는 음수");
        }
 */