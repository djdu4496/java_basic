package ver3.practice.ch06;

// 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.

class MyPoint2 {
    int x;
    int y;

    MyPoint2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 인스턴스메서드 getDistance를 작성하시오.
    double getDistance(int x1, int y1) {
        // 두 점 사이의 거리 == 루트((x좌표간 차이)^2 + (y좌표간 차이)^2)
        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
    }

}

public class Ex6_7 {
    public static void main(String[] args) {
        MyPoint2 p = new MyPoint2(1, 1);

        // p와 (2, 2) 사이의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}
