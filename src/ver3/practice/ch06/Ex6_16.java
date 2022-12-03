package ver3.practice.ch06;

// 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)

public class Ex6_16 {
    public static void main(String[] args) {
        System.out.println("a. 자동 초기화되므로 별도의 최적화가 필요 없다.");
        System.out.println("정답 : X, 지역변수는 반드시 '수동초기화'해야 한다.");
        System.out.println("b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸한다.");
        System.out.println("정답 : O");
        System.out.println("c. 메서드의 매개변수로 선언된 변수도 지역변수이다.");
        System.out.println("정답 : O");
        System.out.println("d. 클래스 변수나 인스턴스 변수보다 메모리 부담이 적다.");
        System.out.println("정답 : O");
        System.out.println("e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.");
        System.out.println("정답 : X, iv에 해당하는 설명이다.");
    }
}
