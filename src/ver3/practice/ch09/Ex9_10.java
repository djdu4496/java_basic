package ver3.practice.ch09;

// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// 메서드명 : format
// 기   능 : 주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다.
// 반환타입 : String
// 매개변수 : String str - 변환할 문자열
//          int length - 변환된 문자열의 길이
//          int alignment - 변환된 문자열의 정렬조건
//          (0: 왼쪽 정렬, 1: 가운데 정렬, 2: 오른쪽 정렬)

public class Ex9_10 {
        /*
            (1) format메서드를 작성하시오
                1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
                2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
                3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다. ( System.arraycopy() 사용)
                4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
         */
    static String format(String str, int length, int alignment) {
        if(length < str.length())
            return str.substring(0, length);

        char[] arr = new char[length];  // 2.
        char[] strArr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ' ';
        }

        int pos = 0;  // 문자열(str)을 복사할 위치를 저장하기 위한 변수 - 왼쪽 정렬인 경우의 위치로 초기화
        if(alignment == 1)   // '가운데 정렬'인 경우
            pos = (length - str.length()) / 2; // 공백문자 절반, str 각 문자들을 먼저 채운 후, 나머지 절반은 공백문자
        else if(alignment == 2)   // '오른쪽 정렬'인 경우
            pos = length - str.length();

        for (int i = 0; i < str.length(); i++)  // str 각 문자들을 먼저 채운 후, 나머지는 공백문자
//            System.arraycopy(strArr, 0, arr, pos, strArr.length);  // 문자열을 char배열로 변환
            arr[pos++] = str.charAt(i);

        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0));  // 왼쪽 정렬
        System.out.println(format(str, 7, 1));  // 가운데 정렬
        System.out.println(format(str, 7, 2));  // 오른쪽 정렬

        str = "가나다라마";

        System.out.println(format(str, 15, 0));
        System.out.println(format(str, 15, 1));
        System.out.println(format(str, 15, 2));
    }
}

// [실행결과]
// 가나다
//   가나다
//     가나다
// 가나다라마
//      가나다라마
//           가나다라마