package practice.ch04;

// 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
// 사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자르 맞췄는지 알려준다.
// (1) ~ (2)에 알맞은 코드를 넣어 프로그램을 완성하시오.

public class Ex4_14 {
    public static void main(String[] args) {
        // 1 ~ 100사이의 임의의 값을 얻어서 answer에 저장한다.
        // 문제 나누기
        // 1. Math.random()을 사용한다.  0.0 <= x < 1.0
            // 1-1. (int)로 형변환        0 <= x < 1
            // 1-2. 곱하기 100           0 <= x < 100
            // 1-3. 더하기 1             1 <= x < 101 (1부터 100 사이의 난수 구현 완료)
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;  // 사용자 입력을 저장할 공간
        int count = 0;  // 시도횟수를 세기 위한 변수

        // 화면으로부터 사용자 입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;  // 시도 횟수가 늘어날 때마다 count에 1씩 더한다.
            System.out.print("1과 100 사이의 값을 입력하세요 :");
            input = s.nextInt();  // 입력받은 값을 변수 input에 저장한다.

            // (2) 알맞은 코드를 넣어 완성하시오
            // 문제 나누기
            // 1. 입력값이 정답보다 작은 경우
                // 1-1. 정답 여부 출력
            // 2. 입력값이 정답보다 큰 경우
                // 2-1. 정답 여부 출력
            // 3. 입력값과 정답이 같은 경우
                // 3-1. 정답 여부 출력
                // 3-2. 시도횟수 출력
                // 3-3. break문 통한 무한반복문 탈출.

            if(input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            }
            else if(input > answer)
                System.out.println("더 작은 수를 입력하세요.");
            else {
                System.out.println("맞췄습니다.");
                System.out.println("시도 횟수는 " + count + "번 입니다.");
                break;
            }
        } while(true);  // 무한반복문
    }
}
