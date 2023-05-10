package Practice03_Exception2;

// 출력 결과
// Index 4 out of bounds for length 4 

public class ExceptionTest {
    public static void main(String[] args) {
        Test[] Arr = new Test[4];
        Arr[0] = new Test("a");
        Arr[1] = new Test("b");
        Arr[2] = new Test("c");
        Arr[3] = new Test("d");


        // TO DO : 코드의 문제점을 파악하고, 수정하세요
        try{
            Arr[4] = new Test("e");
            System.out.println("여기 문장은 출력될리가 없겠죠?");
        } catch (Exception e) {
             System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        //
    }
}

class Test{
    String name;
    public Test(String name){
        this.name = name;
    }
}