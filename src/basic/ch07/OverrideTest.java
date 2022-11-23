package basic.ch07;

class MyPoint3 {  // ������ �� - class basic.ch07.MyPoint3 extends Object {
	int x;
	int y;
//	1. �������̵� �ǽ�
//	String getLocation() {
//		return "x : " + x + ", y : " + y;
//	}
	
//	2. ObjectŬ������ toString() �������̵� �ǽ�
	public String toString() {  // public ��� ���� - �������̵� ���� 1. ����ΰ� ���� objectŬ������ toString()�� ��ġ�ؾ� �Ѵ�.
		return "x : " + x + ", y : " + y;
	}
//	3. �Ű������� �ִ� ������ �ǽ�
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//class MyPoint3_3D extends basic.ch07.MyPoint3 {
//	int z;
//	
//	String getLocation() {  
//		return "x : " + x + ", y : " + y + ", z : " + z;
//	}  // ������ getLocation()�� �������̵�
//}

public class OverrideTest {

	public static void main(String[] args) {
//		1. �������̵� �ǽ�
//		MyPoint3_3D p = new MyPoint3_3D();
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());
		
//		2. ObjectŬ������ toString() �������̵� �ǽ�
//		basic.ch07.MyPoint3 p = new basic.ch07.MyPoint3();
//		p.x = 3;
//		p.y = 5;
//		System.out.println(p.toString());  // x : 3, y : 5
//		System.out.println(p);             // x : 3, y : 5
		
//		3. �Ű������� �ִ� ������ �ǽ�
		MyPoint3 p = new MyPoint3(3, 5);
		System.out.println(p);             // x : 3, y : 5
	}

}

/* ���
 * 1. �������̵� �ǽ�
 * c.p.x = 1
 * c.p.y = 2
 * c.r = 3
 * 2. ObjectŬ������ toString() �������̵� �ǽ�
 * x : 3, y : 5
 * x : 3, y : 5
 * 3. �Ű������� �ִ� ������ �ǽ�
 * x : 3, y : 5
 */