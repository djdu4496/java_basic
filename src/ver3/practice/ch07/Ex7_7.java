package ver3.practice.ch07;

// 다음 코드를 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.

//class Parent {
//    int x = 100;
//
//    Parent() {
//        this(200);
//    }
//
//    Parent(int x) {
//        this.x = x;
//    }
//
//    int getX() {
//        return x;
//    }
//}
//
//class Child extends Parent {
//    int x = 3000;
//
//    Child() {
//        this(1000);
//    }
//
//    Child(int x) {
//        this.x =x;
//    }
//
//}

//public class Ex7_7 {
//    public static void main(String[] args) {
//        Child c = new Child();
//
//        System.out.println("x=" + c.getX());
//    }
//}

// 생각 정리
// 자손이 선언한 iv 'x'와 조상으로부터 상속받은 iv 'x'는 서로 다르다. 변수명이 같아서 헷갈릴 뿐.
// 자손이 선언한 iv 'x' == this.x
// 조상이 선언한 iv 'x' == super.x로 구분 가능
