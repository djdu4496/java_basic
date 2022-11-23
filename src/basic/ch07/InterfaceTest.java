package basic.ch07;

class A {
	//	public void method(basic.ch07.C c) {  // A가 basic.ch07.B 대신 C를 사용하려면 두 곳을 수정해야 한다.(1)
	public void method(I i) {       // 인터페이스 I를 구현한 놈들만 매개변수로 가능, basic.ch07.B 대신 C를 사용해도 A를 변경하지 않아도 된다.
		i.method();
	}
}

// B클래스의 선언과 구현을 분리
interface I {
	public void method();  // 메서드의 선언
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}  // 메서드의 구현
}

class C implements I {     // C가 인터페이스 I를 구현해야 method()의 매개변수로 가능
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.method(new C());  // A가 basic.ch07.B(basic.ch07.C)를 사용(의존)  // A가 basic.ch07.B 대신 C를 사용하려면 두 곳을 수정해야 한다.(2)
	}
}

/* 출력
 * B클래스의 메서드
 */