package ver3.practice.ch06;

// 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
// ----------
// println
// ----------
// method1
// ----------
// method2
// ----------
// main
// ----------

public class Ex6_17 {
    public static void main(String[] args) {
        System.out.println("a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.");
        System.out.println("정답 : O");
        System.out.println("b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.");
        System.out.println("정답 : X, '실행 대기' 상태이다.");
        System.out.println("c. method2메서드를 호출한 것은 main메서드이다.");
        System.out.println("정답 : O");
        System.out.println("d. println메서드가 종료되면 method1메서드가 수행을 재개한다.");
        System.out.println("정답 : O");
        System.out.println("e. main-method2-method1-println의 순서로 호출되었다.");
        System.out.println("정답 : O");
        System.out.println("f. 현재 실행중인 메서드는 println 뿐이다.");
        System.out.println("정답 : O");
    }
}
