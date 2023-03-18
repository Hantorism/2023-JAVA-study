class Practice04 {
    public static void main(String args[]) {
        Student std = new Student("Hantor", 1, 30, 90, 88, 100);
        // TO DO : 직접 작성한 생성자로 객체를 하나 더 만들어보자 !

        //

        System.out.println("정보:"+std.getInfo());
        System.out.println("총점:"+std.getTotal());
        System.out.println("평균:"+std.getAverage());
        System.out.println();
        System.out.println("정보:"+std2.getInfo());
        System.out.println("총점:"+std2.getTotal());
        System.out.println("평균:"+std2.getAverage());
    }
}

class Student{
    // TO DO
}