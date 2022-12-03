package ver3.practice.ch06;
// 다음의 코드에서 정의된 변수들을 종류별로 구분해서 적으시오.

class PlayingCard2 {
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard2(int k, int n) {
        kind = k;
        num = n;
    }
}

class Ex6_8 {
    public static void main(String[] args) {
        PlayingCard2 card = new PlayingCard2(1, 1);

        System.out.println("- 클래스변수(static변수)" + "width" + ", " + "height");
        System.out.println("- 인스턴스변수 : kind, num");
        System.out.println("- 지역변수 : k, n, args, card");
    }
}

// card도 당연히 지역변수인데, 빼먹어서 틀렸다.