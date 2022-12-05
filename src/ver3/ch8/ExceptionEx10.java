package ver3.ch8;

public class ExceptionEx10 {
    public static void main(String[] args) {
//        throw new Exception();  // Exception을 고의로 발생시킨다.  //
    }  // main메서드의 끝
}

// [실행결과]
// 에러 메시지 : 고의로 발생시켰음.
// java.lang.Exception: 고의로 발생시켰음.
//     at ver3.ch8.ExceptionEx9.main(ExceptionEx9.java:6)
// 프로그램이 정상 종료되었음.

// Exception과 그 자손들 : 'checked예외' - 예외처리 필수