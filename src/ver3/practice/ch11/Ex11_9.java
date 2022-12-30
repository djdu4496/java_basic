package ver3.practice.ch11;

// 문제 11-8의 Student클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수를 추가하였다.
// 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오.
// (1)~(2)에 알맞은 코드를 넣어 완성하시오.

import java.util.*;

class Student5 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank; // 전교등수
    int classRank; // 반등수
    Student5(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public int compareTo(Object o) {
        if(o instanceof Student5) {
            Student5 tmp = (Student5)o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
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
                +","+schoolRank
                +","+classRank // 새로추가
                ;
    }
} // class Student5
class ClassTotalComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        /*
        (1) 알맞은 코드를 넣어 완성하시오.
        */
        // 1. 형변환 가능 여부 확인
        // 2. 형변환
        // 3. 기본정렬기준 반환
        if(o1 instanceof Student5 && o2 instanceof Student5) {
            // 반별 총점 기준
//            int ban1 = ((Student5)o1).ban;
//            int ban2 = ((Student5)o2).ban;
//            int cRank1 = ((Student5)o1).classRank;
//            int cRank2 = ((Student5)o2).classRank;
//            return ban1 < ban2 ? -1 : (ban1 == ban2 ? (cRank1 > cRank2 ? -1 : (cRank1 == cRank2 ? 0 : 1)) : 1);
            int ban1 = ((Student5)o1).ban;
            int ban2 = ((Student5)o2).ban;
            int total1 = ((Student5)o1).getTotal();
            int total2 = ((Student5)o2).getTotal();
            return ban1 < ban2 ? -1 : (total1 > total2 ? -1 : (total1 == total2 ? 0 : 1));

        }
        return -1;
    }
}
class Exercise11_9 {
    public static void calculateClassRank(List list) {
        // 먼저 반별 총점기준 내림차순으로 정렬한다.
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        /*
            (2) 아래의 로직에 맞게 코드를 작성하시오.
                1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.
                    1.1 반이 달라지면, (ban과 prevBan이 다르면)
                        이전 등수(prevRank)와 이전 총점(prevTotal)을 초기화한다.
                    1.2 총점(total)이 이전총점(prevTotal)과 같으면
                        이전 등수(prevRank)를 등수(classRank)로 한다.
                    1.3 총점이 서로 다르면,
                        등수(classRank)의 값을 알맞게 계산해서 저장한다.
                        이전에 동점자였다면, 그 다음 등수는 동점자의 수를 고려해야 한다.(실행결과 참고)
                    1.4 현재 반과 총점과 등수를 이전 반(prevBan),
                        이전 총점(prevTotal), 이전 등수(prevRank)에 저장한다.
        */

        for (int i = 0; i < length; i++) {
            Student5 s = (Student5)list.get(i);
            if(s.ban != prevBan) {                  // 1. 현 학생의 반과 이전 학생의 반이 다른 경우
                prevRank = -1;                          // 1-1. 이전 등수 초기화
                prevTotal = -1;                         // 1-2. 이전 총점 초기화
                s.classRank = 1;                        // 1-3. 현재 학생 등수 1등으로 초기화(내림차순)
            } else {                                // 2. 두 학생이 같은 반인 경우
                if(s.getTotal() == prevTotal)           // 2-1. 두 학생의 총점이 같다면
                    s.classRank = prevRank;                 // 현 학생의 등수에 이전 학생의 등수를 저장한다.
                else                                    // 2-2. 두 학생의 총점이 다를 경우
                    s.classRank = ++prevRank;               // 현 학생의 등수에 이전 학생의 등수 + 1을 저장한다.
            }

            prevBan = s.ban;
            prevTotal = s.getTotal();
            prevRank = s.classRank;
        }
        // i  -> i + 1
        // 0  ->   1
        // 1  ->   2
        // 2  ->   3
        // 0  ->   1
        // 1  ->   2
    } // public static void calculateClassRank(List list) {

    public static void calculateSchoolRank(List list) {
        /* 내용 생략 */
        Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();

        for (int i = 0; i < length; i++) {
            Student5 s = (Student5)list.get(i);     // 1.

            if (s.total == prevTotal)                // 1.1 총점(total)이 이전총점(prevTotal)과 같으면
                s.schoolRank = prevRank;                // 이전 등수(prevRank)를 등수(schoolRank)로 한다.
            else                                    // 1.2 총점이 서로 다르면,
                s.schoolRank = i + 1;                   // 등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
            // 이전에 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해야 한다.
            prevTotal = s.total;                    // 1.3 현재 총점과 등수를 이전총점(prevTotal)과 이전등수(prevRank)에 저장한다.
            prevRank = s.schoolRank;
        }
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student5("이자바",2,1,70,90,70));
        list.add(new Student5("안자바",2,2,60,100,80));
        list.add(new Student5("홍길동",1,3,100,100,100));
        list.add(new Student5("남궁성",1,1,90,70,80));
        list.add(new Student5("김자바",1,2,80,80,90));
        list.add(new Student5("박자스",2,2,85,50,90));
        list.add(new Student5("유재석",2,2,85,95,90));
        list.add(new Student5("박명수",2,2,100,100,100));
        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

// [실행결과]
// 홍길동,1,3,100,100,100,300,100.0,1,1
// 김자바,1,2,80,80,90,250,83.3,2,2
// 남궁성,1,1,90,70,80,240,80.0,3,3
// 안자바,2,2,60,100,80,240,80.0,3,1
// 이자바,2,1,70,90,70,230,76.7,5,2