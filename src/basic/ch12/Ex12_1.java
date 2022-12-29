package basic.ch12;

import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv>      tvList = new ArrayList<Tv>();
//  	ArrayList<Product> tvList = new ArrayList<Tv>(); // 컴파일 에러. '대입된 타입'의 불일치
// 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. 지네릭 클래스간의 다형성은 성립

        productList.add(new Tv());    // public boolean add(Product e) {  ← Product 또는 그 자손 객체 OK.
        productList.add(new Audio());

        tvList.add(new Tv());         // public boolean add(Tv e) {       ← Tv 또는 그 자손 객체 OK.
        tvList.add(new Tv());
//      tvList.add(new Audio());      // 컴파일 에러. Audio와 Tv는 서로 아무런 관계도 아니기 때문

        printAll(productList);  // Ok.                               ← productList 대입된 타입 = ArrayList<Product>
//      printAll(tvList); // 컴파일 에러. new ArrayList<Tv>를 대입 불가 ← tvList 타입 = ArrayList<Tv>
    }

    public static void printAll(ArrayList<Product> list) {  // new ArrayList<Tv>(); 대입 불가.
        for (Product p : list)                              // 참조변수에 '대입된 타입'인 <Product>와 생성자에 '대입된 타입'이 불일치하기 때문
            System.out.println(p);
    }
}
