package ver3.practice.ch04;

// 구구단의 일부를 다음과 같이 출력하시오.

public class Ex4_12 {
    public static void main(String[] args) {

        // 문제 나누기
        // 1. 2단 부터 9단까지 반복문을 수행한다.
        // 2. 각 단은 x3까지 수행한다.
        // 3. 특정 형식의 문자열을 반복하기 때문에 prinf()을 사용한다.
            // 3-1. 각 단 별로 구분을 위해 \t을 사용하여 간격을 맞춘다.
            // 3-2. 두 수의 곱을 나타내는 수
                // 3-2-1. 간격 유지를 위해 정수를 2자리로 통일시킨다.
                // 3-3-2. 왼쪽 정로 출력하기 위해 -를 붙인다.
            // 3-3. 9단 이상 넘어갈 경우 출력을 하지 않기 위해 조건문을 사용한다.

        for(int i = 2; i <= 9; i+=3) {  // 1.
            for(int j = 1; j <= 3; j++) {  // 2.
                System.out.printf("%d*%d=%-2d\t", i, j, i * j);  // 3-2.
                System.out.printf("%d*%d=%-2d\t", i+1, j, (i+1) * j);
                if(i+2 < 10) // 3-3.
                    System.out.printf("%d*%d=%-2d", i+2, j, (i+2) * j);
                System.out.println();
            }
            System.out.println();
        }
    }
}
