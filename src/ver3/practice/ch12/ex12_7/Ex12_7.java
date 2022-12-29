package ver3.practice.ch12.ex12_7;
// [12-7] 애너테이션 TestInfo가 다음과 같이 정의되어 있을 때,
// 이 애너테이션이 올바르게 적용되지 않은 것은?
// @interface TestInfo {
//     int count() default 1;
//     String[] value() default "aaa";
// }
// a. @TestInfo              class Exercise12_7 {}          // OK. @TestInfo(count = 1, value() = {"aaa"})와 동일
// b. @TestInfo(1)           class Exercise12_7 {}          // 에러! 이름이 value가 아니기 때문에, 요소의 이름을 생략할 수 없다.
// c. @TestInfo("bbb")       class Exercise12_7 {}          // @TestInfo(count = 1, value() = {"bbb"})와 동일
// d. @TestInfo("bbb","ccc") class Exercise12_7 {}          // 값이 여러 개인 경우 괄호를 사용해야

@interface TestInfo {
 int count() default 1;             // 값
 String[] value() default "aaa";    // 기본값이 하나인 경우. 괄호 생략 가능
}

@TestInfo
public class Ex12_7 {
    public static void main(String[] args) {
        System.out.println("답안 : d");
    }
}

// [참고]
// 3.4 애너테이션 타입 정의하기 - 자바의 정석 3판 p.715
