package basic.ch14.ex14_0.ex14_0_2;

public class Ex14_0_2 {
    public static void main(String[] args) {
//      (a, b) -> a > b ? a : b;    // 람다식. 익명 객체                             [에러메시지] Operator '>' cannot be applied to '<lambda parameter>', '<lambda parameter>'
//      Object obj = (a,  b) -> a;   //                                          [에러메시지] Target type of a lambda conversion must be an interface

        // 객체 생성
//      MyFunction obj = new MyFunction() {
//          public int max(int a, int b) {  // 오버라이딩 - 접근제어자는 좁게 못 바꾼다.   [에러메시지] 'max(int, int)' in 'Anonymous class derived from basic.ch14.ex14_0.ex14_0_2.MyFunction' clashes with 'max(int, int)' in 'basic.ch14.ex14_0.ex14_0_2.MyFunction'; attempting to assign weaker access privileges ('package-private'); was 'public'
//              return a > b ? a : b;
//          }
//      };  // ';' expected

        // 람다식(익명 객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction f = (a, b) -> a > b ? a : b;  // 람다식. 익명객체

        // 객체 사용
        int value = f.max(3, 5);
        System.out.println("value=" + value);
    }
}

@FunctionalInterface  // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface MyFunction {
//  public abstract int max(int a, int b);
    int max(int a, int b);
}