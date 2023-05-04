package Practice06_Interface;

public class ExecutableTest {
    public static void main(String[] args) {
        Executable[] executables = new Executable[2];
        executables[0] = new Phone("010-1234-5678");
        executables[1] = new Car("Tesla");

        for (Executable e : executables) {
            e.execute();
        }
    }
}
