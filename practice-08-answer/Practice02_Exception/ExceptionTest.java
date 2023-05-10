package Practice02_Exception;

// 출력 결과
// Index 4 out of bounds for length 4

public class ExceptionTest {
    public static void main(String[] args) {
        Test[] Arr = new Test[4];
        Arr[0] = new Test("a");
        Arr[1] = new Test("b");
        Arr[2] = new Test("c");
        Arr[3] = new Test("d");
    
        
        try{
            Arr[4] = new Test("e");
            System.out.println("여기 문장은 출력될리가 없겠죠?");
            // TODO : 적절한 예외에 대해서 catch 하세요.
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            //
        } catch (Exception e){
            System.out.println("이 블럭은 실행되면 안돼요ㅠ");
            System.out.println(e.getMessage());
        }

        
    }
}

class Test{
    String name;
    public Test(String name){
        this.name = name;
    }
}