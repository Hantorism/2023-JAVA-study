package Practice05_ArrayList3;

/*
    출력결과
    3
    2
    1
    C++
    Python
    Java
 */

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Java");
        stringStack.push("Python");
        stringStack.push("C++");

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}
