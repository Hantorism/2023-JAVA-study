class Practice03 {
    public static void main(String args[]) {
        Student std = new Student(); // 기본 생성자를 통해 객체 생성하기
        std.name = "Hantor"; // 멤버 변수에 직접 접근하여 값 할당하기
        std.ban = 2;
        std.no = 4;
        std.kor = 90;
        std.math = 100;
        std.eng = 95;

        std.getInfo();
        System.out.println("학생의 총점:"+std.getTotal());
        System.out.println("학생의 평균:"+std.getAverage());
    }
}

class Student{
    // TO DO
}