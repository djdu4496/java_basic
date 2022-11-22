package practice.ch04;

// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.

public class Ex4_6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {  // 첫 번째 주사위의 눈를 나타낼 변수 i를 1로 초기화한다.
            for(int j = 1; j <= 6; j++) {  // 두 번째 주사위의 눈를 나타낼 변수 i를 1로 초기화한다.
                if(i + j == 6)  // 두 눈의 합이 6인 경우
                    System.out.println("[" + i + ", " + j + "]");  // 경우의 수를 출력한다. | 참고 | '['를 출력했더니 웬 9가 나오냐... 흥미롭군
            }
        }
    }
}
