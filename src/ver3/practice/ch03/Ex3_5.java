package ver3.practice.ch03;

//  아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다.
//  만일 변수 num의 값이 '333'이라면 '331'이 되고, '777'이라면 '771'이 된다. (1) 에 알맞은 코드를 넣으시오.

public class Ex3_5 {
    public static void main(String[] args) {
        int num = 333;

        // 문제를 나눈다.
        // 1. num값의 일의 자리를 버리려면 => 나누기 10 곱하기 10
        // 2. 일의자리를 0에서 1로 바꿔준다. => 더하기 1

        System.out.println(num / 10 * 10 + 1);
    }
}