package Practice04_Person;

class Person {
    // TO DO : Add Member Variables for Person(name, age)
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // TO DO : Make eat() Method for Person
    public void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }
}

class Student extends Person {
    // TO DO : Add Member Variance for Student(major)
    private String major;
    
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
    
    // TO DO : Override eat() Method for Student
    @Override
    public void eat() {
        System.out.println(name + "가 " + major + " 전공 서적을 읽으며 밥을 먹습니다.");
    }
    
    // TO DO : Add study() Method for Student
    public void study() {
        System.out.println(name + "가 " + major + "를 공부합니다.");
    }
}

class Teacher extends Person {
    // TO DO : Add Member Variance for Teacher(subject)
    private String subject;
    
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    // TO DO : Override eat() Method for Teacher
    @Override
    public void eat() {
        System.out.println(name + "가 " + subject + "과목 관련 강의노트를 보며 혼자 밥을 먹습니다.");
    }
    
    // TO DO : Add teach() Method for Teacher
    public void teach() {
        System.out.println(name + "가 " + subject + "를 가르칩니다.");
    }
}

public class TestPeople {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Student("이장원", 20, "컴퓨터공학");
        people[1] = new Teacher("김한터", 30, "영어");
       
        // TO DO : Make for loop for people
        for (Person person : people) {
            person.eat();
            
            if (person instanceof Student) {
                Student student = (Student) person;
                student.study();
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                teacher.teach();
            }
            
            System.out.println();
        }
    }
}