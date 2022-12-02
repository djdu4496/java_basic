package bootcamp.quiz_array;

// int[] arr = {4, 1, 5, 2, 3, 4, 1}
// 1. 카운팅
// 2. 중복 제거된 결과 출력 {1, 2, 3, 4, 5}
// 3. 정렬해서 출력 {1, 1, 2, 2, 3, 4, 4, 5}

public class quiz_4_3 {
    public static void main(String[] args) {
        // 1. 입력
        int[] arr = {4, 1, 5, 2, 2, 3, 4, 1};
        final int N = arr.length;

        // 카운팅
        int[] counter = new int[6];
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
//        System.out.println(java.util.Arrays.toString(counter));
//        // 중복 제거
//        String str = "";
//        for (int i = 0; i < counter.length; i++) {
//            if(counter[i] > 0)
//                str = str + i;
//        }

        // 정렬
        String str = "";
        for (int i = 0; i < counter.length; i++) {
            for(int j = 0; j < counter[i]; j++) {
                str = str + i;
            }
        }
        System.out.println(str);
    }
}