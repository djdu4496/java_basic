package ver3.ch12.annotationEx2;

class NewClass {
    int newField;

    int getNewField() { return newField; }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() { return oldField; }

}

public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;                        // 'oldField' is deprecated - @Deprecated가 붙은 대상을 사용
        System.out.println(nc.getOldField());    // 'oldField' is deprecated - @Deprecated가 붙은 대상을 사용
    }
}

// [실행결과]
// jiwoo@Jiwooui-MacBookPro  ~/java_basic/java_basic/src/ver3/ch12/AnnotationEx2   main ±✚  javac AnnotationEx2.java
// Note: AnnotationEx2.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// jiwoo@Jiwooui-MacBookPro  ~/java_basic/java_basic/src/ver3/ch12/AnnotationEx2   main ±✚  java AnnotationEx2.java
// Note: AnnotationEx2.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// error: class found on application class path: ver3.ch12.AnnotationEx2.NewClass
