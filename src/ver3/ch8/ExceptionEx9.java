package ver3.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;  // 예외를 발생시킴
//          throw new Exception("고의로 발생시켰음.");  ← 위의 두 줄을 한 줄로 줄여 쓸 수 있다.
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }  // main메서드의 끝
}

// [실행결과]
// 에러 메시지 : 고의로 발생시켰음.
// java.lang.Exception: 고의로 발생시켰음.
//     at ver3.ch8.ExceptionEx9.main(ExceptionEx9.java:6)
// 프로그램이 정상 종료되었음.
