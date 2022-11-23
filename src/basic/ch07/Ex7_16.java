package basic.ch07;

class Outer3 {
    int value=10;	// Outer.this.value

    class Inner {
        int value=20;	// this.value

        void method1() {
            int value=30;
            System.out.println("           value :" + value);
            System.out.println("      this.value :" + this.value);
            System.out.println("Outer3.this.value :" + Outer3.this.value);
        }
    } // Inner클래스의 끝
} // Outer3클래스의 끝

class Ex7_16 {
    public static void main(String args[]) {
//        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner();
//        inner.method1();
    }
} // Ex7_16 끝