package ver3.practice.ch03;

//  아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
//  만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. (1) 에 알맞은 코드를 넣으시오.

public class Ex3_4 {
    public static void main(String[] args) {
        // num값의 백의 자리를 버리려면 => 나누기 100 곱하기 100
        int num = 456;
        System.out.println(/* (1) */ (int)(Math.floor(num / 100) * 100));
    }
}

// n 아래 자리의 수 0 만드는 방법 : / 10^n x 10^n