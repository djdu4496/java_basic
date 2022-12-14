package ver3.ch11;

import java.util.*;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++)
            set.add(new Integer(score[i]));

        System.out.println("50보다 작은 값 :" + set.headSet(50));
        System.out.println("50보다 큰 값 :" + set.tailSet(50));
        System.out.println("40과 80 사이의 값 :" + set.subSet(40, 80));
    }
}
// [실행결과]
// 50보다 작은 값 :[10, 35, 45]
// 50보다 큰 값 :[50, 65, 80, 95, 100]
//
// [실행결과2] - set.subSet(40, 80) 호출 후 출력 코드 추가
// 50보다 작은 값 :[10, 35, 45]
// 50보다 큰 값 :[50, 65, 80, 95, 100]
// 40과 80 사이의 값 :[45, 50, 65]
