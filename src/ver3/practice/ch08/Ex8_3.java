package ver3.practice.ch08;

/**
 // 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)
 *  void add(int a, int b)
 *      throws InvalidNumberException, NotANumberException {}
 *
 *      class NumberException extends Exception {}
 *      class InvalidNumberException extends NumberException {}
 *      class NotANumberException extends NumberException {}
 */

public class Ex8_3 {
    public static void main(String[] args) {
        System.out.println("오버라이딩 두 번째 조건 : 조상클래스의 메서드보다 예외를 많이 선언할 수 없다.");
        System.out.println("Java API를 찾아보니 존재하지 않는 예외였다.");
        System.out.println("a. void add(int a, int b) throws InvalidNumberException, NotANumberException");
        System.out.println("답안 : X");
        System.out.println("b. void add(int a, int b) throws InvalidNumberException");
        System.out.println("답안 : X");
        System.out.println("c. void add(int a, int b) throws NotANumberException");
        System.out.println("답안 : X");
        System.out.println("d. void add(int a, int b) throws Exception");
        System.out.println("답안 : O, Exception은 모든 예외의 최고 조상이므로 가장 많은 개수의 예외를 던질 수 있도록 선언한 것이다. 따라서 조건에 위배된다.");
        System.out.println("e. void add(int a, int b) throws NumberException");
        System.out.println("답안 : O, NumberException은 InvalidNumberException, NotANumberException 두 예외의 조상이므로 두 에외보다 많은 예외를 던질 수 있도록 선언한 것이다. 따라서 조건에 위배된다.");
    }
}
