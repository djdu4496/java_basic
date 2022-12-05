package ver3.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
          try { } catch (Exception e) { }
        } catch (Exception e) {
            try { } catch (Exception e2) { }  // 에러. 변수 e가 중복 선언되었다.
        }  // try-catch의 끝

        try {

        } catch (Exception e) {

        }  // try-catch문
    }  // main메서드의 끝
}
