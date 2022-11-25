package ver3.practice.ch05;

// 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?

public class Ex5_2 {
    public static void main(String[] args) {
        /*
        *   int[][] arr = {
        *       { 5, 5, 5, 5, 5},
        *       { 10, 10, 10},
        *       { 30, 30}
        *   };
        *
        * */

        // 2차원 배열 arr에는 각각 arr[0], arr[1], arr[2] 세 요소가 존재한다.
        // 그 중 arr[3] == {30, 30}이다.
        // 따라서, arr[3]의 길이를 나타내는 arr[3].length == 2이다.

        System.out.printf("정답은 %d입니다.%n", 2);
    }
}
