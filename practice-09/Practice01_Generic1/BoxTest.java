package Practice01_Generic1;
/*  출력 결과
    Hello World!
    1234
 */
public class BoxTest{
    public static void main(String[] args) {
        // TODO : Box 객체 2개 생성
        // String을 담을 수 있는 stringBox를 생성


        // Integer을 담을 수 있는 integerBox를 생성
    
        stringBox.set("Hello World!");
        integerBox.set(1234);

        System.out.println(stringBox.get()); // Hello World!
        System.out.println(integerBox.get()); // 1234
    }
}