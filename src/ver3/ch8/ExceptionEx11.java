package ver3.ch8;

public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException();  // Exception을 고의로 발생시킨다.
    }  // main메서드의 끝
}

// [실행결과]
// Exception in thread "main" java.lang.RuntimeException
//         at ver3.ch8.ExceptionEx11.main(ExceptionEx11.java:5)

// RuntimeException과 그 자손들 : 'unchecked예외'수 - 예외처리 선택