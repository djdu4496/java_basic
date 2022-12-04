package ver3.ch7;

class Product2 {
    int price;  // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);  // 보너스점수는 제품가격의 10%
    }

    Product2() {}  // 기본 생성자
}

class Tv2 extends Product2 {
    Tv2() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100);  // Tv의 가격을 100만원으로 한다.
    }

    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() {
        return "Tv2";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(200);  // Computer의 가격을 200만원으로 한다.
    }

    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() {
        return "Computer2";
    }
}

class Audio extends Product2 {
    Audio() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(50);  // Computer의 가격을 200만원으로 한다.
    }

    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() {
        return "Audio";
    }
}

class Buyer2 {  // 고객, 물건을 사는 사람
    int money = 1000;    // 소유금액
    int bonusPoint = 0;  //보너스 점수
    Product2[] item = new Product2[10];  // 구입한 제품을 저장하기 위한 배열
    int i = 0;           // Product2배열에 사용될 카운터

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;  // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
        item[i++] = p;     // 제품을 Product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;             // 구매한 물품에 대한 정보를 요약해서 보여준다.
        String itemList = "";    // 구입한 물품의 가격합계

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.length; i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());  // 참조변수를 사용하지 않았기 때문에 main메서드에서 Tv인스턴스를 사용할 수 없다.
        b.buy(new Computer2());  // 참조변수를 사용하지 않았기 때문에 main메서드에서 Computer인스턴스를 사용할 수 없다.
        b.buy(new Audio());
        b.summary();
    }
}
