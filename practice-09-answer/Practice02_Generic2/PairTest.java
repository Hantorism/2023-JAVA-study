package Practice02_Generic2;

/* 출력결과
    --------Student--------
    이름 : 김나박
    학번 : 2020207361

    --------ID/PW--------
    ID : 2020207361
    PW : 1234

    --------Couple--------
    남자 : 이명건
    여자 : NULL 
 */

public class PairTest {
    public static void main(String[] args) {
        System.out.println("--------Student--------");
        // TODO : 이름(본인 이름)과 학번(본인 학번)을 담을 수 있는 Pair 객체 studentInfo 생성
        Pair<String, Integer> studentInfo = new Pair<>("김나박", 2020207361);
        System.out.println("이름 : " + studentInfo.getKey());
        System.out.println("학번 : " + studentInfo.getValue());

        System.out.println();
        System.out.println("--------ID/PW--------");
        // TODO : ID(본인 학번)와 PW(아무 숫자)를 담을 수 있는 Pair 객체 IDPWInfo 생성
        Pair<Integer, Integer> IDPWInfo = new Pair<>(2020207361, 1234);
        System.out.println("ID : " + IDPWInfo.getKey());
        System.out.println("PW : " + IDPWInfo.getValue());

        System.out.println();
        System.out.println("--------Couple--------");
        Pair<String, String> CoupleInfo = new Pair<>("이명건", "NULL");
        System.out.println("남자 : "  + CoupleInfo.getKey()); // 이명건
        System.out.println("여자 : " + CoupleInfo.getValue()); // NULL
    }
}
