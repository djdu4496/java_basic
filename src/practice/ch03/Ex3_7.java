package practice.ch03;

public class Ex3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ((int)((5 / (float)9 * (fahrenheit - 32)) * 100) + 1) / (float)100;

        // 문제 나누기
        // 1. 변환공식 구현하기
            // 제시문 : C = 5/9 x (F - 32)
            // 코드 : 나눗셈 연산시 분자 또는 분모에 형변환 필요
        // 2. 소수점 셋째자리에서 반올림하기
            // 2-1. 곱하기 100 : 3777.7778
            // 2-2.
                // 방법 1 | 전체 식을 (int)로 형변환 : 소수점 이하 값이 버려진다 **         == 3777.0
                // 방법 2 | 전체 식을 Math.floor()로 형변환 : 소수점 이하 값이 버려진다 **  == 3777.0
            // 2-3. 더하기 1     == 3778.0
            // 2-4. 나누기 100   == 37.78

        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + celcius);
    }
}
