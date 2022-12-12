package ver3.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // autoboxing에 의해 기본형이 참조형으로 자동 변형
        // list1.add(5);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));
        // ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        // 풀어쓰면 아래의 두 줄과 같다.
        // List sub = list1.subList(1, 4);       // sub는 읽기만 가능 [4, 2, 0]
        // ArrayList list2 = new ArrayList(sub); // sub와 같은 내용의 ArrayList 생성
        print(list1, list2);
        // Collection은 인터페이스, Collections는 유틸 클래스
        Collections.sort(list1);  // list1과 list2를 정렬한다. (오름차순)
        Collections.sort(list2);  // Collections.sort(List 1)
        print(list1, list2);

        System.out.println("list1.containsAll(list2):"
         + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");  // 추가할 위치 지정
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1");
        print(list1, list2);
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        System.out.println("index=" + list1.indexOf("1"));
        System.out.println("index=" + list1.indexOf(new Integer(1)));

//        list1.remove(1);  // boolean remove(Object obj)를 호출? Object remove(int index)가 호출
        list1.remove(new Integer(1));  // 1을 삭제
//        list1.remove("1");  // 문자열 "1"을 삭제
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
//
//        // list2에서 list1에 포함된 객체를 삭제한다.
        for (int i = list2.size() - 1; i >= 0 ; i--) {
            if(list1.contains(list2.get(i)))  // 1. get(i)로 list2에서 하나씩 꺼낸다.
                list2.remove(i);              // 2. contains()로 꺼낸 객체가 list1에 있는지 확인
        }                                     // 3. remove(i)로 해당 객체를 list2에서 삭제
        print(list1, list2);
    }  // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }
}
