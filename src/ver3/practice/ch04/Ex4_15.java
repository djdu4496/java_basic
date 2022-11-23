package ver3.practice.ch04;

// 다음은 회문수를 구하는 프로그램이다.
// 회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
// 예를 들면 '12321'이나 '13531'같은 수를 말한다.
// (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
// Hint 나머지 연산자를 이용하시오.


public class Ex4_15 {
    public static void main(String[] args) {
        int number = 7894987;
        int tmp = number;

        int result = 0;  // 변수 number를 거꾸로 변환해서 담을 변수

        while(tmp != 0) {
            // (1) 알맞은 코드를 넣어 완성하시오.
            // 1. 문제를 쉽게 만든다. <- 이 의미조차 제대로 파악하지 못 했음
            // 1트
//                result += tmp / 10000 * 1;   // result == 1
//                tmp = tmp % 10000;           // tmp == 2321
//
//                result += tmp / 1000 * 10;   // result == 21
//                tmp = tmp % 1000;            // tmp == 321
//
//                result += tmp / 100 * 100;   // result == 321
//                tmp = tmp % 100;             // tmp == 21
//
//                result += tmp / 10 * 1000;   // result == 2321
//                tmp = tmp % 10;              // tmp == 1
//
//                result += tmp / 1 * 10000;   // result == 12321
//                tmp = tmp % 1;               // tmp == 0

//                관건은, 10000과 1로 시작하는 리터럴을 어떻게 while문 안에서 규칙성 있게 표현할 것인가?
            // 2트 - 두 자리라고 가정하고 10을 활용한다.
//                number == 11이라고 가정하자.
//                tmp = number이기 때문에 tmp == 11이 된다.
//                (1)
//                result를 구하려면 tmp 십의 자리 수를 빼와서 일의 자리로 추가해준다.
//                tmp에 나눗셈 연산자를 사용하면 그 자리 수를 빼올 수 있다.
//                result += tmp / 10;  // result == 1
//                tmp = tmp % 10;      // tmp == 1
//                (2)
//                tmp에서 일의 자리 수를 빼와서 십의 자리로 추가해준다.
//                tmp에 나눗셈 연산자를 사용하면 그 자리 수를 빼올 수 있다.
//                result += tmp / 10;  // result == 11
//                tmp = tmp % 10;      // tmp == 0

            // 3트 - 세 자리라고 가정하고 10을 활용한다.
            // 1. 문제를 쉽게 만든다.
//                number == 121이라고 가정하자.
//                tmp = number이기 때문에 tmp == 121이 된다.
//                (1)
//                tmp에서 일의 자리 수를 빼와서 result에 저장한다.
//                tmp % 10  // 나머지 연산자를 사용한다.
//
//                (2)
//                result에 일의 자리 수를 더하고 곱하기 10을 한다.
//                (2-1) result에 일의 자리 수를 더한다.
//                result += tmp % 10
//                (2-2) result에 10을 곱한다.(다음 일의 자리 수를 받기 위한 준비)
//                result *= 10;    // 단, tmp가 0보다 큰 경우에서만 연산을 한다.(다음 자리 수가 존재하지 않음)
//
//                (3)
//                다음 자리 수에 대해 위 작업을 반복하기 위해 tmp에 대해 나누기 10을 해서 십의 자리를 일의 자리로 만들어준다.
//
//                (4)
//                다음 자리 수에 대해 (1) ~ (3) 과정을 반복한다.

            // 4트
                // 1. 문제를 쉽게 만든다.  "5자리 말고 2자리"
                   // number == 11 && tmp == 11일 때 (12321 -> 11)
                // 2. 문제를 나눈다.
                   // 1. tmp의 일의 자리 수를 result의 십의 자리 수로 옮기기
                        // 1-1. tmp의 일의 자리 수를 구한다.  // '%' 사용
                        // 1-2. result에 더해준다.  // result += /*tmp의 일의 자리 수*/
                   // 2. tmp의 일의 자리 수를 제거한다.  // '/' 사용
                   // 3. tmp가 0보다 큰 경우에(다음 자리 수가 남아있기 때문에) result에 10을 곱한다.
                   // 4. 1.~3. 과정을 반복한다.


            // 1. tmp을 10으로 나눈 나머지 값을 result에 추가한다.  // result = result + tmp % 10;
            // 2. 나눗셈 연산자 사용하여 tmp를 업데이트한다.
            // 3. tmp 가 0이 아니라면, result = result * 10 해준다.
            result += tmp % 10;         // 1.
            tmp /= 10;                  // 2.
            if(tmp != 0) result *= 10;  // 3.

        }
        if(number == result)
            System.out.println(number + "는 회문수 입니다.");
        else
            System.out.println(number + "는 회문수가 아닙니다.");
    }
}
