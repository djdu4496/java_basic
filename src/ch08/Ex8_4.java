package ch08;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(args[0]);  // ArrayIndexOutOfBoundsException 예외 발생
            System.out.println(0 / 0);  // ArithmeticException 예외 발생!
            System.out.println(4);      // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if(ae instanceof  ArithmeticException)
                System.out.println(true);
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {         // 모든 예외의 최고 조상, 모든 예외처리 가능, 없으면 비정상 종료
            System.out.println("Exception");
        }  // try-catch의 끝
        System.out.println(6);
    }  // main메서드의 끝
}
