package Practice04_ArrayList2;

import java.util.ArrayList;

/*  출력결과
    고객 [이름=홍길동, 나이=20,자금=10000]
    고객 [이름=리드미, 나이=30,자금=20000]
    고객 [이름=박상준, 나이=24,자금=0]
    0원 이하의 고객을 제거한 후
    고객 [이름=홍길동, 나이=20,자금=10000]
    고객 [이름=리드미, 나이=30,자금=20000] 
 */

public class CustomerTest {
    public static void main(String[] args) {

        // TODO : Customer 객체를 담을 수 있는 ArrayList Shop 생성
        ArrayList<Customer> Shop = new ArrayList<Customer>();

        // TODO : Customer 객체 3개 생성
        // customer1 : 홍길동, 20, 10000
        // customer2 : 리드미, 30, 20000
        // customer3 : 박상준, 24, 0
        Customer customer1 = new Customer("홍길동", 20, 10000);
        Customer customer2 = new Customer("리드미", 30, 20000);
        Customer customer3 = new Customer("박상준", 24, 0);
        

        // TODO : ArrayList에 3명의 고객 추가
        Shop.add(customer1);
        Shop.add(customer2);
        Shop.add(customer3);

        // TODO : ArrayList의 내용 출력 (방식 자유)
        for (Customer customer : Shop) {
            System.out.println(customer);
        }

        // TODO : ArrayList에서 0원 이하의 고객 제거
        // 방법 1 -> 이렇게 반복문을 작성하면, Shop.size()가 중간에 변화하여 마지막 요소에 접근할 수 없음.
        // for (int i = 0; i < Shop.size(); i++) {
        //     if (Shop.get(i).getMoney() <= 0) {
        //         Shop.remove(i);
        //     }
        // }
        // 방법 2 -> 이렇게 반복문을 작성하면, 반복문을 진행하면서 반복 대상에 대한 변경이 이루어져 Exception이 발생
        // for(Customer c1 : Shop){
        //     if(c1.getMoney() <= 0){
        //         Shop.remove(c1);
        //     }
        // }
        // 방법 3 -> 올바른 방법. 뒤에서부터 탐색을 진행한다면 ArrayList의 크기가 변화해도 영향을 받지 않음.
        for(int i = Shop.size()-1; i >=0; i --){
            if(Shop.get(i).getMoney() <= 0){
                Shop.remove(i);
            }
        }

        System.out.println("0원 이하의 고객을 제거한 후");

        // TODO : ArrayList의 내용 출력 (방식 자유)
        for (Customer customer : Shop) {
            System.out.println(customer);
        }

    }
}
