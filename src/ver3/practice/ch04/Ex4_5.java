package ver3.practice.ch04;

// 다음의 for문을 while문으로 변경하시오.

public class Ex4_5 {
    public static void main(String[] args) {
//        for(int i = 0; i <= 10; i++) {
//            for(int j = 0; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//
//      1. 중첩 for문을 이중 while문으로 표현한다.
//      문제 나누기
//          1-1. 바깥쪽 for문 -> while문
//          1-2. 안쪽   for문 -> while문

        int i = 0; // 변수 i 선언 및 0으로 초기화
        while(i <= 10) {  // 조건식 i <= 10이 참일 경우, 아래 문장을 수행한다.
            int j = 0; // 변수 j 선언 및 0으로 초기화
            while(j <= i) {  // 조건식 j <= i이 참일 경우, 구현부 문장을 수행한다.
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    } // main()의 끝
} // class의 끝
