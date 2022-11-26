package ver3.practice.ch05;

import java.util.*;
// 예제 5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.

public class Ex5_12 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair","의자"},			// words[0][0], words[0][1]
                {"computer","컴퓨터"},	// words[1][0], words[1][1]
                {"integer","정수"}		  // words[2][0], words[2][1]
        };

        Scanner scanner = new Scanner(System.in);
        int cnt = 0;  // 정답 개수를 저장하기 위한 변수 cnt 선언 및 0으로 초기화
        for(int i=0;i<words.length;i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
                cnt++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
            }
        } // for
        System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, cnt);
    }   // main의 끝
    }
