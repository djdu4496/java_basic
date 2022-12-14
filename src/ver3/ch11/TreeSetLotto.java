package ver3.ch11;

import java.util.*;

class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();  // 범위 검색, 정렬. 정렬 필요 없음
//      Set set = new HashSet();    // 정렬 필요

//        for (int i = 0; set.size() < 6; i++) {
//            int num = (int)(Math.random() * 45) + 1;
////            set.add(num);  // set.add(new Integer(num)));
//        }
            set.add(new Test());
            set.add(new Test());
            set.add(new Test());
            set.add(new Test());

        System.out.println(set);

    }
}

class Test implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 1;
    }
}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}

// [실행결과 1]
//

// [실행결과 2] - Test 객체 저장 후 실행 set.add(new Test());
// Exception in thread "main" java.lang.ClassCastException: class ver3.ch11.Test cannot be cast to class java.lang.Comparable
// 에러 원인 : 비교 기준이 없기 때문

// [실행결과 3] - TestComp 선언 - 비교 기준 생성
// Exception in thread "main" java.lang.ClassCastException: class ver3.ch11.Test cannot be cast to class java.lang.Comparable
// 에러 원인 : 비교 기준이 없기 때문

// [실행결과 4] - Test(Comparator comp) 생성자 호출 - 비교기준 제공
// Exception in thread "main" java.lang.ClassCastException: class ver3.ch11.Test cannot be cast to class java.lang.Comparable
// 에러 원인 : 비교 기준이 없기 때문
// []


// [실행결과 5] - set.add(new Test()); 호출
// Exception in thread "main" java.lang.ClassCastException: class ver3.ch11.Test cannot be cast to class java.lang.Comparable
// 에러 원인 : 비교 기준이 없기 때문
// []

// [실행결과 6] - set.add(new Test()); 동일한 코드 여러 줄 호출
// [ver3.ch11.Test@2752f6e2]
// 하나만 찍히는 이유 : 같은 객체로 인식하기 때문

// [실행결과 7] - return 1
// [ver3.ch11.Test@2752f6e2, ver3.ch11.Test@e580929, ver3.ch11.Test@1cd072a9, ver3.ch11.Test@7c75222b]
// 기본정렬기준 제공하기 때문에 각각 다른 객체로 인식

// [실행결과 8] - class Test implements Comparable  { ... return 1 }
// [ver3.ch11.Test@7c75222b, ver3.ch11.Test@4c203ea1, ver3.ch11.Test@27f674d, ver3.ch11.Test@1d251891]
// Test클래스가 Comparable을 구현한다면, 기본정렬기준을 제공받기 때문에 정렬 가능
// 둘 중 하나가 되어야 한다.
// (1) 객체가 비교기준을 갖고 있는 경우
// (2) TreeSet이 비교기준을 갖고 있는 경우


