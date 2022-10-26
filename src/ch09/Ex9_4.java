package ch09;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);  // Card(String kind, int number)를 호출
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    // equals()를 오버라이딩하면 hashCode()도 오버라이딩해야 한다.
    public int hashCode() {
        return Objects.hash(kind, number);  // Objects클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
    }  // 가변인자 : 매개변수가 가변인자(Object...)라서 호출시 지정하는 값의 개수가 정해져 있지 않다.

    public boolean equals(Object obj) {  // 오버라이딩 조건 1. 선언부 일치(반환타입, 메서드명, 매개변수 목록)
        if(!(obj instanceof Card)) return false;
        Card c = (Card)obj;
        return (this.kind == c.kind) && (this.number == c.number);
    }
    // Object클래스의 toString()을 오버라이딩
    public String toString() {
        // Card인스턴스의 kind와 number를 문자열로 반환한다.
        return "kind : " + kind + ", number : " + number;
    }

}

class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}