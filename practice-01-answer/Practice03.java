public class Practice03 {
    public static void main(String[] args) {
        // TO DO : 별 찍기
        int a, b;
        for(a = 1; a < 10; a++) {
            for(b = 0; b < a; b ++) {
                System.out.print("*");
            }
            System.out.println(""); // == System.out.print("\n");
        }
    }
        //
}

/*
 * 출력 예시
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 * ********
 * *********
 */
