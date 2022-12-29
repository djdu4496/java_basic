package basic.ch14.ex14_0.ex14_0_1;

public class Ex14_0_1 {
    public static void main(String[] args) {
//      (a, b) -> a > b ? a : b;    // 람다식. 익명 객체 [에러메시지] Operator '>' cannot be applied to '<lambda parameter>', '<lambda parameter>'
//      Object obj = (a, b) -> a;   //               [에러메시지] Target type of a lambda conversion must be an interface

        // 객체 생성
        Object obj = new Object() {
            public int max(int a, int b) {  // 오버라이딩 - 접근제어자는 좁게 못 바꾼다.
                return a > b ? a : b;
            }
        };  // ';' expected
        // 객체 사용
//      int value = obj.max(3, 5);  // Cannot resolve method 'max' in 'Object'
                                    // 함수형 인터페이스 필요
    }
}