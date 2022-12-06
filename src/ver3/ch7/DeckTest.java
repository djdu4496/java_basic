package ver3.ch7;

// DeckTest클래스
// 1. main메서드
    // 기   능 : 테스트
    // 1. 카드 한 벌(Deck)을 만든다.
    // 2. 섞기 전에 제일 위의 카드를 뽑는다.
    // 3. 뽑은 카드 출력
    // 4. 카드를 섞는다.
    // 5. 섞은 후에 제일 위의 카드를 뽑는다.
public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();      // 카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0);  // 섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c);  // System.out.println(c.toString());과 같다.

        d.shuffle();  // 카드를 섞는다.
        c = d.pick(0);  // 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

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
    // 기   능 : Deck에서 카드 하나를 임의클ㄹ 선택한다.
    // 반환타입 : Card
    // 6.
    // 메서드명 : shuffle
    // 기   능 : 카드의 순서를 섞는다.
    // 반환타입 : 없음
    // 매개변수 : 없음
class Deck {
    static final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {
        int i = 0;
        for(int k = Card.KIND_MAX; k > 0; k--)
            for (int n = 0; n < Card.NUM_MAX ; n++)
                cardArr[i++] = new Card(k, n + 1);
    }

    Card pick(int index) {
        return cardArr[index];  // 지정된 위치(index)에 있는 카드를 하나 꺼내서 반환
    }

    Card pick() {
        int index = (int)(Math.random() * CARD_NUM); // 배열 인덱스가 0부터 시작
        return cardArr[index];  // Deck에서 카드 하나를 임의로 선택한다.
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int index = (int)(Math.random() * CARD_NUM); // 배열 인덱스가 0부터 시작
            Card tmp = cardArr[i];
            cardArr[i] = cardArr[index];
            cardArr[index] = tmp;
        }
    }
}

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
    // 7.
    // 매개변수 있는 생성자
    // 기   능 : 특정 무늬와 숫자로 카드 속성 초기화
    // 8.
    // 메서드명 : toString() - 오버라이딩
    // 기   능 : 카드 무늬 & 숫자 출력
    // 반환타입 : String
    // 매개변수 : 없음
class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    // iv 선언
    int number;
    int kind;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";  // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
