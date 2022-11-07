package ch12;

import java.util.ArrayList;

public class GenericTest2 {
    public static void main(String[] args) {
//      ArrayList list = new ArrayList();
        ArrayList<Tv> list = new ArrayList();  // Tv타입의 객체만 저장가능
        list.add(new Tv());
//      list.add(new Audio());

//      Tv t= (Tv)list.get(0);  // list의 첫 번째 요소를 꺼낸다. - 타입 불일치(형 변환 필요)
        Tv t = list.get(0);     // list의 첫 번째 요소를 꺼낸다. - 타입 일치(형 변환 불필요)

    }
}
