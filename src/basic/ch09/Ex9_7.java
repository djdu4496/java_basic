package basic.ch09;

class Ex9_7 {
    public static void main(String args[]) {
        String s1 = "AAA"; // constant pool에
        String s2 = "AAA"; // new String("AAA");가 자동으로 생성
        String s3 = "AAA"; // s1, s2, s2가 String객체 공유
        String s4 = "BBB";
    }
}
