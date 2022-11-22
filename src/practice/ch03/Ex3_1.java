package practice.ch03;

// 다음 연산의 결과를 적으시오.

class Ex3_1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;  // '5' == 53, '0' == 48
        char c = 'A';  // 'A'의 문자코드는 65
        //     연산 결과     x     y     c
        System.out.println(y >= 5 || x < 0 && x > 2);   //      true
        System.out.println(y += 10 - x++);              //       13        3    13
        System.out.println(x += 2);                     //       5         5
        System.out.println(!('A' <= c && c <= 'Z'));    //      false
        System.out.println('C' - c);                    //       2
        System.out.println('5' - '0');                  //       5
        System.out.println(c + 1);                      //       66
        System.out.println(++c);                        //       B                    B  // * 단항 연산자는 산술변환규칙 적용 X
        System.out.println(c++);                        //       B                    C
        System.out.println(c);                          //       C
    }
}
