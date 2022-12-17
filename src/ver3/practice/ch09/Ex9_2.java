package ver3.practice.ch09;

// 다음과 같은 실행결과를 얻도록 Point3D클래스의 equals()를 멤버변수인 x, y, z의 값을 비교하도록 오버라이딩하고,
// toString()은 실행결과를 참고해서 적절히 오버라이딩하시오.

public class Ex9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?" + (p1==p2));
        System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
    }
}

class Point3D {
    int x, y, z;

    Point3D (int x, int y, int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    Point3D() {
        this(0, 0, 0);
    }

    public boolean equals(Object obj) {
        // (1) 인스턴스변수 x, y, z를 비교하도록 오버라이딩하시오.

        // 1. obj가 Object타입이므로 x, y, z값을 참조하기 위해서는 Point3D타입으로 형변환이 필요하다.
        if(obj instanceof Point3D)
            return this.x == ((Point3D)obj).x && this.y == ((Point3D)obj).y && this.z == ((Point3D)obj).z;
        return false; // 2. 타입이 Point3D이 아니면 값을 비교할 필요도 없다.
    }

    public String toString() {
        // (2) 인스턴스변수 x, y, z의 내용을 출력하도록 오버라이딩하시오.
        return "[" + x + "," + y + "," + z + "]";
    }
}


// [실행결과]
// [1,2,3]
// [1,2,3]
// p1==p2?false
// p1.equals(p2)?true
