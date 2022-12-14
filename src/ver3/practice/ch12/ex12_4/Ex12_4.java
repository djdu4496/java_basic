package ver3.practice.ch12.ex12_4;
// [12-4] 아래의 메서드는 두 개의 ArrayList를 매개변수로 받아서, 하나의 새로운 ArrayList로 병합하는 메서드이다. 이를 지네릭 메서드로 변경하시오.

import java.util.ArrayList;

class Product {}

public class Ex12_4 {
    // 일반 메서드 - 와일드카드 사용
//    public static  ArrayList<? extends Product> merge (
//            ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
//        ArrayList<? extends Product> newList = new ArrayList<>(list);
//
//        newList.addAll(list2);
//
//        return newList;
//    }

    // 지네릭 메서드
    public static <T extends Product> ArrayList<T> merge (
        ArrayList<T> list, ArrayList<T> list2) {
            ArrayList<T> newList = new ArrayList<>(list);

            newList.addAll(list2);

            return newList;
    }

    public static void main(String[] args) {

    }
}
