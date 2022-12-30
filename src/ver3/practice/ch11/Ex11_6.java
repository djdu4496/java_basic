package ver3.practice.ch11;

// 다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다.
// TreeSet이 학생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)와 평균점수의 범위를 주면
// 해당 범위에 속한 학생의 수를 반환하는 getGroupCount()를 완성하라.
// [Hint] TreeSet의 subSet(Object from, Object to)를 사용하라.

import com.sun.source.tree.Tree;

import java.util.*;

class Student2 implements Comparable {
    String name;
    int ban;
    int no;
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
    public int compareTo(Object o) {
        if(o instanceof Student2) {
            Student2 tmp = (Student2)o;
            return name.compareTo(tmp.name);
        } else {
            return -1;
        }
    }
} // class Student2

class Ex11_6 {
    static int getGroupCount(TreeSet tset, int from, int to) {
        /*
            (1) 알맞은 코드를 넣어 완성하시오.
        */
        // 0이 나오는데
        // 주어진 TreeSet에서 평균데이터만 남겨서 비교해보면 어떨까
        // 평균이 from보다 큰 요소 교집합(x) 평균이 to보다 작은 요소
        // 카운터 사용 해볼까
        //
//        System.out.println(tset);
//        return tset.subSet(from, to).size();

//
//        SortedSet tree = tset.subSet(from, to);
//
//        // 1. 객체 배열이니까 객체에서 평균 뽑는다. 그걸 뽑아서 새로운 treeset 만들어서 add \
//        // 객체 배열에서 학생 객체 하나 뽑기
//        //[60, 70] [{name: "홍길동", ban: },{}]
////        System.out.println("test"+ tset.);
//        ArrayList arr = new ArrayList();
//        // set에 들어 있는 객체에서 평균만 뽑아보자.
//        Iterator it = tset.iterator();
//        while(it.hasNext()) {
//            float average = ((Student2) it.next()).getAverage();
//            arr.add(average);
//        }

//        SortedSet ts = new TreeSet();    // 모든 학생의 평균 값을 저장할 TreeSet 생성
//        Iterator it2 = tset.iterator();  // 값을 불러오기 위해 iterator() 처리
//        while(it2.hasNext()) {           // 다음 값이 존재하는 경우,
//            float average = ((Student2) it2.next()).getAverage();  // 평균 추출
//            ts.add(Math.round(average));                           // TreeSet에 저장(int형으로 형변환 위해 Math.round()처리)
//        }

//        System.out.println(":: "+ts.subSet(from, to).size());
//        return ts.subSet(from, to).size();

////        System.out.println(arr.toString());
        // 배열까지 만들었는데(심지어 오름차순 정렬됨)
//        for (int i = 0; i < arr.size(); i++) {
//            if(((Student2)arr.get(i)).getAverage() >= from
//            && ((Student2)arr.get(i)).getAverage() < to) {
//                // count를 해야 하나? 근데 subSet()을 쓸 곳이 없다...ㅠ
//            }
//        }
        // 풀이 1
        //     -( 60점인 학생, 70점인 학생)을 만들어서 부분집합을 만든다.
        //     60점 학생, 70점 학생을 임의로? 더미 데이터를? 만든다.
        // ->  평균 from점 학생, to점 학생을 임의로 만들어서 부분집합의 범위를 만든다.
        // ->  subSet(from점 학생, to점 학생)으로 비교한다.  - 평균이 60점, 70점으로 만들어야 하기 때문에 국.영.수 모두 그 점수로 통일한다.
        // ->  tset.subSet(new Student2("바이든",1 , 1, 60, 60, 60 ), new Student2("트럼프", 1, 1, 70, 70, 70));
        // ->  tset.subSet(new Student2("바이든",1 , 1, from, from, from), new Student2("트럼프", 1, 1, to, to, to));
//        return tset.subSet(new Student2("바이든",1 , 1, from, from, from), new Student2("트럼프", 1, 1, to, to, to)).size();

        // 풀이 2
        TreeSet ts = new TreeSet();                               // 모든 학생의 평균 값을 저장할 TreeSet 생성
        Iterator it = tset.iterator();                            // 값을 불러오기 위해 iterator() 처리
        while(it.hasNext()) {                                     // 다음 값이 존재하는 경우,
            float average = ((Student2) it.next()).getAverage();  // 평균 추출
            ts.add(Math.round(average));                           // TreeSet에 저장(int형으로 형변환 위해 Math.round()처리)
        }
//        System.out.println(ts.toString());
//        System.out.println(":: "+ts.subSet(from, to).size()); 값 나오는지 찍어봄 - 조교님 구분자 팁도 참고합시다
        return ts.subSet(from, to).size();

    }
    public static void main(String[] args) {

        TreeSet set = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                /*
                    (2) 알맞은 코드를 넣어 완성하시오.
                */
                if(o1 instanceof Student2 && o2 instanceof Student2) {                  // 1. 유효성 검사 - 두 객체의 Student로 형변환 가능 여부 확인
                    float score1 = ((Student2)o1).getAverage();                         // 2. 형 변환
                    float score2 =((Student2)o2).getAverage();                          // 3. getAverage() 호출
                    return score1 < score2 ? -1 : (score1 == score2 ? 0 : 1) ;          // 오른쪽 객체가 더 크면 -1 반환, 같으면 1 반환, 왼쪽 객체가 크면 1 반환
                }
                return -1;
            }
        });
        set.add(new Student2("홍길동",1,1,100,100,100));
        set.add(new Student2("남궁성",1,2,90,70,80));
        set.add(new Student2("김자바",1,3,80,80,90));
        set.add(new Student2("이자바",1,4,70,90,70));
        set.add(new Student2("안자바",1,5,60,100,80));
        Iterator it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println("[60~69] :"+getGroupCount(set,60,70));
        System.out.println("[70~79] :"+getGroupCount(set,70,80));
        System.out.println("[80~89] :"+getGroupCount(set,80,90));
        System.out.println("[90~100] :"+getGroupCount(set,90,101));


    }
}

// [실행결과]
// 이자바,1,4,70,90,70,230,76.7
// 남궁성,1,2,90,70,80,240,80.0
// 김자바,1,3,80,80,90,250,83.3
// 홍길동,1,1,100,100,100,300,100.0
// [60~69] :0
// [70~79] :1
// [80~89] :2
// [90~100] :1