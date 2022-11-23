package ver3.practice.ch04;

// Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.

public class Ex4_7 {
    public static void main(String[] args) {
        int value;
        // 1부터 6사이의 임의의 정수를 표현하려면 난수를 이용해야 한다.
        // 난수를 불러오려면 Math.random()을 사용해야 한다.

        // Math.random메서드 - JAVA API
        // Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
        // random메서드의 반환타입이 double이다. 0 이상 1 미만의 값을 반환한다.

        // 문제 나누기
        // 1. Math.random() 호출                          // 0.0 <= return value < 1.0   -  {0}
        // 2. 저장할 정수의 범위를 1 이상 6 미만으로 제한한다.
            // 2-1. 곱하기 6                              // 0.0 <= return value < 6.0   -  {0.0, 1.0, 2.0, 3.0, 4.0, 5.0}
            // 2-2. 더하기 1                              // 1.0 <= return value < 7.0   -  {1.0, 2.0, 3.0, 4.0, 5.0, 6.0}
        // 3. 1부터 6 사이의 임의의 정수
        // 4. 임의의 정수를 저장해야 하므로 (int)로 형변환한다.     // 1 <= return value < 7       -  {1, 2, 3, 4, 5, 6}

        value = (int)(Math.random() * 6 + 1);

        System.out.println("value:"+value);
    }
}
