package basic.ch07;

class Point4 {
	int x;
	int y;

	Point4(int x, int y) {
		this.x = x;    // 컴파일 후 - Object();  // 모든 생성자는 첫 줄에 다른 생성자를 호출해야 한다.
		this.y = y;
	}

	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}
// 1. 조상의 생성자 super() 작성 안 할 경우
//class Point4_3D extends Point4 {
//	int z;
//
//	Point4_3D(int x, int y, int z) {
//
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}  // Implicit super constructor Point4() is undefined. Must explicitly invoke another constructor
//
//	String getLocation() {
//		return "x : " + x + ", y : " + y + ", z : " + z;
//	}  // 오버라이딩
//}

// 2. 조상의 생성자 super() 작성 할 경우
class Point4_3D extends Point4 {
	int z;

	Point4_3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}  // 오버라이딩
}
public class PointTest {

	public static void main(String[] args) {
		Point4_3D p3 = new Point4_3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}

}

/* 출력  1. 조상의 생성자 super() 작성 안 할 경우
 * // Implicit super constructor Point4() is undefined. Must explicitly invoke another constructor
 */

/* 출력 2. 조상의 생성자 super() 작성 할 경우
 * x : 1, y : 2, z : 3
 */