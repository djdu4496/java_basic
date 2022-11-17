package ch07;

class Ex7_4 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x= " + p.x + ",y= " + p.y + ",z= " + p.z);
	}
}

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}

// 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.
// 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입