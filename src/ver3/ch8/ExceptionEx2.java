package ver3.ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int)(Math.random() * 10);  // 9번째 라인
            System.out.println(result);
        }
    }  // main메서드의 끝
}

// 20
// 33
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//     at ver3.ch8.ExceptionEx2.main(ExceptionEx2.java:9)