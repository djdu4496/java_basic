package ver3.practice.ch05;

// 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램이다.
// (1)~(2)에 알맞은 코드를 넣어서 완성하시오.

public class Ex5_8 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
        int[] counter = new int[4];

        for(int i = 0; i < answer.length; i++) {
            // (1) 알맞은 코드를 완성하시오
            // 1트
            // answer[i]가 X라면, counter[X-1]에 1을 더해준다.
//            if(answer[i] == 1) {
//                counter[0]++;
//            } else if(answer[i] == 2) {
//                counter[1]++;
//            } else if(answer[i] == 3) {
//                counter[2]++;
//            } else {
//                counter[3]++;
//            }

            // 2트
            // for문을 이용해서 위 과정을 구현했다.
            for(int j = 1; j <= 4; j++) {  // // 장점 for문을 사용한 결과, 규칙성 있게 나열된 값을 변수로 표현할 수 있었다.
                if(answer[i] == j)
                    counter[j-1]++;
            }
        }

        for(int i = 0; i < counter.length; i++) {
            // (2) 알맞은 코드를 완성하시오.
            System.out.print(i + 1);
            for(int j = 0; j < counter[i]; j++) // i + 1의 개수 만큼 "*"을 출력
                System.out.print("*");
            System.out.println();
        }
    } // end of main
}  // end of class
