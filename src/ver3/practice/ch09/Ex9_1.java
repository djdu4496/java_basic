package ver3.practice.ch09;

// 다음과 같은 실행결과를 얻도록 SutdaCard클래스의 equals()를 멤버변수인 num, isKwang의 값을 비교하도록 오버라이딩하고 테스트하시오.

public class Ex9_1 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(4, false);

        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1.equals(c2):" + c1.equals(c2));
        System.out.println("c2.equals(c3):" + c2.equals(c3));
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        // (1) 매개변수로 넘겨진 객체의 num, isKwang과
        // 멤버변수 num, isKwang을 비교하도록 오버라이딩하시오.

//        // 1st try
//        // 1. 유효성 검사
//            // 1-1. obj가 null인 경우
//            // 1-2. obj가 SutdaCard타입이거나 그 자손이 아닐 경우 false 반환
//        if(obj == null || !(obj instanceof SutdaCard)) return false;
//        // 2. 멤버변수 num과 매개변수로 넘겨진 객체의 num이 같지 않은 경우 false 반환
//        if(this.num != ((SutdaCard)obj).num) return false;
//        // 3. 멤버변수 isKwang과 매개변수로 넘겨진 객체의 isKwang이 같지 않은 경우 false 반환
//        if(this.isKwang != ((SutdaCard) obj).isKwang) return false;
//
//        // 4. 위 모든 경우에 해당하지 않는 경우 true 반환
//        return true;

        // 2nd try
        // 1. 매개변수로 넘겨진 객체 obj가 Object타입이므로 num, isKwang값을 참조하기 위해서는 SutdaCard타입으로 형변환이 필요햐다.
        if(obj instanceof SutdaCard)
            return num == ((SutdaCard)obj).num && isKwang == ((SutdaCard)obj).isKwang;
        return false;
    }

    public String toString() {
        return num + ( isKwang ? "K" : "");
    }
}

// [실행결과]
// c1=3K
// c2=3K
// c1.equals(c2):true