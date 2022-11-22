package practice.ch02;

public class Ex2_9 {
    public static void main(String[] args) {
        /*
         *  byte b = 10;
         *  char ch = 'A';
         *  int i = 100;
         *  long l = 1000L;
         *
         *  <보기>
         *  1) b = (byte)i;
         *  2) ch = (char)b;
         *  3) short s = (short)ch;
         *  4) float f = (float)l;
         *  5) i = (int)ch;
         */
        // 1) b = (byte)i;
        // 자동 형 변환 가능 방향 : boolean -> short / char -> int -> long -> float -> double
        // 리터럴의 타입이 변수의 타입보다 저장범위가 넓으면 컴파일 에러가 발생한다.
        // 리터럴의 타입이 int형이고, 변수의 타입은 byte이기 때문에, 형 변환을 생략하면 컴파일 에러가 발생한다.

        // 2) ch = (char)b;
        // byte타입의 변수를 char타입의 변수로 형변환 시, 저장 범위가 작은 타입에서 큰 타입으로의 형변환은 생략 가능하지만
        // char의 저장 범위 : 0 ~ 65535
        // byte의 저정 범위 : -128 ~ 127
        // 두 타입의 저장범위가 다르기 때문에 형변환을 생략할 수 없다.
        // 3) short s = (short)ch;
        // char타입의 변수를 short타입의 변수로 형변환 시,
        // char의 저장 범위 : 0 ~ 65535
        // short의 저장 범위 : -2^15 ~ 2^15 - 1
        // 두 타입의 저장범위가 다르기 때문에 형변환을 생략할 수 없다.
        // 4) float f = (float)l;
        // long -> float 는 자동 형 변환이 가능한 방향에 부합하는 형 변환이다.
        // 따라서 형 변환 생략 가능하다.
        // 5) i = (int)ch;
        // char -> int는 자동 형 변환이 가능한 방향에 부합하는 형 변환이다.
        // 따라서 형 변환 생략 가능하다.

    }
}
