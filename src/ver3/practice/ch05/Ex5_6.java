package ver3.practice.ch05;

// 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
// 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
// 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.

// 실행 결과
// 500원 : 5
// 100원 : 1
// 50원 : 1
// 10원 : 3

public class Ex5_6 {
    public static void main(String[] args) {
        // 큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
        int[] coinUnit = {500, 100, 50, 10};  // 이미 내림차순으로 정렬되어 있기 때문에 순서대로 계산하면 OK

        int money = 2680;
        System.out.println("money="+money);   // 전체 금액을 출력

        for(int i = 0; i < coinUnit.length; i++) {
            // (1) 알맞은 코드를 넣어 완성하시오.
            int cnt = money / coinUnit[i];  // 금액을 coinUnit의 i번째 요소에 해당하는 단위의 동전으로 나누면, 사용된 동전의 개수를 알 수 있다.
            System.out.println(coinUnit[i] + "원: " + cnt);  // 해당 단위의 동전이 몇 개 사용됐는지 출력
            money %= coinUnit[i];  // 전체 금액을 해당 단위의 동전으로 나누고 남은 나머지 금액을 money에 대입한다.

        }
    } // main
}
