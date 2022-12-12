package ver3.ch11;

import java.util.*;

public class IteratorEx1 {
    public static void main(String[] args) {  // set은 Collection의 자손
        Collection c = new TreeSet();
//      HashSet hs = new HashSet();
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

        // iterator는 1회용이라 다 쓰고 나면 다시 얻와야 한다.
        it = c.iterator();  // 새로운 iterator객체를 얻는다.
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
