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

        // 1트
//        for(int i = 2; i <= 9; i+=3) {  // 1.
//            for(int j = 1; j <= 3; j++) {  // 2.
//                System.out.printf("%d*%d=%-2d\t", i, j, i * j);  // 3-2.
//                System.out.printf("%d*%d=%-2d\t", i+1, j, (i+1) * j);
//                if(i+2 < 10) // 3-3.
//                    System.out.printf("%d*%d=%-2d", i+2, j, (i+2) * j);
//                System.out.println();
//            }
//            System.out.println();
//        }

        // 2트
        for(int i = 1; i <= 3; i++) {  // 아래 작업을 세 번 반복한다.  (2~4단, 5~7단, 8~9단)
            // 한 세트가 끝날 때마다 dan에 대해 dan += 3 해준다.
            for(int j = 1; j <= 9; j++) {  // x1 ~ x3 작업을 총 9번 반복한다.
                int dan = (j - 1) % 3 + (3 * i - 1);  // 3 * i - 1단부터 시작한다.
                int num = (j - 1) / 3 + 1;            // 1 ~ 3까지 곱한다.
                if(dan <= 9) {  // 9단 이하일 경우에만 연산을 출력한다.
                    System.out.printf("%d*%d=%d\t", dan, num, dan * num);
                    if(dan % 3 == 1 || dan == 9)  // dan을 3으로 나누었을 때 나머지가 1이거나 9단일 경우
                        System.out.println();  // 줄 바꿈 한다.
                }
            }
            System.out.println();  // 한 세트가 끝날 때마다 줄바꿈한다.
        }

    }
}
