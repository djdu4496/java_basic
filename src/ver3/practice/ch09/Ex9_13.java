package ver3.practice.ch09;

// 다음은 하나의 긴 문자열(source)중에서 특정 문자열과 일치하는 문자열의 개수를 구하는 예제이다.
// 빈 곳을 채워 예제를 완성하시오.

public class Ex9_13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
    }

    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }

    static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;

        if(key == null || key.length() == 0)
            return 0;
        /*
            (1) 알맞은 코드를 넣어 완성하시오.
        */

        // str.indexOf(String str)를 사용하여 시작위치 pos부터 문자열 src에 str이 존재한다면
            // 1. 위에서 선언한 변수 index에 반환된 index를 저장한다.
            // 2. count++를 한다.
            // 3. 검색 시작 위치 pos를 key의 src의 index + key.length() - 1로 업데이트한다.
            // 4. 매개변수 src에서 찾은 문자열 key 다음 위치부터로 분할한다.
            // 5. 새로 업데이트한 src에 key가 존재하는지 찾는다.
            // 6. 만약, -1이 반환된다면(존재x) count를 반환한다.
        index = src.indexOf(key);
        while(index != -1) {
            count++;
            pos = index + key.length() - 1;
            src = src.substring(pos);
            index = src.indexOf(key);
        }

        return count;
    }
}

// [실행결과]
// aabbccAABBCCaa
// aa를 2개 찾았습니다.