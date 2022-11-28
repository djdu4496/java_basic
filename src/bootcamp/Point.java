package bootcamp;

import java.util.Objects;

import static bootcamp.Point.getDistance;

public class Point {
    int x, y;  // 인스턴스변수(iv) 선언

    Point() {}  // 기본 생성자

    Point(int x, int y) {  // 매개변수가 있는 생성자
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object obj) {
//         return this == obj;          // 오버라이딩 전
        if (obj instanceof Point) {     // 비교하는 객체가 Point객체일 때
            return x == ((Point)obj).x && y == ((Point)obj).y;  // Point객체의 x와 y의 값이 같을 때만 true 반환
        } else                          // 비교하는 객체가 Point객체가 아니면
            return false;                   // false를 반환
    }

    static double getDistance(Point p1, Point p2) {
        double distance = Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2);
        return Math.sqrt(distance);
    }

    double getDistance(Point p) {
        // (의문)두 점 사이의 거리를 double타입의 값으로 계산해서 반환하려면
        // 좌표 두 개가 필요하기 때문에 매개변수도 두 개가 필요한 것 아닌가?
        // 한 점을 (0, 0)이라 가정하고 메서드를 정의해보자.
        // 위에서 정의한 static메서드 getDistance를 오버로딩하는 것이다.

        double distance = Math.pow(p.x, 2) + Math.pow(p.y, 2);
        return Math.sqrt(distance);  // 제곱근 구하기 메서드
    }
}

class Point3D extends Point {
    int z;  // 인스턴스 변수 선언

    Point3D() {  // 기본 생성자 - 인스턴스변수 x, y, z를 모두 1로 초기화
        x = 1;  // this.x == x, 참조변수 this 생략 가능
        y = 1;
        z = 1;
    }

    Point3D(int x, int y, int z) {  // 매개변수가 있는 생성자
        this.x = x;  // 참조변수 this 생략 불가능
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y + ", z = " + z;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point3D) {
            return this.x == ((Point3D)obj).x
                    && this.y == ((Point3D)obj).y
                    && this.z == ((Point3D)obj).z;
        } else {
            return false;
        }
    }
}

class PointTest {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println(p.getDistance(p));
    }
}
