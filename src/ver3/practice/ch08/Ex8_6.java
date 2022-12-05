package ver3.practice.ch08;

// 아래의 코드가 수행되었을 때의 실행결과를 적으시오.

public class Ex8_5 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if(b) throw new ArithmeticException();
            System.out.println(2);
        } catch(RuntimeException r) {
            System.out.println(3);
            return;
        } catch(Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }

        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        method(false);
        System.out.println("답안");
        System.out.println(1);
        System.out.println(3);
        System.out.println(5);
        System.out.println(1);
        System.out.println(2);
        System.out.println(5);
        System.out.println(6);
    }  // main - try블럭/catch블럭에서 return문이 실행되는 경우 finally블럭의 문장들은 수행된다.
}
