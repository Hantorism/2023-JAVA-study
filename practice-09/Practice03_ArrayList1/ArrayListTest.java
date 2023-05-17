package Practice03_ArrayList1;
/* 출력 결과
    귀하의 성적은 다음과 같습니다.
    [A+, A0, B0, A+]
    귀하의 변경된 성적은 다음과 같습니다.
    [A+, A0, B+, A+]
*/

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> ReportCard = new ArrayList<String>();

        // TODO : A+, A0, B0, A+ 추가

        System.out.println("귀하의 성적은 다음과 같습니다.");
        System.out.println(ReportCard);

        // TODO : B0 지우고, 그 자리에 B+ 추가

        System.out.println("귀하의 변경된 성적은 다음과 같습니다.");
        System.out.println(ReportCard);
    }
}
