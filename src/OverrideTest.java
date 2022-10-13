class MyPoint3 {  // 컴파일 후 - class MyPoint3 extends Object {
	int x;
	int y;
//	1. 오버라이딩 실습
//	String getLocation() {
//		return "x : " + x + ", y : " + y;
//	}
	
//	2. Object클래스의 toString() 오버라이딩 실습
	public String toString() {  // public 사용 이유 - 오버라이딩 조건 1. 선언부가 기존 object클래스의 toString()과 일치해야 한다.
		return "x : " + x + ", y : " + y;
	}
//	3. 매개변수가 있는 생성자 실습
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//class MyPoint3_3D extends MyPoint3 {
//	int z;
//	
//	String getLocation() {  
//		return "x : " + x + ", y : " + y + ", z : " + z;
//	}  // 조상의 getLocation()을 오버라이딩
//}

public class OverrideTest {

	public static void main(String[] args) {
//		1. 오버라이딩 실습
//		MyPoint3_3D p = new MyPoint3_3D();
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());
		
//		2. Object클래스의 toString() 오버라이딩 실습
//		MyPoint3 p = new MyPoint3();
//		p.x = 3;
//		p.y = 5;
//		System.out.println(p.toString());  // x : 3, y : 5
//		System.out.println(p);             // x : 3, y : 5
		
//		3. 매개변수가 있는 생성자 실습
		MyPoint3 p = new MyPoint3(3, 5);
		System.out.println(p);             // x : 3, y : 5
	}

}

/* 출력
 * 1. 오버라이딩 실습
 * c.p.x = 1
 * c.p.y = 2
 * c.r = 3
 * 2. Object클래스의 toString() 오버라이딩 실습
 * x : 3, y : 5
 * x : 3, y : 5
 * 3. 매개변수가 있는 생성자 실습
 * x : 3, y : 5
 */