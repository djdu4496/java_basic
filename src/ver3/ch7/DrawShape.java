package ver3.ch7;

public class DrawShape {
    public static void main(String[] args) {  // 테스트
        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw();
        c.draw();
    }
}

// Shape클래스
// 색상 뜻하는 iv shape 선언
// 색상 출력하는 draw메서드 선언
class Shape {
    // color "black"으로 초기화
    String color = "black";
    // 메서드 이름 : draw
    // 기능 : 도형의 색상을 출력하는 메서드
    // 매개변수 : 없음
    // 반환타입 : 없음
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}
// Triangle클래스 - 삼각형, Shape 자손
// 점 3개 필요 - Point타입 배열 iv로 선언
class Triangle extends Shape {
    // Point타입 배열 생성, 배열 크기 : 3
    // 점 3개에 대한 데이터를 저장,
    Point[] p = new Point[3];  // 3개의 Point인스턴스를 담을 배열을 생성한다.

    // 매개변수 있는 생성자
    // 매개변수 : Point타입 배열
    Triangle(Point[] p) {
        this.p = p;
    }

    // Shape의 인스턴스메서드 draw를 오버라이딩하여 색상 + 3 좌표의 정보를 출력한다.
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}

// Circle클래스 - 원 모양, Shape 자손
// 점 1개 필요 Point타입 iv 선언
// 반지름 뜻하는 iv 선언
// 기본 생성자
class Circle extends Shape {
    Point center;  // 원의 원점좌표
    int r;  // 반지름

    Circle() {
        this(new Point(0, 0), 100);
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {  // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n"
        , center.x, center.y, r, color);
    }
}

// Point클래스  - (x, y) 좌표
// x좌표 iv 선언
// y좌표 iv 선언
// 기본 생성자 - (0, 0)으로 초기화
// 매개변수 있는 생성자 - 초기화
// getXY메서드 - (x, y) 좌표 정보를 문자열로 출력
class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }
}