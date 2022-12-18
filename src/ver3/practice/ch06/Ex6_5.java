package ver3.practice.ch06;

// 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.

public class Ex6_5 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Student2 {
    // (1) 알맞은 코드를 넣어 완성하시오.
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    Student2() {} // 기본 생성자

    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5) / 10f;
    }

    String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }
}
