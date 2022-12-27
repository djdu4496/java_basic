package ver3.practice.ch12;

// 지네릭 메서드 makeJuice()가 아래와 같이 정의되어 있을 때, 이 메서드를 올바르게 호출한 문장을 모두 고르시오.
// (Apple과 Grape는 Fruit의 자손이라고 가정하자.)

// class Fruit {}
// class Grape extends Fruit {}
// class Apple extends Fruit {}
// class Jucier {
//     static <T extends Fruit> String makeJuice(FruitBox<T> box) {  // Fruit 또는 그 자손만 대입 가능
//         String tmp = "";
//         for(Fruit f : box.getList()) tmp += f + " ";
//         return tmp;
//     }
// }
public class Ex12_2 {
    public static void main(String[] args) {
        System.out.println("답안 : c, d");
        // a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());  // X. 에러! Apple은 Fruit의 자손이므로 대입 가능. But 대입된 타입이 불일치하기 때문에 에러
        // b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());  // X. 에러! Fruit은 대입된 타입 본인이므로 대입 가능. But 대입된 타입이 불일치하기 때문에 에러
        // c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());  // O. OK. Fruit은 대입된 타입 본인이므로 대입 가능. 대입된 타입이 일치
        // d. Juicer.makeJuice(new FruitBox<Apple>());         // O. OK.대입된 타입 생략 가능. 컴파일러가 FruitBox의 선언부를 통해 대입된 타입 추정 가능
        // e. Juicer.makeJuice(new FruitBox<Object>());        // X. 에러! Object는 Fruit의 자손이 아니라 조상이므로 에러
    }
}
