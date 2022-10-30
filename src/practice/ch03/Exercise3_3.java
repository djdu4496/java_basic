package practice.ch03;

// 3-3. 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
//      만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//      (1) 에 알맞은 코드를 넣으시오.
public class Exercise3_3 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println(/* (1) */ (int)(Math.floor(num / 100) * 100));
    }
}

// 아래 자리의 수 0 만드는 방법 : / 10^n x 10^n