package ver3.practice.ch05;

// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.

public class Ex5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;
        // 문제 나누기
        // 1. 총합 구하기
            // 1-1. arr[0]의 총합 구하기
            // 1-2. arr[1]의 총합 구하기
            // 1-3. arr[2]의 총합 구하기
            // 1-4. arr[3]의 총합 구하기
        // 2. 평균 구하기
            // 2-1. 모든 요소의 개수를 구한다.
            // 2-2. "1. 총합 구하기"에서 구한 모든 요소의 총합을 모든 요소의 개수로 나눈다.  == arr.length * arr.[i].length


//          int count = 0; // 모든 요소의 개수를 저장하기 위한 변수 count 선언 및 0으로 초기화

            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    total += arr[i][j];  // arr[i][j] 요소에 저장된 값을 total에 합한다.  // 1.
//                    count++;
                }
            }
        // 2. 평균 구하기
//            average = total / (float)(count);
            average = total / (float)(arr.length * arr[0].length);

        System.out.println("total=" + total);
        System.out.println("average=" + average);

    }
}
