package ver3.practice.ch12.ex12_1;

// [12-1] 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은? 경고가 발생하는 문장은?

class Box<T> {  // 지네릭 타입 T를 선택
    T item;

    void setItem(T item) { this.item = item; }
    T getItem() { return item; }
}

class Ex12_1 {
    public static void main(String[] args) {
        System.out.println("답안 : 오류 = (a, b, c) 경고 = 없음");
//        a. Box<Object> b = new Box<String>();             // 컴파일 에러: 참조변수 선언시 대입된 타입과 생성자 호출 시 대입된 타입이 불일치한다. java: incompatible types: ver3.practice.ch12.ex12_1.Box<java.lang.String> cannot be converted to ver3.practice.ch12.ex12_1.Box<java.lang.Object>
//        b. Box<Object> b2 = (Object)new Box<String>();    // 컴파일 에러: 참조변수 선언시 대입된 타입과 생성자 호출 시 대입된 타입이 불일치한다. java: incompatible types: java.lang.Object cannot be converted to ver3.practice.ch12.ex12_1.Box<java.lang.Object>
//        c. new Box<String>().setItem(new Object());       // 컴파일 에러: String 이외의 타입은 지정불가                              java: incompatible types: java.lang.Object cannot be converted to java.lang.String
//        d. new Box<String>().setItem("ABC");              // OK. String타입이므로 가능
    }
}
