package ver3.practice.ch06;

/*
 * 6-20. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : max
 * 기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
 *       만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
 * 반환타입 : int
 * 매개변수 : int[] arr - 최대값을 구할 배열
 * */

class Ex6_23 {
    // (1) max메서드를 작성하시오.
    static int max(int[] arr) {
        // 1. 유효성 검사 - 만일 주어진 배열이 null이거나 크기아 0인 경우, -999999를 반환한다.
        if(arr == null || arr.length == 0) return -999999;
        // 2. 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
        int max = arr[0];  // 제일 큰 값을 저장하기 위한 int형 변수 max 선언 및 arr[0]으로 초기화
        for(int i = 1; i < arr.length; i++)   // arr[1]부터 arr[arr.length-1]까지 순회
            max = max < arr[i] ? arr[i] : max;  // arr[i]이 max보다 크다면 max에 arr[i]를 재할당한다.
        return max;  // 최대값 max 반환
    }

    public static void main(String[] args) {
        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[] {}));  // 크기가 0인 배열
    }
}

// 결과
// [3, 2, 9, 4, 7]
// 최대값:9
// 최대값:-999999
// 최대값:-999999