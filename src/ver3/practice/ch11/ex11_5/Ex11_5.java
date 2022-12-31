package ver3.practice.ch11.ex11_5;

// 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서 이름(name)이 기본 정렬기준이 되도록 하시오.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// 1. Student클래스가 Comparable인터페이스를 구현하도록 변경
    // 1. Students클래스 선언부 변경(Comparable 구현)
// 2. 추상메서드 compareTo(Object) 구현
    // 1. '이름 순'이라는 정렬기준을 세워야 한다.
class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name +","+ban +","+no +","+kor +","+eng +","+math
                +","+getTotal() +","+getAverage();
    }

    public int compareTo(Object o) {
        if(o instanceof Student) {                      // 1. 형 변환 가능 여부 검사
            String name = ((Student)o).name;            // 2. 형 변환
            return this.name.compareTo(name);           // 3. 이름 순으로 정렬기준 반환
        }
        return -1;
    }
}


public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,2,90,70,80));
        list.add(new Student("김자바",1,3,80,80,90));
        list.add(new Student("이자바",1,4,70,90,70));
        list.add(new Student("안자바",1,5,60,100,80));
        Collections.sort(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

// [실행결과]
// 김자바,1,3,80,80,90,250,83.3
// 남궁성,1,2,90,70,80,240,80.0
// 안자바,1,5,60,100,80,240,80.0
// 이자바,1,4,70,90,70,230,76.7
// 홍길동,1,1,100,100,100,300,100.0