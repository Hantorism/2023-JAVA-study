public class Practice01{
    public static void main(String[] args){
        Student[] group = new Student[4];
        // TO DO : assign student instance to array with information
        group[0] = new Student("김자바", 202220736, "software");
        group[1] = new Student("박홍길", 202220712, "software");
        group[2] = new Student("최원딤", 202020842, "Mathematics");
        group[3] = new Student("이장원", 201320712, "economics");
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
    public String name;
    public int studentID;
    public String major;

    public Student(String name, int studentID, String major){
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }
}
