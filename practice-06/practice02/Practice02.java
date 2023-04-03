package practice02;

class Shape {
    double area;
 
    void printArea() {
       System.out.println("Area: " + area);
    }
 }
 
 // 자손 클래스 1
 class Rectangle extends Shape {
    double width;
    double height;
 
    Rectangle(double width, double height) {
       this.width = width;
       this.height = height;
       calculateArea();
    }
 
    void calculateArea() {
       area = width * height;
    }
 }
 
 // 자손 클래스 2
 class Circle extends Shape {
    double radius;
 
    Circle(double radius) {
       this.radius = radius;
       calculateArea();
    }
 
    void calculateArea() {
       area = Math.PI * radius * radius;
    }
 }
 
 // Main 클래스
 public class Practice02 {
    public static void main(String[] args) {
 // 조상 클래스 참조변수를 이용한 배열 생성
       Shape[] shapes = new Shape[2];
 
       // TO DO 1: 자손 클래스 인스턴스를 생성하고 배열에 저장하자. 
                                                        // index 0에 Rectangle 인스턴스 저장
                                                        // index 1에 Circle 인스턴스 저장
 
       // TO DO 2: 배열의 각 요소에 대해 printArea() 메소드 호출

        //
    }
 }
 