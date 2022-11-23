package basic.ch11;

import java.util.*;

public class Ex11_5 {
    public static void main(String[] args) {
        Collection c = new TreeSet();  // Set도 Collection의 자손
//      Collection c = new HashSet();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // Iterator는 1회용이기 때문에, 다 쓰고 나면 다시 얻어와야 한다.
        it = c.iterator();  // 새로운 Iterator객체를 얻는다.

        while(it.hasNext()) {  // 1. 확인
            Object obj = it.next();  // 2. 읽기
            System.out.println(obj);
        }
        // for(int i=0; i<c.size();i++) {
        //     Object obj = c.get(i);  // HashSet에는 get() 없음
        //     System.out.println(obj);
        // }
    } // main
}
