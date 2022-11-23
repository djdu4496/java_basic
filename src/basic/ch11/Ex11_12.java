package basic.ch11;

import java.util.*;

public class Ex11_12 {
    public static void main(String args[]) {
        HashSet setA   = new HashSet();
        HashSet setB   = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");	 setA.add("2");  setA.add("3");
        setA.add("4");  setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4");	 setB.add("5");  setB.add("6");
        setB.add("7");  setB.add("8");
        System.out.println("B = "+setB);
        // 풀이 1
        // 교집합
        Iterator it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }

        // 차집합
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }
        // A 합집합 B
        it = setA.iterator();
        while(it.hasNext())
            setHab.add(it.next());
        // B 합집합 A
        it = setB.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        // 풀이 2 - 각 코드 별로 주석처리를 해주고 하나씩만 출력 가능
        // setA.retainAll(setB); // 교집합. 공통된 요소만 남기고 삭제
        // System.out.println("A ∩ B = " + setA);
        // setA.addAll(setB);    // 합집합. SetB의 모든 요소를 추가(중복 제외)
        // System.out.println("A U B = " + setA);
        // setA.removeAll(setB); // 차집합. SetB와 공통 요소를 제거
        // System.out.println("A - B = " + setA);


        System.out.println("A ∩ B = " + setKyo);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A U B = " + setHab);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A - B = " + setCha);
    }
}
