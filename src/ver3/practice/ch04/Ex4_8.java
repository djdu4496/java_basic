package ver3.practice.ch04;

// 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.

public class Ex4_8 {
    public static void main(String[] args) {
        // 문제 나누기
        // 1. 반복문 사용
            // 1-1. 두 변수의 범위를 제한했기 때문에 이를 반복문의 '조건식'으로 사용할 수 있다.
            // 1-2. 제시된 조건식이 참이라면 해당 x와 y를 출력한다.

        for(int x = 0; x <= 10; x++) {
            for(int y = 0; y <= 10; y++) {
                if(2 * x + 4 * y == 10)
                    System.out.println("x=" + x + ", " + "y=" + y);
            }
        }

    }
}
