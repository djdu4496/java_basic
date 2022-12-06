package ver3.ch9;

public class EqualsEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1;

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }  // main
}

class Value {
    int value;

    Value() {}  // 클래스 작성 시 반드시 기본 생성자를 작성해주자.

    Value(int value) {
        this.value = value;
    }
}
