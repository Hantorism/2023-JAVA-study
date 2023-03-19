import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Student[] class1 = new Student[30]; // 클래스 배열! 다음 회차에 배웁니다.
        class1[0] = new Student("박자바", 1, 1, 100, 100, 100);
        class1[1] = new Student("김글래스", 1, 2, 100, 100, 100);
        class1[2] = new Student("최변수", 1, 3, 100, 100, 100);
        class1[3] = new Student("리드미", 1, 4, 100, 100, 100);
        class1[4] = new Student("객체", 1, 5, 100, 100, 100);

        Scanner sc = new Scanner(System.in);

        for (Student std : class1) {
            System.out.println("학생 이름 변경 전 : " + std.getName());
            String newName = sc.nextLine();
            std.modifyName(newName);
            System.out.println("학생 이름 변경 후 : " + std.getName() + "\n");
        }
    }
}

class Student{
    // TO DO
}