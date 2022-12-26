package ver3.ch12.FruitBoxEx3;

import java.util.ArrayList;

class Fruit                 { public String toString() { return "Fruit";}}
class Apple extends Fruit   { public String toString() { return "Apple";}}
class Grape extends Fruit   { public String toString() { return "Grape";}}

class Juice {
    String name;

    Juice(String name)       { this.name = name + "Juice"; }
    public String toString() { return name;                }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";

        for(Fruit f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox<T extends Fruit> extends Box<T> {}        // FruitBox클래스 - Fruit타입과 그 자손만 타입으로 지정 가능

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();              // ArrayList 객체 생성 후 참조변수 list에 저장
    void add(T item)         { list.add(item); }         // list에 item객체 추가하는 메서드
    T get(int i)             { return list.get(i); }     // list ArrayList에서 특정 인덱스(i)의 객체 읽어오기 메서드
    ArrayList<T> getList()   { return list; }            // list ArrayList 읽어오기 메서드
    int size()               { return list.size(); }     // list ArrayList에 저장된 객체 갯수 반환 메서드
    public String toString() { return list.toString(); } // list 출력
}

// [실행결과] - 1.5 와일드카드
// Apple Grape Juice
// Apple Apple Juice