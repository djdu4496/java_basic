package basic.ch12;

class Parent2 {
    void parentMethod() { }
}

class Child2 extends Parent2 {
    @Override
    @Deprecated
    void parentMethod() { } // 조상 메서드의 이름을 잘못 적었음.
}

@FunctionalInterface
interface Testable {  // 함수형 인터페이스는 하나의 추상메서드만 가능
    void test();  // 추상메서드
//  void check(); // 추상메서드
}

class Ex12_7_2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child2 c= new Child2();
        c.parentMethod();  // deprecated된 메서드 사용
    }
}