package ver3.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {  // throws Exception 미작성 시 '컴파일 에러' - Unhandled exception: java.lang.Exception
        method1();  // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
    }  // main메서드의 끝

    static void method1() throws Exception {
        method2();
    }  // method1의 끝

    static void method2() throws Exception {
        throw new Exception();
    }  // method2의 끝
}

// [실행결과]
// java.lang.Exception
//         at ver3.ch8.ExceptionEx12.method2(ExceptionEx12.java:13)
//         at ver3.ch8.ExceptionEx12.method1(ExceptionEx12.java:9)
//         at ver3.ch8.ExceptionEx12.main(ExceptionEx12.java:5)
