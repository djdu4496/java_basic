package bootcamp.quiz_array;

// 야구 게임
// com {4, 1, 5}
// user {1, 4, 5}
// 1S2B - S:숫자&위치 일치 + B: 숫자일치&위치 불일치

import java.util.Arrays;

public class quiz_3 {
    public static void main(String[] args) {
//        int[] com = {4, 1, 5};
//        int[] user = {1, 4, 5};
//
//        int s = 0;  // 스트라이크 수
//        int b = 0;  // 볼 수
//        // 1. 스트라이크 여부 판별
//        for(int i = 0; i < com.length; i++) {
//            if(com[i] == user[i])
//                s++;    // com[i] == user[i]일 시, 스트라이크 수 1 증가
//        }
//        // 2. 볼 여부 판별
//            // 2-1. com 오름차순 정렬
//
//        for (int i = 0; i < com.length - 1 - i ; i++) {  // Arrays.sort(com);
//                if(com[i] > com[i + 1]) {
//                    int tmp = com[i];
//                    com[i] = com[i+1];
//                    com[i+1] = tmp;
//                }
//        }
//            // 2-2. user 오름차순 정렬
//        Arrays.sort(user);
//        for(int i = 0; i < com.length; i++) {
//            if(com[i] == user[i])
//                b++; // com[i] == user[i]일 시, 볼 수 1 증가
//        }
//
//        // 3. 중복 제거
//        b = b - s;  // 볼 수는 스트라이크 인 경우도 중복해서 카운팅되기 때문에 스트라이크 수 만큼 빼준다.
//        System.out.println(s + "S" + b + "B");  // 1S2B

        int[] com = {4, 1, 5};
        int[] user = {1, 4, 5};

        int s = 0;
        int b = 0;
        for (int i = 0; i < com.length; i++) {
            for (int j = 0; j < user.length; j++)
                if(com[i] == user[j]) {  // com[i]과 user[i]의 값이 일치할 경우
                    if(i == j) {  // 두 위치가 같다면 스트라이크 존
                        s++;
                    } else {      // 두 위치가 다르다면 볼 존
                        b++;
                    }
                }
        }
        System.out.println(s + "S" + b + "B");  // 1S2B
    }
}
