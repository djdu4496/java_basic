package ver3.practice.ch11.ex11_7;

// 다음에 제시된 BanNoAscending클래스를 완성하여 ArrayList에 담긴 Student인스턴스들이,
// 반(ban)과 번호(no)로 오름차순 정렬되게 하시오.(반이 같은 경우 번호를 비교해서 정렬한다.)

import java.util.*;

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
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
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                ;
    }
} // class Student

class BanNoAscending implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        /*
        (1) . 알맞은 코드를 넣어 완성하시오
        */
        // first try
        // 1. 형변환 검사
        // 2. 형변환
        // 3. 비교기준 반환
//        if(o1 instanceof Student && o2 instanceof Student) {
//            int ban1 = ((Student)o1).ban;
//            int ban2 = ((Student)o2).ban;
//            int no1 =  ((Student)o1).no;
//            int no2 =  ((Student)o2).no;
//            return ban1 < ban2 ? -1 : (ban1 == ban2 ? (no1 < no2 ? -1 : (no1 == no2 ? 0 : 1)) : 1);
//        }
//        return -1;

        // second try
        int ban1 = o1.ban;
        int ban2 = o2.ban;

        int no1 = o1.no;
        int no2 = o2.no;

        if(ban1 < ban2)
            return -1;
        else
            return ban1 == ban2 ? (no1 < no2 ? -1 : (no1 == no2 ? 0 : 1)) : 1;

    }
}
public class Ex11_7 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이자바",2,1,70,90,70));
        list.add(new Student("안자바",2,2,60,100,80));
        list.add(new Student("홍길동",1,3,100,100,100));
        list.add(new Student("남궁성",1,1,90,70,80));
        list.add(new Student("김자바",1,2,80,80,90));
        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

// [실행결과]
// 남궁성,1,1,90,70,80,240,80.0
// 김자바,1,2,80,80,90,250,83.3
// 홍길동,1,3,100,100,100,300,100.0
// 이자바,2,1,70,90,70,230,76.7
// 안자바,2,2,60,100,80,240,80.0
// [삽질기록]
// 클래스명을 Student$ 숫자로 변경하는 과정에서 누락이 있어서 출력이 정상적으로 되지 않았다.
// [피드백]
// 지네릭스를 적용하면, 형변환 검사 및 형변환도 생략할 수 있다.