package ver3.practice.ch07;

// 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야 하는 이유는 무엇인가?

public class Ex7_6 {
    public static void main(String[] args) {
        System.out.println("조상클래스의 멤버변수는 조상의 생성자가 초기화하도록 해야 하기 때문이다.");
        System.out.println("그렇지 않으면, 코드의 중복이 발생한다.");
    }
}
