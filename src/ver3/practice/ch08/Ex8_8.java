package ver3.practice.ch08;

// 다음은 1~100사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다.
// 예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 보완하라.


/**
   1과 100 사이의 값을 입력하세요 :50
   더 작은 수를 입력하세요.
   1과 100 사이의 값을 입력하세요 :asdf
   Exception in thread "main" java.util.InputMismatchException
       at java.util.Scanner.throwFor(Scanner.java:819)
       at java.util.Scanner.next(Scanner.java:1431)
       at java.util.Scanner.nextInt(Scanner.java:2040)
       at java.util.Scanner.nextInt(Scanner.java:2000)
       at Exercise8_8.main(Exercise8_8.java:16)
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8_8 {
    public static void main(String[] args) {
        // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random() * 100 + 1);
        int input = 0;   // 사용자 입력을 저장할 공간
        int count = 0;   // 시도횟수를 세기 위한 변수

        do {
//          try {  // try블럭은 최대한 코드를 줄이는 것이 좋다.
                count++;
                System.out.println("1과 100사이의 값을 입력하세요 :");
            try {
                input = new Scanner(System.in).nextInt();

                if(answer > input) {
                    System.out.println("더 큰 수를 입력하세요.");
                } else if (answer < input) {
                    System.out.println("더 작은 수를 입력하세요.");
                } else {
                    System.out.println("맞췄습니다.");
                    System.out.println("시도횟수는" + count + "번입니다.");
                    break;  // do-while문을 벗어난다
                }
            } catch(InputMismatchException ime) {
//                ime.printStackTrace();
//                continue;  // 'continue' is unnecessary as the last statement in a loop
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
            }
        } while(true);  // 무한반복문
    }  // end of main
}  // end of class HighLow
