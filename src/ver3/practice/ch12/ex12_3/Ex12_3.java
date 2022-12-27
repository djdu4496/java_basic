package ver3.practice.ch12.ex12_3;
// 다음 중 올바르지 않은 문장을 모두 고르시오.

class Fruit {}

class Box<T extends Fruit> { // 지네릭 타입 T를 선언 T item;
    T item;

    void setItem(T item) { this.item = item; }
    T getItem() { return item; }
}

public class Ex12_3 {
    public static void main(String[] args) {
        System.out.println("답안 : d ");
        // * Box : 제한된 지네릭 클래스 (Fruit 또는 그 자손만 대입 가능) */
        // * 여기서는 지네릭 클래스 Box에 정의된 타입이 <T extends Fruit>와 같이 제한되어 있기 때문에, 'Object'가 아니라‘Fruit'이 생략된 것으로 봐야 한다
        // * 와일드카드는 new연산자 뒤에 오면 안 된다. 타입이 명확해야 하기 때문.
        // * Box<? extends Object>는 Box<Object>와 같지 않음
        // a. Box<?>                 b = new Box();                  // O.
        //  → Box<? extends Object>  b = new Box();                      // Box<?>는 Box<? extends Object>를 생략한 것
        //  → Box<? extends Object>  b = new Box<>();                    // 더 바람직한 코드
        // b. Box<?>                 b = new Box<>();                // O.
        //  → Box<?>                 b = new Box<Fruit>();               // 생성자의 타입을 생략한 경우, 참조변수의 타입과 같은 타입으로 간주
        // c. Box<?>                 b = new Box<Object>();          // X. Type parameter 'java.lang.Object' is not within its bound; should extend 'ver3.practice.ch12.ex12_3.Fruit'
        //  → Box<? extends Object>  b = new Box<Object>();              //
        // d. Box<Object>            b = new Box<Fruit>();           // X. 참조변수 선언 시 대입된 타입과 생성자 호출 시 대입된 타입이 불일치
        // e. Box                    b = new Box<Fruit>();           // O. 타입 생략 가능 JDK1.5 ~
        //  → Box<?>                 b = new Box<>();                    // 더 바람직한 코드
        // f. Box<? extends Fruit>   b = new Box<Apple>();           // O. 생성자 호출 시 대입된 타입 <Apple>은 Fruit 또는 그 자손이다.
        // g. Box<? extends Object>  b = new Box<? extends Fruit>(); // X. Wildcard type '? extends ver3.practice.ch12.ex12_3.Fruit' cannot be instantiated directly
    }
}