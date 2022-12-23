package ver3.practice.ch11;

import java.util.LinkedList;

// LinkedList는 실제 이름과 달리 실제로는 이중 원형 연결리스트(doubly circular linked list)로 구현되어 있다.
// LinkedList인스턴스를 생성하고 11 개의 요소를 추가했을 때
// 이 11개의 요소 중 접근시간(access time)이 가장 오래 걸리는 요소는 몇 번째 요소인가?
public class Ex11_4 {
    public static void main(String[] args) {
        System.out.println("답안 : 마지막 요소");
        System.out.println("이유 : LinkedList의 마지막 요소에 접근하려면 첫 번째 요소부터 모든 요소를 거쳐야 한다. 건너뛰기가 안 되기 때문에 LinkedList의 접근성은 ArrayList에 비해 좋지 못하다.");
    }
}
