package ch12;

import java.util.*;

class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator();
     // Iterator it = list.iterator();
        while (it.hasNext()) {
//          Student s = it.next();
//          Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
//          System.out.println(s.name);
            System.out.println(it.next().name);  // 옛날엔 위 두 줄처럼 써야 했는데, 이제 한 줄로 간단히 쓸 수 있다.
//          System.out.println(((Student)it.next()).name);  // (참고) 형변환 해야 했던 옛날 방식
        }
    } // main
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}