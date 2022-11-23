package ver3.practice.ch03;

// 다음은 문자형 변수 ch가 영문자(대문자 또는 소문)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.
// (1)에 알맞은 코드를 넣으시오.

public class Ex3_9 {
    public static void main(String[] args) {
        char ch = 'z';  // 'z' == 122
        // 문제 나누기 - 조건식을 두 경우의 합집합으로 쪼개기
        // 1. ch가 영문자인 경우
            // 1-1. ch가 대문자인 경우  : 'A' : 65, 'Z' : 90
            // 1-2. ch가 소문자인 경우  : 'a' : 97, 'z' : 122
        // 2. ch가 숫자인 경우          : '0' : 48, '9' : 57
        boolean b = ((48<=ch && ch<=57) || (65<=ch && ch<=90) || (97<=ch&&ch<=122));

        System.out.println(b);
    }
}
