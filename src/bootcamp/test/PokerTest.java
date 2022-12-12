package bootcamp.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class PokerTest {

        // 메서드명 : rankCheck
        // 반환타입 : String
        // 매개변수 : Card[] cardArr
           // 5-1. 족보 계산
           // 5-1-1. 카운팅(버킷 알고리즘)
           // 5-1-2. 페어 계산 - duo, trio, quartet
           // 5-2. 족보 확인
        String rankCheck(Card[] pickedCards) {
            // 5-1. 족보 계산
            int[] counter = getCounter(pickedCards);
            String result = getResult(counter);

            // 5-2. 족보 확인
            // 5-2-1. FLUSH, STRAIGHT, STRAIGHT FLUSH
            boolean isFlush = isFlush(pickedCards);
            boolean isStraight = isStraight(pickedCards);

            if(isFlush && isStraight) return "STRAIGHT FLUSH";
            if(isFlush) return "FLUSH";
            if(isStraight) return "STRAIGHT";

            // 5-2-2. OTHERS(FULL HOUSE, FOUR CARD, THREE CARD, TWO PAIR, ONE PAIR)
            return result;
        }

    private static boolean isStraight(Card[] pickedCards) {
        return pickedCards[0].num + 1 == pickedCards[1].num &&
                pickedCards[1].num + 1 == pickedCards[2].num &&
                pickedCards[2].num + 1 == pickedCards[3].num &&
                pickedCards[3].num + 1 == pickedCards[4].num;
    }

    private static boolean isFlush(Card[] pickedCards) {
        return pickedCards[0].kind == pickedCards[1].kind &&
                pickedCards[1].kind == pickedCards[2].kind &&
                pickedCards[2].kind == pickedCards[3].kind &&
                pickedCards[3].kind == pickedCards[4].kind;
    }

    private String getResult(int[] counter) {
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

        if(quartet==1) return "FOUR CARD";
        if(trio==1&&pair==1) return "FULL HOUSE";
        if(trio==1&&pair==0) return "THREE CARD";
        if(pair==2) return "TWO PAIR";
        if(pair==1) return "ONE PAIR";

        return "NO RANK";
    }

    private static int[] getCounter(Card[] pickedCards) {
        int[] counter;
        counter = new int[Card.NUM_MAX + 1];

        for (int i = 0; i < pickedCards.length; i++) {
            counter[pickedCards[i].num]++;
        }
        return counter;
    }

    @Test
    public void onepairTest() {

        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(1,"D"),new Card(3,"H"),
                new Card(4,"H"),new Card(5,"H")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("ONE PAIR"));
    }

    @Test
    public void twopairTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(1,"D"),new Card(3,"H"),
                new Card(3,"H"),new Card(5,"H")};
        // 테스트
        String result = rankCheck(cardArr);
        // 확인
        assertTrue(result.equals("TWO PAIR"));
    }

    @Test
    public void FourCardTest() {
        // 조건
        Card[] cardArr = {
            new Card(1,"H"),new Card(1,"H"),new Card(1,"H"),
            new Card(1,"H"),new Card(3,"D")};
        // 테스트
        String result = rankCheck(cardArr);
        // 확인
        assertTrue(result.equals("FOUR CARD"));
    }


    @Test
    public void fullHouseTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(1,"H"),new Card(1,"H"),
                new Card(3,"H"),new Card(3,"D")};


        // 테스트
        String result = rankCheck(cardArr);


        // 확인
        assertTrue(result.equals("FULL HOUSE"));

    }

    @Test
    public void flushTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(8,"H"),new Card(3,"H"),
                new Card(4,"H"),new Card(5,"H")};


        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("FLUSH"));
    }
    @Test
    public void straightFlushTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(2,"H"),new Card(3,"H"),
                new Card(4,"H"),new Card(5,"H")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("STRAIGHT FLUSH"));
    }


    @Test
    public void straightTest() {

        // 조건
        Card[] cardArr = {

                new Card(1,"H"),new Card(2,"D"),new Card(3,"H"),

                new Card(4,"H"),new Card(5,"H")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("STRAIGHT"));

    }
    @Test
    public void noRankTest() {

        // 조건
        Card[] cardArr = {
                new Card(1,"D"),new Card(3,"S"),new Card(5,"H"),
                new Card(7,"D"),new Card(9,"C")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("NO RANK"));

    }

}

class Card {
    public static final int NUM_MAX = 13;

    String kind;   // 카드 무늬
    int num; // 카드의 숫자

    Card() {
        this(1, "SPADE");
    }

    Card(int num, String kind) {
        this.num = num;
        this.kind = kind;
    }

    public String toString() {
        return "Card [num=" + num + ", kind=" + kind + "]";
    }  // toString()의 끝
} // Card클래스의 끝
