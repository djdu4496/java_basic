package ver3.practice.ch07;

// 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)

// class Car {}
// class FireEngine extends Car implements Movable {}
// class Ambulance extends Car {}

// FireEngine fe = new FireEngine();

public class Ex7_16 {
    public static void main(String[] args) {
        System.out.println("a. fe instanceof FireEngine");
        System.out.println("b. fe instanceof Movable");
        System.out.println("c. fe instanceof Object");
        System.out.println("d. fe instanceof Car");
        System.out.println("e. fe instanceof Ambulance");
        System.out.println("fe가 형변환 가능한 타입 : FireEngine(자신), Car(조상), Object(조상), Movable(구현 인터페이스)");
        System.out.println("정답 : e, FireEngine과 Ambulance클래는 어떤 관계도 아니다.");
    }
}
