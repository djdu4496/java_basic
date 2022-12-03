package ver3.practice.ch06;

// 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
public class Ex6_11 {
    public static void main(String[] args) {
        System.out.println("a. 객체 자신을 가리키는 참조변수이다.");
        System.out.println("정답 : O");
        System.out.println("b. 클래스 내부에서라면 어디서든 사용할 수 있다.");
        System.out.println("정답 : X, static메서드 내에서는 사용 불가");
        System.out.println("c. 지역변수와 인스턴스변수를 구별할 때 사용한다.");
        System.out.println("정답 : O");
        System.out.println("d. 클래스메서드 내에서는 사용할 수 없다.");
        System.out.println("정답 : O");
    }
}
