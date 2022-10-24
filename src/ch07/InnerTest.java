package ch07;

class AA {      // AA는 BB의 외부 클래스
    int i = 100;
    BB b = new BB();
    class BB {  // BB는 AA의 내부 클래스
        void method() {
//            ch07.AA a = new ch07.AA();
//            System.out.println(a.i);
            System.out.println(i);  // 객체 생성없이 외부 클래스의 멤버 접근 가능
        }
    }
}

//class CC {
//    BB b = new BB();
//}

public class InnerTest {
    public static void main(String[] args) {
//        BB b = new BB();
//        b.method();
    }
}
