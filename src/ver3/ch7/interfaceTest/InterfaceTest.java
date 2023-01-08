package ver3.ch7.interfaceTest;

class A {
    public void methodA(ver3.ch7.interfaceTest2.B b) {
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterfaceTest {
    public static void main(String args[]) {
        ver3.ch7.interfaceTest2.A a = new ver3.ch7.interfaceTest2.A();
        a.methodA(new ver3.ch7.interfaceTest2.B());
    }
}

// [실행결과]
// methodB()
