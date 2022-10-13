class MyPoint {  // 컴파일 후 - class MyPoint extends Object
	int x;
	int y;
}

//class Circle extends MyPoint {  // 상속
//	int r;
//}

class Circle {  // 포함, 컴파일 후 - class Circle extends Object
	MyPoint p;
	int r;
	
	Circle() {
		p = new MyPoint();  // 참조변수의 초기화
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
//		1. 포함관계 실습 
//		c.p.x = 1;
//		c.p.y = 2;
//		c.r = 3;
//		System.out.println("c.p.x = " + c.p.x);
//		System.out.println("c.p.y = " + c.p.y);
//		System.out.println("c.r = " + c.r);
		
//		2. toString 실습
		System.out.println(c.toString());  // "Circle@5ccd43c2"
		System.out.println(c);             // "Circle@5ccd43c2"
		Circle c2 = new Circle();
		System.out.println(c2.toString());  // "Circle@4aa8f0b4"
		System.out.println(c2);             // "Circle@4aa8f0b4"		
	}

}

/* 출력
 * c.p.x = 1
 * c.p.y = 2
 * c.r = 3
 */