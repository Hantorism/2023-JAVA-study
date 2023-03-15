public class Practice04 {
    public static void main(String[] args) {
        // TO DO : 더해서 6이 되는 경우 출력하기
        int i, j;
        for(i = 1; i < 6; i++){
            for( j = 5; j > 0; j --){
                System.out.println(i + " + " + j + " = " + (i+j));
            }
        }
        //
    }
}

/*
출력결과
1 + 5 = 6
2 + 4 = 6
3 + 3 = 6
4 + 2 = 6
5 + 1 = 6
*/