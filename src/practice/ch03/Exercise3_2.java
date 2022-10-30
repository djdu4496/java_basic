package practice.ch03;

// 3-2. 다음 연산의 결과를 적으시오.

public class Exercise3_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;  // '5' == 53, '0' == 48
        char c = 'A';  // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);  // 연산 후 x == 3, y == 8
        System.out.println(x += 2);  // 연산 후 x == 5
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);  // 연산 전 : 65, 연산 후: 66
        System.out.println(c++);  // 연산 전 : 67, 연산 후 : 67
        System.out.println(c);
    }
}
/* 답
 * true
 * 13
 * 5
 * false
 * 2
 * 5
 * 66
 * B
 * B
 * C
 */