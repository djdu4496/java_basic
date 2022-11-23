package basic.ch12;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
//      ArrayList list = new ArrayList();                  // JDK1.5 이전. 지네릭스가 도입되기 이전.
        ArrayList<Object> list = new ArrayList<Object>();  // JDK1.5이후
        list.add(10);    // list.add(new Integer(10)); - 오토박싱
        list.add(20);
        list.add(30);    // '지네릭스' 덕분에 '타입 체크'가 강화됨

//      Integer i = (Integer)list.get(2); // 컴파일 OK
        String i = (String)list.get(2); // 형변환 생략 가능

        System.out.println(list);
    }
}
