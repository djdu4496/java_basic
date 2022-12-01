package ver3.practice.ch07;

// 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은?(모두 고르시오)

public class Ex7_12 {
    public static void main(String[] args) {
        System.out.println("a. public은 접근제한이 전혀 없는 접근 제어자이다.");
        System.out.println("정답 : O");
        System.out.println("b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.");
        System.out.println("정답 : O");
        System.out.println("c. 지역변수에도 접근 제어자를 사용할 수 있다.");
        System.out.println("정답 : X, 지역변수(lv)는 메서드 영역이 끝나면 소멸되기 때문에 붙이지 않는다.");
        System.out.println("d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.");
        System.out.println("정답 : O");
        System.out.println("e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.");
        System.out.println("정답 : O");
    }
}
