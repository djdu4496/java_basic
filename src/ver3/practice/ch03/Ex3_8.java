package ver3.practice.ch03;

public class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);  // '산술변환규칙'에 따라 int형보다 작은 건 int형으로 변환한다.
                                 // byte형 + byte형 -> int형
                                 // 따라서, 리터럴의 타입과 변수의 타입이 불일치하게 된다.
                                 // 변수의 저장가능범위가 리터럴 타입의 저장가능범위보다 작기 때문에 값을 변수에 저장 불가능하다.
                                 // 따라서 (byte)로 수동 형 변환을 해주어야 한다.
                                 // (byte)(byte형 + byte형) -> int형
                                 // (byte)(int형) -> int형
                                 // (byte)30  // byte의 저장 범위 -128 ~ 127
        char ch = 'A';
        ch = (char)(ch + 2);     // '산술변환규칙'에 따라 int형보다 작은 건 int로 변환된다.
                                 // char형 + int형 -> int형
                                 // 따라서, 리터럴의 타입과 변수의 타입이 불일치하게 된다.
                                 // 변수의 저장가능범위가 리터럴 타입의 저장가능범위보다 작기 때문에 값을 변수에 저장 불가능하다.
                                 // 따라서 (char)로 수동 형 변환을 해주어야 한다.
                                 // (char)(int형 + int형)  -> int형
                                 // (char)(65    + 2)     -> 67
                                 // (char)67 == 'C'

        float f = 3 / (float)2;
        long l = (long)3000 * 3000 * 3000;  // 리터럴 값이 20억보다 큰 수이기 때문에 long 타입으로 형변환 해주어야 한다.
                                            // System.out.println("l=" + 3000*3000*3000); == l=1230196224
                                            // System.out.println("l=" + (long)3000*3000*3000); == l=27000000000
                                            // 오버플로우
        float f2 = 0.1f;
        double d = 0.1;

        boolean result = d==(double)f2;    // 두 변수의 값이 일치하려면
                                           // 값 뿐만 아니라 변수의 타입이 일치해야 한다.
                                           // (암기) double타입을 float으로 형변환해야 한다.

        System.out.println("c=" + c);
        System.out.println("ch=" + ch);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result=" + result);

    }
}