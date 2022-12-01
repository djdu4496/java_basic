package ver3.practice.ch07;

// 다음 중 오버라이딩의 조건으로 옳지 않은 것은?(모두 고르시오)
// a. 조상의 메서드와 이름이 같아야 한다.
// b. 매개변수의 수와 타입이 모두 같아야 한다.
// c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
// d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.

public class Ex7_4 {
    public static void main(String[] args) {
        System.out.println("오버라이딩의 조건은 총 3가지이다.");
        System.out.println("1. 조상 메서드의 선언부와 일치해야 한다."); // 선언부 일치 조건 1. 반환타입 2. 매개변수 이름 3. 매개변수 목록(타입 && 개수)
        System.out.println("2. 접근제어자를 조상클래스의 메서보다 좁은 범위로 변경할 수 없다.");
        System.out.println("3. 예외는 조상클래스의 메서드보다 많이 선언할 수 없다. ");
        System.out.println("4. static메서드에서 인스턴스메서드로 또는 그 반대로 변경할 수 없다.");
        System.out.println();
        System.out.println("a. 조상의 메서드와 이름이 같아야 한다.");
        System.out.println("정답 : O");
        System.out.println("b. 매개변수의 수와 타입이 모두 같아야 한다.");
        System.out.println("정답 : O");
        System.out.println("c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.");
        System.out.println("정답 : X, 접근 제어자는 조상의 메서드보다 좁은 범위로 변경할 수 없다.");
        System.out.println("d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.");
        System.out.println("정답 : X, 조상의 메서드보다 더 많은 수의 예외를 선언할 수 없다.");
    }
}
