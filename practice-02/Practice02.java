public class Practice02{
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "HANTOR";
        std.ban = 2;
        std.no = 4;
        std.kor = 100;
        std.math = 90;
        std.eng = 95;

        System.out.println("학생의 이름 : " + std.getName());
        System.out.println("학생의 반 : " + std.getBan());
        System.out.println("학생의 번호 : " + std.getNo());
        System.out.println("국어 성적 : " + std.getKor());
        System.out.println("수학 성적 : " + std.getMath());
        System.out.println("영어 성적 : " + std.getEng());
    }
}

class Student{
    // TO DO
}