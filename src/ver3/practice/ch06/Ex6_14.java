package ver3.practice.ch06;

// 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)

public class Ex6_14 {
    public static void main(String[] args) {
        System.out.println("a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.");
        System.out.println("정답 : O");
        System.out.println("b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.");
        System.out.println("정답 : O");
        System.out.println("c. 초기화 블럭보다 생성자가 먼저 수행된다.");
        System.out.println("정답 : X, 초기화 순서: 명시적 초기화 -> 초기화 블럭 -> 생성자");
        System.out.println("d. 명시적 초기화를 제일 우선적으로 고려해야 한다.");
        System.out.println("정답 : O");
        System.out.println("e. 클래스 변수보다 인스턴스 변수가 먼저 초기화 된다.");
        System.out.println("정답 : X, 클래스 변수가 먼저 초기화된다. 클래스가 메모리에 올라갈 때 객체가 생성되지 않을 수 있음");
    }
}
