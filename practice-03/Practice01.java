public class Practice01{
    public static void main(String[] args){
        Student[] group = new Student[4];
        // TO DO : assign student instance to array with information

        //

        for(int a = 0; a < 4; a++){
            System.out.println(group[a].name + " " + group[a].studentID + " " + group[a].major);
        }

        int captain = (int)(Math.random() * 4); // 0부터 4까지 무작위로 조장 선정
        System.out.println(group[captain].name + " 조장님 잘 부탁드려요~");
    }
}

class Student{
    // TO DO : make variable

    //

    public Student(String name, int studentID, String major){
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }
}

/*
출력 결과 :
(마지막 문장은 4명 중에 무작위로 선정됩니다.)

김자바 202220736 software <br>
박홍길 202220712 software <br>
최원딤 202020842 Mathematics <br>
이장원 201320712 economics <br>
최원딤 조장님 잘 부탁드려요~ <br>
 */