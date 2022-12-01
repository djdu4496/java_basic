//package ver3.practice.ch07;
//// 문제 7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트하시오.
//// [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//
//// 1. 메서드명 : shuffle
////    기   능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random() 사용)
////    반환타입 : 없음
////    매개변수 : 없음
//
//// 1. 메서드명 : pick
////    기   능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
////    반환타입 : SutdaCard
////    매개변수 : int index - 위치
//
//// 3. 메서드명 : pick
////    기   능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random() 사용)
////    반환타입 : SutdaCard
////    매개변수 : 없음
//
//class SutdaDeck {
//    final int CARD_NUM = 20;
//    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//    SutdaDeck() {
//        /*
//            문제 7-1의 답이므로 내용 생략
//        */
//        // (1) 배열 SutdaCard를 적절히 초기화하시오.
//        for (int i = 0; i < CARD_NUM; i++) {
//            if(i + 1 == 1 || i + 1 == 3 || i + 1 == 8)  // index가 0, 2, 7인 경우(idx == 0부터 시작)
//                cards[i] = new SutdaCard(i % 10 + 1, true);
//            else
//                cards[i] = new SutdaCard(i % 10 + 1, false);
//        }
//    }
//    /*
//        (1) 위에 정의된 세 개의 메서드를 작성하시오.
//    */
//
//    void shuffle() {
//        // 임의로 바꿀 값
//        // 임시변수
//        for(int i = 0; i < cards.length; i++) {
//            int num = (int)(Math.random() * cards.length);
//            SutdaCard tmp = cards[i];
//            cards[i] = cards[num];
//            cards[num] = tmp;
//        }
//
//    }
//
//    // 2. pick
//    SutdaCard pick(int index) {
//        return cards[index];
//    }
//
//    // 3. pick
//    SutdaCard pick() {
//        return cards[(int)(Math.random() * cards.length)];
//    }
//}  // SutdaDeck
//
//class SutdaCard {
//    int num;
//    boolean isKwang;
//
//    SutdaCard() {
//        this(1, true);
//    }
//
//    SutdaCard(int num, boolean isKwang) {
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//
//    public String toString() {
//        return num + ( isKwang ? "K" : "");
//    }
//}
//
//public class Ex7_2 {
//    public static void main(String[] args) {
//        SutdaDeck deck = new SutdaDeck();
//
//        System.out.println(deck.pick(0));
//        System.out.println(deck.pick());
//        deck.shuffle();
//
//        for (int i = 0; i < deck.cards.length; i++)
//            System.out.print(deck.cards[i]+",");
//
//        System.out.println();
//        System.out.println(deck.pick(0));
//    }
//}
//
//// [실행결과]
//// 1K
//// 7
//// 2, 6, 10, 1K, 7, 3, 10, 5, 7, 8, 5, 1, 2, 9, 6, 9, 4, 8K, 4, 3K,
//// 2