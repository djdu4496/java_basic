package ver3.practice.ch07;

// Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?

public class Ex7_13 {
    public static void main(String[] args) {
        System.out.println("Math클래스는 몇 개의 상수와 static메서드로만 이루어져 있다. 따라서 인스턴스를 생성할 필요가 없다.");
        System.out.println("외부에서 생성자에 접근할 이유가 없기 때문에 private으로 지정했다.");
    }
}
