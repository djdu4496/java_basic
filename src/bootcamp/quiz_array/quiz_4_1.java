package bootcamp.quiz_array;

// int[] arr = {4, 1, 5, 2, 3, 4, 1}
// 1. 카운팅
// 2. 중복 제거된 결과 출력 {1, 2, 3, 4, 5}
// 3. 정렬해서 출력 {1, 1, 2, 2, 3, 4, 4, 5}

public class quiz_4_1 {
    public static void main(String[] args) {
        // 1. 입력
        int[] arr = {4, 1, 5, 2, 2, 3, 4, 1};
        final int N = arr.length;

        // 2. 작업(처리)
        // 2-1. 카운팅
        int[] counter = new int[N];  // 1부터 5의 개수를 저장하기 위한 배열 counter 생성
        for(int i = 0; i < N; i++) {
            counter[arr[i]]++;
        }

        for(int i = 0; i < counter.length; i++) {
            System.out.printf("%d의 개수 : %d%n", i, counter[i]);
        }

    }
}
