package ch07;

class Point4 {
	int x;
	int y;
	
	Point4(int x, int y) {
		this.x = x;    // ������ �� - Object();  // ��� �����ڴ� ù �ٿ� �ٸ� �����ڸ� ȣ���ؾ� �Ѵ�.
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}
// 1. ������ ������ super() �ۼ� �� �� ���
//class ch07.Point4_3D extends ch07.Point4 {
//	int z;
//	
//	ch07.Point4_3D(int x, int y, int z) {
//		
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}  // Implicit super constructor ch07.Point4() is undefined. Must explicitly invoke another constructor
//	
//	String getLocation() {
//		return "x : " + x + ", y : " + y + ", z : " + z;
//	}  // �������̵�
//}

// 2. ������ ������ super() �ۼ� �� ���
class Point4_3D extends Point4 {
	int z;
	
	Point4_3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}  
	
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}  // �������̵�
}
public class PointTest {

	public static void main(String[] args) {
		Point4_3D p3 = new Point4_3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}

}

/* ���  1. ������ ������ super() �ۼ� �� �� ���
 * // Implicit super constructor ch07.Point4() is undefined. Must explicitly invoke another constructor
 */

/* ��� 2. ������ ������ super() �ۼ� �� ���
 * x : 1, y : 2, z : 3
 */