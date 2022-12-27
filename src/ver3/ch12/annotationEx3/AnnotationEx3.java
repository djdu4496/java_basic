package ver3.ch12.annotationEx3;

import java.util.ArrayList;

class NewClass {
    int newField;

    int getNewField() { return newField; }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() { return oldField; }
}

public class AnnotationEx3 {
    @SuppressWarnings("deprecation")            // deprecation관련 경고를 억제
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;                       // @Deprecated가 붙은 대상을 사용
        System.out.println(nc.getOldField());   // @Deprecated가 붙은 대상을 사용

        @SuppressWarnings("unchecked")          // 지네릭스 관련 경고를 억제
        ArrayList<NewClass> list = new ArrayList(); // 타입을 지정하지 않음.
        list.add(nc);
    }
}

// [실행결과]
// ~/java_basic/java_basic/src/ver3/ch12/AnnotationEx3  javac AnnotationEx3.java
//
// ~  java ver3.ch12.annotationEx3.AnnotationEx3
// 10