package ver3.practice.ch07;

// 다음 중 접근제어자를 접근 범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?

public class Ex7_8 {
    public static void main(String[] args) {
        System.out.println("public > protected > (default) > private");
        System.out.println("public : 접근 제한 전혀 없음");
        System.out.println("protected : 같은 패키지 또는 다른 패키지의 자손 클래스에서 접근 가능");
        System.out.println("(default) : 같은 패키지 내에서만 접근 가능");
        System.out.println("private : 같은 클래스 내에서만 접근 가능");
    }
}
