package ver3.practice.ch08;

// 아래의 코드가 수행되었을 때의 실행결과를 적으시오.

public class Ex8_6 {
    public static void main(String[] args) {
        try {
            method1();
        } catch(Exception e) {
            System.out.println(5);
        }

        System.out.println("답안");
        System.out.println(3);
        System.out.println(5);
    }  // main - 1이 출력되지 않는 이유
       // method2에서 발생시킨 예외 NullPointerException가 method2에서 처리가 안 되고
       // method1로 떠넘겨지고, method1에서도 처리가 안 되어 main메서드로 떠넘겨진다.
       // method2()호출 문 다음 문장은 try문에 예외가 감지됐기 때문에 실행되지 않고 바로 catch블럭으로 이동하기 때문에 1이 출력되지 않는다.

    static void method1() {
        try {
            method2();
            System.out.println(1);
        } catch(ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }

        System.out.println(4);
    }  // method1()

    static void method2() {
        throw new NullPointerException();


    }
}
