package ver3.ch11;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45) + 1;
//          set.add(new Integer(num));
            set.add(num);
        }

//      System.out.println(set);          // set은 정렬 불가(정렬: 순서유지) → set을 List로 옮기고 List를 정렬
        List list = new LinkedList(set);  // LinkedList(Collection c)    - ① set의 모든 요소를 List에 저장
        Collections.sort(list);           // Collections.sort(List list) - ② list를 정렬
        System.out.println(list);         //                               ③ list를 출력
    }
}
