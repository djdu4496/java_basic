package ver3.practice.ch05;

// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.

public class Ex5_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        /*
            알맞은 코드를 넣어 완성하시오.
         */

        for(int i = 0; i < arr.length; i++) {  // 배열의 길이만큼 반복하는 for문을 작성한다.
            sum += arr[i];                     // sum에 arr의 i번째 요소를 합한다.
        }
        System.out.printf("sum=%d%n", sum);
    }
}
