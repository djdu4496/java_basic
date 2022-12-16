package ver3.practice.ch09;

// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// 메서드명 : delChar
// 기   능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
// 반환타입 : String
// 매개변수 : String src - 변환할 문자열
//          String delCh - 제거할 문자들로 구성된 문자열
// [Hint] StringBuffer와 String클래스의 charAt(int i)과 indexOf(int ch)를 사용하라.

public class Ex9_9 {
    /*
         (1) delChar메서드를 작성하시오.
    */

    // 1. delCh을 순회한다. - for문 사용
    // 2. delCh의 i번째 문자에 대해 src에 있는지 확인 - while문 사용(금지된 문자가 여러 개일 경우 처리)
        // 2-1. 문자열 src의 내용 변경을 위해 StringBuffer를 생성한다.
        // 2-2. 금지된 문자가 존재하는 경우, 해당 문자를 삭제한다. - indexOf(int ch) 사용
        // 2-3. 금지문자를 제거한 문자열을 변수 src에 다시 저장한다. - 2-1. ~ 2-3. 반복
        // 2-4. 금지문자가 문자열 src에 존재하지 않을 때까지 2-1 ~ 2-3 반복
    // 3. 문자열 src를 반환한다.

    static String delChar(String src, String delCh) {
        for (int i = 0; i < delCh.length(); i++) {              // 1.
            StringBuffer sb = new StringBuffer(src);            // 2-1.
            while(src.indexOf(delCh.charAt(i)) != -1) {         // 2-4
                sb.deleteCharAt(src.indexOf(delCh.charAt(i)));  // 2-2.
                src = sb.toString();                            // 2-3.
            }
        }
        return src;
    }


    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\\t5)" + " -> " + delChar("(1 2 3 4\t5)"," \t"));
    }
}

// [실행결과]
// (1!2@3^4~5) -> 12345
// (1 2   3      5) -> (12345)
// 레퍼런스
// charAt은 알 겠는데 indexOf를 어떻게 활용해야 하는지 감이 잘 오지 않늗ㄴ다.
// 이번엔 반복되는 걸 해결 X
// 또 코드로 비벼서 풀었다. 생각정리 제대로 안 함