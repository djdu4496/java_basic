package bootcamp.poker;

// rank Check메서드를 완성하시오.
// 메서드명 : rankCheck
// 반환타입 : String
// 매개변수 : Card 타입 배열

// Deck클래스
// 1.
// 상수이름 : CARD_NUM
// 속   성 : 카드의 개수
// 타   입 : int
// 초기화값 : 52
//
// 2.
// 변수이름 : cardArr
// 타   입 : Card타입 배열
// 배열 길이 : CARD_NUM
//
// 3.
// 기본 생성자
// 기   능 : Deck의 카드를 초기화
// 4.
// 메서드명 : pick
// 기   능 : 지정된 위치(index)에 있는 카드를 하나 꺼내서 반환
// 반환타입 : Card
// 매개변수 : int index
// 5.
// 메서드명 : pick(오버로딩)
// 기   능 : Deck에서 카드 하나를 임의로 선택한다.
// 반환타입 : Card
// 6.
// 메서드명 : shuffle
// 기   능 : 카드의 순서를 섞는다.
// 반환타입 : 없음
// 매개변수 : 없음

// Card클래스
// 1.
// 상수이름 : KIND_MAX
// 속   성 : 카드 무늬의 수
// 타   입 : int
// 초기화값 : 4
// 2.
// 상수이름 : NUM_MAX
// 속   성 : 무늬별 카드 수
// 타   입 : int
// 초기화값 : 13
// 3.
// 상수이름 : SPADE, DIAMOND, HEART, CLOVER
// 속   성 : 카드 무늬
// 타   입 : int
// 초기화값 : (순서대로) 4, 3, 2, 1
// 4.
// 변수이름 : kind
// 속   성 : 카드 무늬
// 타   입 : int
// 5.
// 변수이름 : number
// 속   성 : 카드의 숫자
// 타   입 : int
// 6.
// 기본 생성자
// 기   능 : 카드 무늬 & 숫자 초기화
// 초기화값 : SPADE & 1
// 7.
// 매개변수 있는 생성자
// 기   능 : 특정 무늬와 숫자로 카드 속성 초기화
// 8.
// 메서드명 : toString() - 오버라이딩
// 기   능 : 카드 무늬 & 숫자 출력
// 반환타입 : String
// 매개변수 : 없음

public class PokerTest {
    public static void main(String[] args) {
        Deck d = new Deck();  // 카드 한 벌(Deck)을 만든다.
        d.shuffle(); // 카드를 무작위로 섞음

        System.out.println(rankCheck(d.cardArr));
    } // main메서드의 끝

    static String rankCheck(Card[] cardArr) {
        String str = "NO PAIR";
        // 1. 섞여 있는 5장의 카드 저장하기 위한 객체 배열 생성
        Card[] ranArr = new Card[5];

        for(int i = 0; i < ranArr.length; i++) { // (이미 섞여 있는) 카드 위에서부터 다섯 장 저장
            ranArr[i] = cardArr[i];
        } // ranArr 배열 저장

        // 2. 숫자 카운터
        int[] nCounter = new int[14];
        for(int i = 0; i < ranArr.length; i++) {
            nCounter[ranArr[i].number]++;
        } // kCounter 배열 저장

        // "ONE_PAIR"
        int cnt = 0;  // 페어 개수 저장 위한 변수
        for(int i = 0; i < nCounter.length; i++) {
            if(nCounter[i] >= 2) {  // 카운터 배열 nCounter의 i번째 요소의 값이 2 이상이면
                str = "ONE PAIR";  //  str에 "ONE PAIR" 저장
                cnt++;  // 카운팅 변수에 +1 더해준다.
                if(cnt == 2)  // 카운팅 변수의 값이 2일 때(5장이기 때문에 3은 될 수 없음)
                    str = "TWO PAIR";  // str에 "TWO PAIR" 저장
                if(nCounter[i] >= 3) {  // 카운터 배열 nCounter의 i번째 요소의 값이 3 이상이면
                    str = "THREE CARD";  // str에 "THREE CARD" 저장
                }
            }
        }
        cnt = 0;  // "STRAIGHT" 여부 계산을 위해 cnt를  0으로 재할당(초기화)
        for(int i = 0; i < nCounter.length; i++) {
            if(nCounter[i] == 1)  // '숫자' 카운터 배열 nCounter의 i번째 요소의 값이 1일 경우
                cnt++;            // 카운팅 변수에 +1 더해준다.
            if(cnt > 0 && nCounter[i] == 0)  // cnt > 0이고(스트레이트 여부 계산 중) nCounter의 i번째 요소의 값이 0이면
                break;  // 더 이상 "STRAIGHT"가 될 수 없기 때문에 반복문을 나간다.
        }
        if(cnt == 5)  // cnt == 5인 경우
            str = "STRAIGHT";  // str에 "STRAIGHT" 저장

        // 3. 무늬 카운터
        int[] kCounter = new int[5];

        for (int i = 0; i < ranArr.length; i++) {
            kCounter[ranArr[i].kind]++;
        } // kCounter 배열 저장

        for(int i = 0; i < kCounter.length; i++) {
            if(kCounter[i] == 5)  // '무늬' 카운터 배열 nCounter의 i번째 요소의 값이 5일 경우
                str = "FLUSH";  // str에 "FLUSH" 저장
        }
        return str;
    } // rankCheck메서드의 끝
}

class Deck {
    static final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {  // Deck의 카드를 초기화한다.
        int i = 0;

        for (int k = Card.KIND_MAX; k > 0; k--)
            for (int n = 0; n < Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n + 1);
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return cardArr[index];
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
    }
}

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;   // 카드 무늬
    int number; // 카드의 숫자

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";
        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }  // toString()의 끝
} // Card클래스의 끝

// [테스트 코드]
//    ranArr[0] = cardArr[0];
//    ranArr[1] = cardArr[1];
//    ranArr[2] = cardArr[2];
//    ranArr[3] = cardArr[3];
//    ranArr[4] = cardArr[17];
//    System.out.println(ranArr[0] + ", " + ranArr[1] + ", " + ranArr[2] + ", " + ranArr[3] + ", " + ranArr[4]);