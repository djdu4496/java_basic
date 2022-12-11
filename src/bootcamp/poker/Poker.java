package bootcamp.poker;

public class Poker {
    public static void main(String[] args) {
        Deck d = new Deck();                                        // 1. 카드 묶음 준비
        d.shuffle();                                                // 2. 카드 섞기
        d.pickingCards();                                           // 3. 카드 5장 뽑기
        d.sort();                                                   // 4. 카드 오름차순 정렬
        System.out.println(d.rankCheck(d.pickedCards));             // 5. 족보 체크
    } // main메서드의 끝
}

class Deck {
    static final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];
    Card[] pickedCards = new Card[5];
    Deck() {  // Deck의 카드를 초기화한다.
        int i = 0;

        for (int k = Card.KIND_MAX; k > 0; k--)
            for (int n = 0; n < Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n + 1);
    }

    Card[] pickingCards() {
        for (int i = 0; i < 5; i++) {
            pickedCards[i] = cardArr[i];
        }
        return pickedCards;
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
    }

    void sort() {
        for(int i = 0; i < pickedCards.length - 1; i++) {
            for (int j = 0; j < pickedCards.length - 1 - i; j++) {
                if(pickedCards[i].number > pickedCards[i + 1].number) {
                    Card tmp = pickedCards[i];
                    pickedCards[i] = pickedCards[i+1];
                    pickedCards[i + 1] = tmp;
                }
            }
        }
    }
    String rankCheck(Card[] pickedCards) {
        // 5-1. 족보 계산
            // 5-1-1. 카운팅(버킷 알고리즘)
            // 5-1-2. 페어 계산 - duo, trio, quartet
        // 5-2. 족보 확인

        String result = "";
        int[] counter = new int[Card.NUM_MAX + 1];

        for (int i = 0; i < pickedCards.length; i++) {
            counter[pickedCards[i].number]++;
        }
        int pair = 0;    // 2형제
        int trio = 0;    // 3형제
        int quartet = 0; // 4형제

        for (int i = 0; i < counter.length; i++) {
            if(counter[i] == 2) {
                pair++;
            } else if(counter[i] == 3) {
                trio++;
            } else if(counter[i]==4) {
                quartet++;
            }
        }

        if(quartet == 1)
            result = "FOUR OF A KIND";
        else if(trio == 1)
            result = (pair == 1) ? "FULL HOUSE" : "THREE OF A KIND";
        else if(pair == 2)
            result = "TWO PAIR";
        else if(pair == 1)
            result = "ONE PAIR";
        else
            result = "NO PAIR";

        // STRAIGHT
        if(pickedCards[0].number + 1 == pickedCards[1].number &&
                pickedCards[1].number + 1 == pickedCards[2].number &&
                pickedCards[2].number + 1 == pickedCards[3].number &&
                pickedCards[3].number + 1 == pickedCards[4].number)
            result = "STRAIGHT";

        // FLUSH
        if(pickedCards[0].kind  == pickedCards[1].kind &&
                pickedCards[1].kind == pickedCards[2].kind &&
                pickedCards[2].kind == pickedCards[3].kind &&
                pickedCards[3].kind == pickedCards[4].kind)
            result = "FLUSH";

        return result;
    }
}

class Card {
    static final int KIND_MAX = 4;
    public static final int NUM_MAX = 13;

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


// feedback 1. PAIR면 스트레이트가 나올 수 없다.
// feedback 2. 무늬는 카운터할 필요 없다. 다섯 개만 비교하면 되니까(첫 번째 것과 최대값, 최소값(대소비교)로 구하면 된다.
// 앞에서는 계산하고,
// 마지막은 최종적으로 그 값에 따라서 그 결과를 어떻게 나올지 '모아놓으면' 좋다.
// FLUSH인지, Straight인지~ '조합'이 있다. 마지막에 인지 아닌지~