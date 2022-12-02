package ver3.practice.ch07;

// 지역 클래스에서 외부 클래스의 인스턴스 멤버와 static멤버에 모두 접근할 수 있지만, 지역변수는 final이 붙은 상수만 접근할 수 있는 이유는 무엇인가?

public class Ex7_29 {
    public static void main(String[] args) {
        System.out.println("메서드가 수행을 마쳐서 지역변수(lv)가 소멸된 시점에도 지역클래스의 인스턴스가 소멸된 지역변수를 참조하려는 경우가 발생할 수 있기 때문이다.");
    }
}
