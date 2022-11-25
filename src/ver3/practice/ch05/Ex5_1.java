package ver3.practice.ch05;

// 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.

public class Ex5_1 {
    public static void main(String[] args) {
        // a. int[] arr[];  // 배열 선언 오류. 대괄호[]는 타입 뒤 또는 변수 뒤에 한 번만 붙여야 한다.
        // b. int[] arr = {1, 2, 3, };  // 배열 초기화 OK.  ','가 허용되는 이유가 있을까여?
        // c. int[] arr = new int[5];   // 배열 생성 OK.
        // d. int[] arr = new int[5]{1,2,3,4,5};  // 배열 초기화 OK. 초기화 시 배열의 길이를 지정할 수 있다.
        // e. int arr[5];  // 배열 선언 오류. 배열의 길이를 지정하려면 다음과 같이 배열을 생성해야 한다.
        // f. int[] arr[] = new int[3][]; // 가변 배열 생성. OK. 행의 길이만 3으로 지정
        System.out.printf("정답은 %s입니다.%n", "a, e");
    }
}
