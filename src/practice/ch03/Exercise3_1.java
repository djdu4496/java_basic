package practice.ch03;

// 3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
/*
 *  byte b = 10;
 *  char ch = 'A';
 *  int i = 100;
 *  long l = 1000L;
 *
 *  <보기>
 *  1) b = (byte)i;  // x
 *  2) ch = (char)b;
 *  3) short s = (short)ch;
 *  4) float f = (float)l;
 *  5) i = (int)ch;
 */
class Exercise3_1 {
    public static void main(String[] args) {
        // 답 :
        System.out.println("답: 4번, 5번");
    }
}
// 풀이
// 1. int형(4byte)을 byte형(1byte)로 형변환할 때, 큰 값을 작은 값으로 형변환 하기 때문에 생략 불가하다.
// 2. byte형(1byte)를 char형(2byte)로 형변환 할 때, 작은 값을 큰 값으로 형변환하기 때문에 생략할 수 있다 생각할 수 있지만
//    byte형은 -128부터지만, char형은 0부터이다. 따라서 범위가 다르기 때문에 생략할 수 없다.
// 3. char형(2byte)을 short형(2byte)으로 형변환 할 때, 두 타입의 크기는 같지만, short형은 부호 있는 정수이기 때문에 +-3만이지만,
//    char형은 0 ~ 6만으로 저장 가능한 값의 범위가 다르기 때문에 자동 형변환이 안 된다.
// 4. long형(8byte)을 float형(4byte)으로 형변환 할 때, 큰 값을 작은 값으로 형변환하지만
//    float형이 저장할 수 있는 최대값은 10의 38제곱인 것에 비해, long형은 10의 19제곱이다.
// * 단순히 byte로만 따지면 long이 크지만, 표현할 수 있는 값의 범위는 float이 크기 떄문에 자동 형 변환이 가능하다.
// 5. char형(2byte)을 int형(4byte)로 형 변환할 때, 작은 값을 큰 값으로 형변환하기 때문 자동 형 변환이 가능하다.