package ver3.ch8;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int)(Math.random() * 10);  // 9번째 라인
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");  // ArithmeticException이 발생하면 실행되는 코드
            }  // try-catch의 끝
        }
    }  // main메서드의 끝
}

// [실행결과]
// 11
// 33
// 12
// 12
// 0  ←  ArithmeticException이 발생해서 0이 출력되었
// 25
// 33
// 100
// 20
// 100