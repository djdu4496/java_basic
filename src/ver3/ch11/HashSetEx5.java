package ver3.ch11;

import java.util.*;

public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = " + setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);

        // 교집합
        Iterator it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))
//          if(setA.contains(it.next())) ← 위 두 줄과 같은 코드
                setKyo.add(tmp);
        }

        // 차집합
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp))  // setB에 없는 것만 차집합에 저장
//          if(!setB.contains(it.next())) ← 위 두 줄과 같은 코드
                setCha.add(tmp);
        }

        // 합집합
        it = setA.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        it = setB.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        System.out.println("A ∩ B = " + setKyo);  // 한글 ㄷ을 누르고 한자키 MAC은 안 돼용 ㅠ
        System.out.println("A ∪ B = " + setHab);  // 한글 ㄷ을 누르고 한자키 MAC은 안 돼용 ㅠ
        System.out.println("A - B = " + setCha);
        
//      setA.retainAll(setB);  // 교집합. 공통된 요소만 남기고 삭제
//      setA.addAll(setB);     // 합집합. setB의 모든 요소를 추가(중복 제외)
//      setA.removeAll(setB);  // 차집합. setB와 공통 요소를 제거

    }
}

// [실행결과]
// A = [1, 2, 3, 4, 5]
// B = [4, 5, 6, 7, 8]
// A ∩ B = [4, 5]
// A ∪ B = [1, 2, 3, 4, 5, 6, 7, 8]
// A - B = [1, 2, 3]