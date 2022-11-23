package ver3.practice.ch03;

// 아래는 변수 num 값에 따라 '양수', '음수', '0'을 출력하는 코드이다. 삼항연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
// [Hint] 삼항 연산자를 두 번 사용하라.

class Ex3_3 {
        public static void main(String[] args) {
                int num = 10;

                // 문제를 나눈다.
                // num은 다음과 같이 분류할 수 있다.
                // 1. num이 0일 때
                // 2. 그렇지 않을 때
                // 2-1. num이 양수일 때
                // 2-2. num이 음수수일 때
                System.out.println( /* (1) */
                        num == 0 ? "0" : (num > 0 ? "양수" : "음수"));

        }
}
