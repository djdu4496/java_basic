package ver3.practice.ch09;

// 커맨드라인으로 2~9사이의 두 개의 숫자를 받아서 두 숫자사이의 구구단을 출력하는 프로그램을 작성하시오.
// 예를 들어 3과 5를 입력하면 3단부터 5단까지 출력한다.
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex9_11 {
    public static void main(String[] args) {
        // 1. 두 숫자를 입력받는다.
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // 2. 유효성 검사
            if(num1 > num2) {
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
            }

            if(num1 < 2 || num2 > 9) {
                System.out.println("단의 범위는 2와 9 사이의 값이어야 합니다.");
                System.out.println("USAGE : GugudanTest " + 3 + " " + 5);
                return;
            }

            // 3. num1단부터 num2단까지 출력
            for (int i = num1; i <= num2 ; i++) {
                for (int j = 1; j <= 9; j++)
                    System.out.printf("%d*%d=%d%n", i, j, i * j);
                System.out.println();
            }
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
            System.out.println("USAGE : GugudanTest " + 3 + " " + 5);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

// [실행결과]
