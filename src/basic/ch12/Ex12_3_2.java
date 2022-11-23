package basic.ch12;

// class Fruit implements Eatable {
//     public String toString() { return "Fruit";}
// }
// class Apple extends Fruit { public String toString() { return "Apple";}}
// class Grape extends Fruit { public String toString() { return "Grape";}}
// class Toy                 { public String toString() { return "Toy"  ;}}
//
// interface Eatable {}

class Ex12_3_2 {
    public static void main(String[] args) {
        Box b = (Box)new Box<String>();
        b.add(new Integer(100));
        Box<String> bStr = null;

        b = (Box)bStr;         // Box<String> -> Box 가능 but 경고
        bStr = (Box<String>)b; // Box -> Box<String> 가능 but 경고
    }  // main
}

// class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
//
// class Box<T> {
//     ArrayList<T> list = new ArrayList<T>();   // item을 저장할 list
//     void add(T item) { list.add(item);     }  // 박스에 item을 추가
//     T get(int i)     { return list.get(i); }  // 박스에서 item을 꺼낼 때
//     int size()       { return list.size(); }
//     public String toString() { return list.toString();}
// }
