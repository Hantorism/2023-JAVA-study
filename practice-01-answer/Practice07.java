import java.util.Scanner;
import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter grade : ");
        String letterGrade = sc.nextLine();

        double gradePoint;

        // TO DO : 알파벳 학점을 소수점 형태의 학점으로 변환하기
        switch (letterGrade) {
            case "A+":
                gradePoint = 4.5;
                break;

            case "A" :
            case "A0":
                gradePoint = 4.0;
                break;

            case "B+":
                gradePoint = 3.5;
                break;

            case "B" :
            case "B0":
                gradePoint = 3.0;
                break;

            default:
                System.out.println("재수강");
                return;
        }
        //
        System.out.println(letterGrade + " = " + gradePoint);
    }
}

/*
 * 출력 예시 1
 * Enter a letter grade : A
 * A = 4.0
 * 
 * 출력 예시 2
 * Enter a letter grade : A0
 * A0 = 4.0
 * 
 * 출력 예시 3
 * Enter a letter grade : C
 * 재수강
 */
