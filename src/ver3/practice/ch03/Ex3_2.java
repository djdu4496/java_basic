package ver3.practice.ch03;

//  아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
//  13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.

public class Ex3_2 {
    public static void main(String[] args) {
        // 사과의 개수를 바구니로 나눈다.
        // => 정수를 정수로 나누면 '몫'이 나온다.
        // 나머지에 해당하는 사과들도 담아주기 위해 +1을 해주면 필요한 바구니의 수를 구할 수 있다.

        int numOfApples = 120; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = (/* (1) */ (int)Math.ceil(numOfApples / (double)sizeOfBucket)); // 모든 사과를 담는데 필요한 사과의 개수

        System.out.println("필요한 바구니의 수 :" + numOfBucket );
    }
}

// 결과
// 필요한 바구니의 수 :13
// Test를 철저히 하지 않았다.
// numOfApples를 120으로 바꿨을 때, 12가 아니라 13이 나오기 때문에 테스트를 통과하지 못 한다.
