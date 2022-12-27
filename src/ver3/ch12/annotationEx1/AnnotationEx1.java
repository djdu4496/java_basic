package ver3.ch12.annotationEx1;

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override               // Method does not override method from its superclass
//  void parentmethod() { } // 조상 메서드의 이름을 잘못 적었음
    void parentMethod() { } // 조상 메서드의 이름을 잘못 적었음
}
