package ver3.practice.ch07;

// 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.

class Outer {
    int value = 10;
    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);             // lv
            System.out.println(this.value);        // 내부 클래스 iv
            System.out.println(Outer.this.value);  // 외부 클래스 iv
        }
    } // Inner클래스의 끝
}  // Outer클래스의 끝

public class Ex7_27 {
    public static void main(String[] args) {
        // (4) 알맞은 코드를 넣어 완성하시오.
        Outer o = new Outer(); // 외부 클래스 인스턴스를 생성해야 인스턴스내부클래스의 인스턴스를 생성할 수 있다.
        Outer.Inner inner = o.new Inner();
        inner.method1();
    }
}

// [실행결과]
// 30
// 20
// 10