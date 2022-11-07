package ch12;

import java.util.HashMap;

class Ex12_2_2 {
    public static void main(String[] args) {
//      HashMap map = new HashMap();
        HashMap<String, Student2> map = new HashMap<>();  // JDK1.7부터 생성자에 타입지정 생략가능
        map.put("자바왕", new Student2("자바왕", 1, 1, 100, 100, 100));

//      Student2 s = (Student)map.get("자바왕");
        Student2 s = map.get("자바왕");  // public Student get(Object key) {

        System.out.println(map);
        System.out.println(map.get("자바왕").name);
    } // main
}

class Student2 {
    String name = "";
    int ban;  // 반
    int no;   // 번호
    int kor;
    int eng;
    int math;

    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
