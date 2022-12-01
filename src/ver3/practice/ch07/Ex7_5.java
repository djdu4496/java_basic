package ver3.practice.ch07;

// 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꿔야 하는가?

class Product {
    int price;       // 제품의 가격
    int bonusPoint;  // 제품구매 시 제공하는 보너스 점수

    Product() {}
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}  // Product클래스는 기본 생성자 정의 x

class Tv extends Product {
    Tv() {}  // Tv의 기본 생성자

    public String toString() {
        return "Tv";
    }
}

public class Ex7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println("규칙 : 생성자의 첫 줄에 반드시 다른 생성자를 호출해야 한다. 그렇지 않으면 컴파일러가 super()를 호출한다.");
        System.out.println("Tv의 기본생성자의 첫 줄에 생성자를 호출하고 있지 않기 때문에 컴파일러가 위 규칙을 지키기 위해 super(); 코드를 추가한다.");
        System.out.println("그런데, 조상인 Product클래스의 기본 생성자가 없기 때문에 에러가 발생했다.");
        System.out.println("Product클래스의 기본 생성자가 없는 이유는 기본 생성자가 아닌 생성자가 이미 있기 때문에 컴파일러가 기본 생성자를 추가하지 않았기 때문이다.");
        System.out.println("따라서, Product클래스에 기본 생성자를 작성해주면 컴파일 에러를 수정할 수 있다.");
        System.out.println("이러한 에러를 방지하기 위해 기본 생성자를 반드시 작성해야 한다.");
    }
}
