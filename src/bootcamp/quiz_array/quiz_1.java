package bootcamp.quiz_array;

// arr == {1, 3, 2}
// arr2 == {2, 1, 4}

// 1. 두 배열이 같은지
// 2. 공통숫자가 몇 개인지

import java.util.Arrays;

public class quiz_1 {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 2};
//        int [] arr2 = {2, 1, 4};
//        1트
//        boolean isSame = true; // 두 배열의 일치 여부를 저장하기 위한 boolean타입의 변수 isSame 선언 및 true로 초기화
//        int cnt = 0; // 공통 숫자의 개수를 저장하기 위한 int형 타입의 변수 cnt 선언 및 0으로 초기화
//        Arrays.sort(arr);   // arr을 오름차순으로 정렬
//        Arrays.sort(arr2);  // arr2을 오름차순으로 정렬
//        // 2. 두 배열의 모든 요소를 순회하면서 일치 여부 확인 - for문 사용
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] != arr2[i]) {
//                isSame = false;
//                break;
//            } else {  // arr[i] == arr2[i]라면, count를 해준다.
//                cnt++;
//            }
//        }
//        System.out.println("arr과 arr2 두 배열이 같은지? " + isSame);
//        System.out.println("arr과 arr2 두 배열의 공통숫자가 몇개인지? " + cnt + "개");

//      2트
        int[] arr = {1, 3, 2};
        int [] arr2 = {2, 1, 4};

        boolean isSame = true; // 두 배열의 일치 여부를 저장하기 위한 boolean타입의 변수 isSame 선언 및 true로 초기화
        int cnt = 0;

        // 1. 같은지?
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr2[i]) {
                isSame = false;
                break;
            }
        }

        System.out.println("arr과 arr2 두 배열이 같은지? " + isSame);

        // 2. 공통숫자가 몇 개인지?
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                cnt = arr[i] == arr2[j] ? cnt + 1 : cnt;
            }
        }

        System.out.println("arr과 arr2 두 배열의 공통숫자가 몇개인지? " + cnt + "개");

    }

}