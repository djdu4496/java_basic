package bootcamp.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class PokerTest {

    // 메서드명 : rankCheck
    // 반환타입 : String
    // 매개변수 : Card[] cardArr
    String rankCheck(Card[] pickedCards) {
        // 5-1. 족보 계산
        // 5-1-1. 카운팅(버킷 알고리즘)
        // 5-1-2. 페어 계산 - duo, trio, quartet
        // 5-2. 족보 확인

        String result = "";
        int[] counter = new int[Card.NUM_MAX + 1];

        for (int i = 0; i < pickedCards.length; i++)
            counter[pickedCards[i].num]++;

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
            if(pair == 1)
                result = "FULL HOUSE";
            else
                result = "THREE OF A KIND";
        else if(pair == 2)
            result = "TWO PAIR";
        else if(pair == 1)
            result = "ONE PAIR";

        // STRAIGHT
        if(pickedCards[0].num + 1 == pickedCards[1].num &&
                pickedCards[1].num + 1 == pickedCards[2].num &&
                pickedCards[2].num + 1 == pickedCards[3].num &&
                pickedCards[3].num + 1 == pickedCards[4].num)
            result = "STRAIGHT";

        // FLUSH
        if(pickedCards[0].kind  == pickedCards[1].kind &&
                pickedCards[1].kind == pickedCards[2].kind &&
                pickedCards[2].kind == pickedCards[3].kind &&
                pickedCards[3].kind == pickedCards[4].kind)
            result = "FLUSH";

        return result;
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
        System.out.println(result);
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
        assertTrue(result.equals("FOUR OF A KIND"));
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
        System.out.println(result);
        assertTrue(result.equals("FULL HOUSE"));

    }

    @Test
    public void flushTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(8,"H"),new Card(3,"H"),
                new Card(4,"H"),new Card(5,"H")};
        Card[] cardArr2 = {
                new Card(1,"H"),new Card(2,"H"),new Card(3,"H"),
                new Card(4,"H"),new Card(5,"H")};

        // 테스트
        String result = rankCheck(cardArr);
        String result2 = rankCheck(cardArr2);

        // 확인
        assertTrue(result.equals("FLUSH"));
        assertTrue(result2.equals("FLUSH"));
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
        System.out.println(result);
        assertTrue(result.equals("STRAIGHT"));

    }

}

class Card {
    public static final int NUM_MAX = 13;

    String kind;   // 카드 무늬
    int num; // 카드의 숫자

    Card() {
        this(1, "SPACE");
    }

    Card(int num, String kind) {
        this.num = num;
        this.kind = kind;
    }

    public String toString() {
        return "Card [num=" + num + ", kind=" + kind + "]";
    }  // toString()의 끝
} // Card클래스의 끝
