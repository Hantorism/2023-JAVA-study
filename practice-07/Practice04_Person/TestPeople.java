package Practice04_Person;

class Person {
    // TO DO : Add Member Variables for Person(name, age)

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // TO DO : Make eat() Method for Person
    
}

class Student extends Person {
    // TO DO : Add Member Variance for Student(major)
    
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
    
    // TO DO : Override eat() Method for Student

    
    // TO DO : Add study() Method for Student

}

class Teacher extends Person {
    // TO DO : Add Member Variance for Teacher(subject)
    
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    // TO DO : Override eat() Method for Teacher
    
    // TO DO : Add teach() Method for Teacher

}

public class TestPeople {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Student("이장원", 20, "컴퓨터공학");
        people[1] = new Teacher("김한터", 30, "영어");
       
        // TO DO : Make for loop for people
        
    }
}
