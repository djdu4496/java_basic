package ver3.practice.ch11;

// 다음 예제의 빙고판은 1~30사이의 숫자들로 만든 것인데, 숫자들의 위치가 잘 섞이지 않는다는 문제가 있다.
// 이러한 문제가 발생하는 이유와 이 문제를 개선하기 위한 방법을 설명하고,
// 이를 개선한 새로운 코드를 작성하시오.

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();

        int[][] board = new int[5][5];
        for(int i=0; set.size() < 25; i++) {
            set.add((int)(Math.random()*30)+1+"");
        }
        // 1. HashSet의 인스턴스 set에 저장된 데이터를 매개변수에 복사한 ArrayList의 객체를 생성하여 참조변수 list에 주소값을 저장한다.
        // 2. Collections.shuffle()을 사용하여 list의 저장된 데이터들을 섞는다.
        // 3. list에 선언되어 있는 iterator()를 호출하여 Iterator를 구현한 객체를 얻어서 사용한다.

//        ArrayList list = new ArrayList(set);                        // 1.
//        Collections.shuffle(list);                                  // 2.
        Iterator it = set.iterator();                              // 3.
        for(int i=0; i < board.length; i++) {
            for(int j=0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? " " : " ")
                        + board[i][j]);

            }
            System.out.println();
        }
    } // main
}

// [실행결과]
// 22 23 24 25 26
// 27 28 30 10 11
// 12 13 14 16 18
// 19 1 2 4 5
// 6 8 9 20 21
// [메모]
// 매개변수의 타입이 Collection인터페이스이므로 Collection인터페이스의 자손인 List인터페이스와 Set인터페이스를 구현한 모든 클래스의 인스턴스가 매개변수로 가능하다.
// 이처럼 대부분의 컬렉션 클래스들은 다른 컬렉션으로 데이터를 쉽게 옮길 수 있게 설계되어 있다.