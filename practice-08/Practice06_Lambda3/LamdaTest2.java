package Practice06_Lambda3;

// 출력 결과
// Before
// arr[0] = 1
// arr[1] = 2
// arr[2] = 3
// arr[3] = 4
// arr[4] = 5
// After
// arr[0] = 2
// arr[1] = 4
// arr[2] = 6
// arr[3] = 8
// arr[4] = 10

public class LamdaTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // TODO : arr의 모든 원소를 2배로 만드는 코드를 람다식으로 구현하세요
        // 참조변수 명 : md
        
        // 

        System.out.println("Before");
        
        for(int i =0; i < arr.length; i++)
        {
            System.out.println("arr[" + (i) + "] = " + arr[i]);
        }


        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = md.makeDouble(arr[i]);
        }

        System.out.println("After");
        
        for(int i =0; i < arr.length; i++)
        {
            System.out.println("arr[" + (i) + "] = " + arr[i]);
        }
        

    }
}

// TODO : 함수형 인터페이스 MakeDouble을 구현하세요

//