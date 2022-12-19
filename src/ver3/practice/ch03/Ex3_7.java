package ver3.practice.ch03;

public class Ex3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        // 문제 나누기
        // 1. 변환공식 구현하기
            // 제시문 : C = 5/9 x (F - 32)
            // 코드 : 나눗셈 연산시 분자 또는 분모에 형변환 필요    // == 37.77778
        // 2. 소수점 셋째자리에서 반올림하기
            // 2-1. 곱하기 100 : 3777.7778
            // 2-2.
                // 방법 1 | 전체 식을 (int)로 형변환 : 소수점 이하 값이 버려진다 **         == 3777.0
                // 방법 2 | 전체 식을 Math.floor()로 형변환 : 소수점 이하 값이 버려진다 **  == 3777.0
            // 2-3. 더하기 1     == 3778.0
            // 2-4. 나누기 100   == 37.78
//      float celcius = ((int)((5 / (float)9 * (fahrenheit - 32)) * 100) + 1) / (float)100;
//      System.out.println((5 / (float)9 * (fahrenheit - 32))*100);
        // second try
        // 1. 변환공식
        // 1-1. 5/9f
        // 1-2. 1. 결과 곱하기 (F-32)
        // 2. 반올림
        // 2-1. 변환공식 곱하기 10^3-1f
        // 2-2. 더하기 0.5
        // 2-3. (int) 형 변환
        // 2-4. 나누기 10^3-1f
        float celcius = (int)(5/9f * (fahrenheit - 32) * 100 + 0.5) / 100f;
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + celcius);
    }
}

// 문제를 쉽게 만드는 법을 연습해보자.