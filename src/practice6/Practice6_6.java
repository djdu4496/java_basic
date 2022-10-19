package practice6;

/*
 * 6-6 연습문제6-4에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.
 * */

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // (1) 인스턴스메서드 getDistance를 작성하시오.
    double getDistance(int x, int y, int x1, int y1) {
        double distance = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
        return distance;
    }
}

class Practice6_6 {

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        // p와 (2, 2)의 거리를 구한다.
        System.out.println(p.getDistance(2, 2));
    }

}

/* 정답
 *
 *
 * */