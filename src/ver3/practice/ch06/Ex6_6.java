package ver3.practice.ch06;

// 두 점의 거리를 계산하는 getDistance()를 완성하시오.
// [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.

public class Ex6_6 {
    // 두 점(x, y)와 (x1, y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) {
        // (1) 알맞은 코드를 넣어 완성하시오.
        // 두 점 사이의 거리 == 루트((x좌표간 차이)^2 + (y좌표간 차이)^2)

//      return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
        return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}

// [실행결과]
// 1.4142135623730951
// [피드백]
// 메서드를 호출하는 것은 곱셈연산보다 비용이 많이 드는 작업이라는 것은 기억해두자.