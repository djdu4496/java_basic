package practice.ch04;

// 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다.
// (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.

public class Ex4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를
        // 하나씩 읽어서 검사한다.
        for(int i =0; i < value.length(); i++) {
            // (1) 알맞은 코드를 넣어 완성하시오.
            // 문제 나누기
            // 1. charAt을 사용하여 문자열의 i번째 인덱스에 해당하는 문자값을 추출한다.
            // 2. char형 변수 ch에 해당 인덱스의 문자값을 저장한다.
            // 3. 숫자가 되려면? 48 <= ch && ch <= 57
            // 4. 조건식이 참이면, isNumber에 false를 저장한다.

            ch = value.charAt(i);        // 1. + 2.
            if(!(48 <= ch && ch <= 57))  // 3.
                isNumber = false;        // 4.
        }

        if(isNumber) {
            System.out.println((value+"는 숫자입니다."));
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }
    }
}
