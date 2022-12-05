package ver3.ch8;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }  // main메서드의 끝

    static void method1() throws Exception {
        throw new Exception();
    }  // method1()의 끝
}  // class의 끝

// [실행결과]
// main메서드에서 예외가 처리되었습니다.
//         java.lang.Exception
//             at ver3.ch8.ExceptionEx14.method1(ExceptionEx14.java:14)
//             at ver3.ch8.ExceptionEx14.main(ExceptionEx14.java:6)
