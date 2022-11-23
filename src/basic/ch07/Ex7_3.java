package basic.ch07;

class Ex7_3 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 {
	int x = 10; // super.x와 this.x 둘 다 가능
}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}
// 조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점을 제외하면
// this.x와 super.x는 근본적으로 같다.

/* 출력
 * x= 10
 * this.x= 10
 * super.x= 10
 * */