package basic.ch07;

class MyPoint {  // ������ �� - class basic.ch07.MyPoint extends Object
	int x;
	int y;
}

//class basic.ch07.Circle extends basic.ch07.MyPoint {  // ���
//	int r;
//}

class Circle {  // ����, ������ �� - class basic.ch07.Circle extends Object
	MyPoint p;
	int r;
	
	Circle() {
		p = new MyPoint();  // ���������� �ʱ�ȭ
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
//		1. ���԰��� �ǽ� 
//		c.p.x = 1;
//		c.p.y = 2;
//		c.r = 3;
//		System.out.println("c.p.x = " + c.p.x);
//		System.out.println("c.p.y = " + c.p.y);
//		System.out.println("c.r = " + c.r);
		
//		2. toString �ǽ�
		System.out.println(c.toString());  // "basic.ch07.Circle@5ccd43c2"
		System.out.println(c);             // "basic.ch07.Circle@5ccd43c2"
		Circle c2 = new Circle();
		System.out.println(c2.toString());  // "basic.ch07.Circle@4aa8f0b4"
		System.out.println(c2);             // "basic.ch07.Circle@4aa8f0b4"
	}

}

/* ���
 * c.p.x = 1
 * c.p.y = 2
 * c.r = 3
 */