package ch11;

import java.util.*;

class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();
        // set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
//          set.add(new Integer(num));
            set.add(num);
        }
       // System.out.println(set);
       List list = new LinkedList(set); // LinkedList(Collection c)
       Collections.sort(list);          // Collections.sort(List list)
       System.out.println(list);
    }
}
