package ver3.practice.ch06;

// 오버로딩이 성립하기 위한 조건이 아닌 것은?(모두 고르시오)

public class Ex6_12 {
    public static void main(String[] args) {
        System.out.println("a. 메서드 이름이 같아야 한다.");
        System.out.println("정답 : O");
        System.out.println("b. 매개변수의 개수나 타입이 달라야 한다.");
        System.out.println("정답 : O");
        System.out.println("c. 리턴타입이 달라야 한다.");
        System.out.println("정답 : X, 반환타입은 영향이 없다.(오버로딩 조건 세 번째)");
        System.out.println("d. 매개변수의 이름이 달라야 한다.");
        System.out.println("정답 : X, 매개변수는 개수나 타입만 영향이 있다.");
    }
}
