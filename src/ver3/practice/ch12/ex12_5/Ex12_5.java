package ver3.practice.ch12.ex12_5;

// 아래는 예제7-3에 열거형 Kind와 Number를 새로 정의하여 적용한 것이다.
// (1)에 알맞은 코드를 넣어 예제를 완성하시오.
// (Math.random()을 사용했으므로 실행결과가 달라질 수 있다.)

import java.util.Arrays;

public class Ex12_5 {
    public static void main(String[] args) {
        System.out.println(Card.Kind.CLOVER);
        Deck d = new Deck();            // 1. 카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0);             // 2. 섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c);          // System.out.println(c.toString());과 같다.

        d.shuffle();                    // 3. 카드를 섞는다.
        c = d.pick(0);                  // 4. 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = Card.Kind.values().length * Card.Number.values().length; // 카드의 개수

    Card cardArr[] = new Card[CARD_NUM];                                          // Card객체 배열을 포함

    Deck() {                                                                      // Deck 생성자
        /*
        *   (1) 알맞은 코드를 넣어서 완성하시오.
        *       Deck의 카드를 초기화한다.
        */
        // Deck 생성자
        // 기   능: Deck(cardArr[]) 초기화 - Card객체 배열(cardArr)에 카드(Card)를 모두 저장한다.
            // 1. 열거형 Kind와 Number를 배열로 따로 정의 - 열거형의 모든 원소들을 순회할 수 있다.
            // 2. 배열 cardArr에 모든 종류 & 숫자 카드를 저장한다.
                // 2-1. 모든 종류를 저장한 배열 kArr을 순회한다.
                // 2-2. 모든 숫자를 저장한 배열 nArr을 순회한다.
                // 2-3. Card객체를 생성하여 cardArr의 요소로 저장한다.

        Card.Kind[] kArr = Card.Kind.values();
        Card.Number[] nArr = Card.Number.values();

        int i = 0;
        for (int k = 0; k < kArr.length; k++)
            for (int n = 0; n < nArr.length; n++)
                cardArr[i++] = new Card(kArr[k], nArr[n]);
    }

    Card pick(int index) {  // 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick() {   // Deck에서 카드 하나를 선택한다.
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }


    void shuffle() {  // 카드의 순서를 섞는다.
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }  // Deck클래스의 끝
}


// Card클래스
class Card {
    enum Kind { CLOVER, HEART, DIAMOND, SPADE }
    enum Number {
        ACE, TWO , THREE, FOUR, FIVE,
        SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING
    }

    Kind kind;
    Number num;

    Card() {
        this(Kind.SPADE, Number.ACE);
    }

    Card(Kind kind, Number num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return "[" + kind.name() + "," + num.name() + "]";
    }  // toString()의 끝
}  // Card클래스의 끝

// [실행결과]
// [CLOVER,ACE]
// [HEART,TEN]