package ver3.practice.ch07;

// 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
// 옳지 않은 것은? (모두 고르시오)

public class Ex7_9 {
    public static void main(String[] args) {
        System.out.println("a. 지역변수 - 값을 변경할 수 없다.");
        System.out.println("정답 : O, 변수에 final을 붙이면 상수가 된다.");
        System.out.println("b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.");
        System.out.println("정답 : X, 다른 클래스의 조상이 될 수 없는 것이다.");
        System.out.println("c. 메서드 - 오버로딩을 할 수 없다.");
        System.out.println("정답 : X, final 붙은 메서드는 오버라이딩을 통해 재정의될 수 없다.");
        System.out.println("d. 멤버변수 - 값을 변경할 수 없다.");
        System.out.println("정답 : O, 변수에 final을 붙이면 상수가 된다.");

    }
}
