package ver3.ch12.FruitBoxEx4;

import java.util.*;

class Fruit {
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() { return name + "(" + weight + ")";}
}

class Apple extends Fruit {
    Apple(String name, int weight) {
        super(name, weight);
    }
}

class Grape extends Fruit {
    Grape(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple> {
    public int compare(Apple t1, Apple t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape> {
    public int compare(Grape t1, Grape t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit> {
    public int compare(Fruit t1, Fruit t2) {
        return t1.weight - t2.weight;
    }
}

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }  // main
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();              // ArrayList 객체 생성 후 참조변수 list에 저장
    void add(T item)         { list.add(item); }         // list에 item객체 추가하는 메서드
    T get(int i)             { return list.get(i); }     // list ArrayList에서 특정 인덱스(i)의 객체 읽어오기 메서드
    ArrayList<T> getList()   { return list; }            // list ArrayList 읽어오기 메서드
    int size()               { return list.size(); }     // list ArrayList에 저장된 객체 갯수 반환 메서드
    public String toString() { return list.toString(); } // list 출력
}

// 실행결과 - 1.5 와일드카드
// [GreenApple(300), GreenApple(200), GreenApple(100)]
// [GreenGrape(400), GreenGrape(300), GreenGrape(200)]
//
// [GreenApple(100), GreenApple(200), GreenApple(300)]
// [GreenGrape(200), GreenGrape(300), GreenGrape(400)]