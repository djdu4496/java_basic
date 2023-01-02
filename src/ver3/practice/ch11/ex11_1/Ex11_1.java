package ver3.practice.ch11.ex11_1;

// 다음은 정수집합 1, 2, 3, 4와 3, 4, 5, 6의 교집합, 차집합, 합집합을 구하는 코드이다.
// 코드를 완성하여 실행결과와 같은 결과를 출력하시오.
// [Hint] ArrayList클래스의 addAll(), removeAll(), retainAll()를 사용하라.

import java.util.ArrayList;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList(); // 교집합
        ArrayList cha = new ArrayList(); // 차집합
        ArrayList hap = new ArrayList(); // 합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        /*
            (1) 알맞은 코드를 넣어 완성하시오.
         */
        // 1. 교집합 == list1과 list2 겹치는 부분의 부분집합
        // 2. 차집합 == list1에서 교집합을 뺀 부분집합
        // 3. 합집합 == cha집합과 list2를 더한 부분집합

        // 1.
        // 1트
        // list2의 모든 요소를 순회하면서
        // 해당 요소가 list1이 가지고 있는 요소라면
        // 교집합 kyo에 해당 요소를 추가해준다.
        // 2트
        // 1. 교집합
            // 1-1. kyo에 list1의 요소들을 전부 더한다.
            // 1-2. kyo에서 list2와 겹치는 부분만 남기고 전부 삭제한다.

        kyo.addAll(list1);
        kyo.retainAll(list2);


        // 2.
        // 1트
        // list1의 모든 요소를 순회하면서
        // 해당 요소가 kyo에 포함되지 않은 요소만
        // 차집합 cha에 추가해준다.
        // 2트
        // 1. cha에 list1의 모든 요소를 더한다.
        // 2. cha에서 kyo에 속한 요소와 동일한 요소들을 전부 삭제한다.
        cha.addAll(list1);
        cha.removeAll(kyo);

        // 3.
        // 1. hap에 list1의 모든 요소를 더해준다.
        // 2. hap에서 kyo에 저장된 모든 요소를 뺀다.
        // 3. list1 - list2 차집합에 list2를 더하면 두 집합의 합집합을 얻을 수 있다.
//        hap.addAll(list1);
//        hap.removeAll(kyo);
//        hap.addAll(list2);
        // 2트
        // 1. hap에 list1와 list2의 차집합 cha의 요소를 모두 저장한다.
        // 2. hap에 list2 요소를 모두 저장한다.
        hap.addAll(cha);
        hap.addAll(list2);

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo=" + kyo);
        System.out.println("cha=" + cha);
        System.out.println("hap=" + hap);
    }
}

// [실행결과]
// list1=[1, 2, 3, 4]
// list2=[3, 4, 5, 6]
// kyu=[3, 4]
// cha=[1, 2]
// hap=[1, 2, 3 ,4, 5, 6]

