package ver3.ch8;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);  // 예외발생!!!
            System.out.println(4);    // 실행되지 않는다.
        } catch(ArithmeticException ae) {
            ae.printStackTrace();  // 참조변수 ae를 통해, 생성된 ArithmeticException인스턴스에 접근할 수 있다.
            System.out.println("예외메시지 : " + ae.getMessage());
        }  // try-catch의 긑
        System.out.println(6);
    }  // main메서드의 끝
}

// [실행결과]
// 1
// 2
// 3
// java.lang.ArithmeticException: / by zero
// at ver3.ch8.ExceptionEx8.main(ExceptionEx8.java:9)
// 예외메시지 : / by zero
// 6