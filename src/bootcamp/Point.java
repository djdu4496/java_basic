package bootcamp;

class Point3D extends Point {
    int z;  // 인스턴스변수 선언

    Point3D() {  // 기본 생성자
        super();
        z = 1;
    }
    Point3D(int x, int y, int z) {  // 매개변수가 있는 생성자
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return "x = " + x + ", y = " + y + ", z = " + z;
    }
}

class Point {
    int x, y; // 인스턴스변수(iv) 선언


    Point() {  // 기본 생성자
        x = 1;
        y = 1;
    }

    Point(int x, int y) {  // 매개변수가 있는 생성자
        this.x = x;
        this.y= y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Point) {
            if(((Point)obj).x == x && ((Point)obj).y == y)
                return true;
            return false;
        }
        else
            return false;
        // 2트
//        if(!(obj instanceof Point))
//            return false;
//        else if(((Point)obj).x == x && ((Point)obj).y == y)
//            return true;
//        else
//            return false;
    }

    static double getDistance(Point p1, Point p2) {
        double distance = Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2);
        return Math.sqrt(distance);
    }
    double getDistance(Point p) {
    double distance = Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2);  // 인스턴스메서드 - iv 사용
    return Math.sqrt(distance);
}
}

    class PointTest {
        public static void main(String[] args) {
    //        1-5.
//            Point p1 = new Point();  // Point인스턴스 생성
//            Point p2 = new Point(4, 5);
//
//            System.out.println(p1);
//            System.out.println(p2);
//
//            System.out.println(Point.getDistance(p1, p2));

            // 1-6.
//            Point p1 = new Point();
//            Point p2 = new Point(3, 5);
//
//            System.out.println(Math.sqrt(20) == p2.getDistance(p1));

            // 1-7.
            // 테스트 코드 1
            Point p1 = new Point();
            Point p2 = new Point(1, 1);
            Point p3 = new Point(4, 5);

            System.out.println("p1 == p2, " + p1.equals(p2));
            System.out.println("p1 == p3, " + p1.equals(p3));

            // 1-9.
//            Point3D p3_1 = new Point3D();
//            Point3D p3_2 = new Point3D(3, 4, 5);
//            System.out.println(p3_1);
//            System.out.println(p3_2);

        }
    }