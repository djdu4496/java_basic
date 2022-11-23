package ver3.practice.ch04;

//  숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//  만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15가 출력되어야 한다.
// (1)에 알맞은 코드를 넣으시오
// [Hint] String클래스의 charAt(int i)을 사용

public class Ex4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {  // 초기화식에서 사용된 변수 i가 charAt(int i)의 인덱스가 된다.
            // 알맞은 코드를 넣어 완성하시오
            // 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
            // 문제 나누기
            // 1. 각 자리의 수를 일의 자리 수로 표현할 수 있어야 한다 ex. 10000 => 1, 2000 => 2, 300 => 3, 40 => 4,
                // 1-1. charAt(int i)를 사용 -
                // 1-2. 문자형 타입을 숫자형 타입으로 변환한다. - '0'을 빼준다.
            // 2. 각 자리의 합을 더한다.
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum=" + sum);
    }
}
