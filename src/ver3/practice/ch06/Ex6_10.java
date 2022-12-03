package ver3.practice.ch06;

// 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)

public class Ex6_10 {
    public static void main(String[] args) {
        System.out.println("a. 모든 생성자의 이름은 클래스의 이름과 동일해야 한다.");
        System.out.println("정답 : O");
        System.out.println("b. 생성자는 객체를 생성하기 위한 것이다.");
        System.out.println("정답 : X, 객체를 생성하기 위한 것은 'new연산자'이다. 생성자는 인스턴스(iv) 초기화 메서드이다.");
        System.out.println("c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.");
        System.out.println("정답 : O");
        System.out.println("d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.");
        System.out.println("정답 : O");
        System.out.println("e. 생성자는 오버로딩 될 수 없다.");
        System.out.println("정답 : X, 오버로딩이 되기 때문에 기본 생성자, 매개변수가 있는 생성자가 공존 가능하다.");
    }
}
