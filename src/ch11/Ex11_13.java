package ch11;

import java.util.*;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();  // 범위 검색, 정렬, 정렬 필요없음
     // Set set = new HashSet();  // 정렬 필요(Ex11_10과 비교)

        // for (int i = 0; set.size() < 6 ; i++) {
        //     int num = (int)(Math.random()*45) + 1;
            set.add(new Test());  // set.add(new Integer(num));
            set.add(new Test());  // set.add(new Integer(num));
            set.add(new Test());  // set.add(new Integer(num));
            set.add(new Test());  // set.add(new Integer(num));
        // }
        System.out.println(set);
    }
}

class Test implements Comparable{
    @Override
    public int compareTo(Object o) {
        return -1;
    }
}  // 비교 기준이 없음.

class TestComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}