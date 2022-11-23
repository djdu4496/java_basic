package basic.ch07;

class Outer {
    private int outerIv = 0;
    private static int outerCv = 0;

    class InstanceInner {
        int iiv  = outerIv;  // 1. 외부 클래스의 private멤버도 접근가능하다. **
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        final int lv = 0;        // lv가 변수지만, 값을 변경하는 코드가 없으므로 실상수로 간주된다
        final int LV = 0;        // JDK1.8부터 final 생략 가능
//        lv = 3;                // (참고) 상수는 constant pool에서 따로 관리

        class LocalInner {       // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용 가능. **
            int liv = outerIv;
            int liv2 = outerCv;
//       	외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv;	// 에러!!!(JDK1.8부터 에러 아님)  ref. Variable 'lv' is accessed from within inner class, needs to be final or effectively final
            int liv4 = LV;	// OK

            void method() {
                System.out.println(lv);
            }
        }
    }
}