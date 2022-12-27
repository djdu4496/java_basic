package ver3.ch12.fruitBoxEx1;

import java.util.ArrayList;

class Fruit                 { public String toString() { return "Fruit";}}
class Apple extends Fruit   { public String toString() { return "Apple";}}
class Grape extends Fruit   { public String toString() { return "Grape";}}
class Toy                   { public String toString() { return "Toy";}}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
//      Box<Grape> grapeBox = new Box<Apple>();  // 에러. 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());  // OK. void add(Fruit item)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//      appleBox.add(new Grape());  // 에러. Box<Apple>에는 Apple만 담을 수 있음 - java: incompatible types: ver3.ch12.FruitBoxEx1.Grape cannot be converted to ver3.ch12.FruitBoxEx1.Apple
//      appleBox.add(new Toy());    // 에러. Box<Apple>에는 Apple만 담을 수 있음 - java: incompatible types: ver3.ch12.FruitBoxEx1.Toy cannot be converted to ver3.ch12.FruitBoxEx1.Apple

        toyBox.add(new Toy());
        toyBox.add(new Toy());
//      toyBox.add(new Fruit());    // 에러. Box<Toy>에는 Fruit을 담을 수 없음 - java: incompatible types: ver3.ch12.FruitBoxEx1.Fruit cannot be converted to ver3.ch12.FruitBoxEx1.Toy
//      toyBox.add(new Apple());    // 에러. Box<Toy>에는 Apple을 담을 수 없음 - java: incompatible types: ver3.ch12.FruitBoxEx1.Apple cannot be converted to ver3.ch12.FruitBoxEx1.Toy

        System.out.println(fruitBox);
        System.out.println(appleBox);  //
        System.out.println(toyBox);

    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);}
    T get(int i)     { return list.get(i);}
    int size()       { return list.size();}
    public String toString() {return list.toString();}
}

// [실행결과] - 1.3 지네릭 클래스의 객체 생성과 사용
// [Fruit, Apple]
// [Apple, Apple]
// [Toy, Toy]