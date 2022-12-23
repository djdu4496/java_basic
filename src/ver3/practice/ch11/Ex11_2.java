package ver3.practice.ch11;

// 다음의 코드의 실행결과를 적으시오.

import java.util.*;

public class Ex11_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);                      // list = [3, 6, 2, 2, 2, 7]

        HashSet set = new HashSet(list);  // set = [2, 3, 6, 7]
        System.out.println(set.toString());
        TreeSet tset = new TreeSet(set);  // tset = [2, 3, 6, 7]
        Stack stack = new Stack();
        stack.addAll(tset);               // stack = [2, 3, 6, 7]

        while(!stack.empty())
            System.out.println(stack.pop());
    }
}

// [실행결과]
// 7
// 6
// 3
// 2
// [질문 1] 왜 HashSet이 정렬되는가? LinkedHashSet을 사용한 것도 아닌데 말이다.
// [답변  ] 데이터의 타입이 Integer여서 그런 것이다. 운이 좋았던 것일 뿐이다. 만약, Product객체가 담겼다고 했을 때 전혀 순서 보장이 되지 않을 것이다.