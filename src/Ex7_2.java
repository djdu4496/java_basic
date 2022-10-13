
class Ex7_2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10; // super.x
}

class Child extends Parent {
	int x = 20; // this.x
	
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}

// 조상클래스의 멤버변수와 자식클래스의 멤버변수의 이름이 같을 때
// super.x와 this.x로 구분할 수 있다. 

/* 출력
 * x= 20
 * this.x= 20
 * super.x= 10
 * */
