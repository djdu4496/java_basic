package ver3.practice.ch07;

// 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?(모두 고르시오)
// class Unit {}
// class AirUnit extends Unit {}
// class GroundUnit extends Unit {}
// class Tank extends GroundUnit {}
// class AirCraft extends AirUnit {}

// Unit u = new GroundUnit();
// Tank t = new Tank();
// AirCraft ac = new AirCraft();


public class Ex7_15 {
    public static void main(String[] args) {
        System.out.println("a. u = (Unit)ac;");
        System.out.println("정답 : O, 자손 -> 조상, 생략 가능");
        System.out.println("b. u = ac");
        System.out.println("정답 : O, 자손 -> 조상, 생략 가능");
        System.out.println("c. GroundUnit gu = (GroundUnit)u");
        System.out.println("정답 : O, 조상 -> 자손, 형변환 가능");
        System.out.println("d. AirUnit au = ac;");
        System.out.println("정답 : X, 조상 자손 관계가 아님, 형변환 불가능");
        System.out.println("e. t = (Tank)u");
        System.out.println("정답 : O, 조상 -> 자손, 형변환 가능");
        System.out.println("f. GroundUnit gu = t;");
        System.out.println("정답 : O, 자손 -> 조상, 생략 가능");
    }
}
