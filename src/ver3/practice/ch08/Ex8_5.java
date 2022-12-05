package ver3.practice.ch08;

/**
 // 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
 *  void method() throws InvalidNumberException, NotANumberException {}
 *
 *      class NumberException extends RuntimeException {}
 *      class InvalidNumberException extends NumberException {}
 *      class NotANumberException extends NumberException {}
 *
 */
public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println("a. try { method(); } catch(Exception e) {}");
        System.out.println("답안 : X, Exception클래스는 모든 예외의 최고 조상이므로 모든 예외를 처리할 수 있다.");
        System.out.println("b. try { method(); } catch(NumberException e) {} catch(Exception e) {}");
        System.out.println("답안 : X, 두 조상 예외 타입의 참조변수를 선언한 catch블럭에 의해 두 예외를 처리할 수 있다.");
        System.out.println("c. try { method(); } catch(Exception e) {} catch(NumberException e) {}");
        System.out.println("답안 : O, Exception타입의 참조변수를 지정한 catch블럭이 마지막에 오지 않았기 때문에 뒤 catch블럭은 쓰이지 않는다. ");  // Exception 'java.lang.NumberException' has already been caught
        System.out.println("d. try { method(); } catch(InvalidNumberException e) {} catch(NotANumberException e) {}");
        System.out.println("답안 : X, 메서드에 선언한 두 예외를 모두 처리해주었기 때문에 문제가 없다.");
        System.out.println("e. try { method(); } catch(NumberException e) {}");
        System.out.println("답안 : O, 메서드에 선언한 두 예외의 조상인 NumberException타입의 참조변수를 선언한 catch블럭이 두 예외를 모두 처리할 수 있다.");
        System.out.println("f. try { method(); } catch(RuntimeException  e) {}");
        System.out.println("답안 : X, 두 예외의 조상 타입인 RuntimeException타입의 참조변수를 선언한 catch블럭이 두 예외를 처리할 수 있다.");
        System.out.println("답안 : c, e");


    }
}
