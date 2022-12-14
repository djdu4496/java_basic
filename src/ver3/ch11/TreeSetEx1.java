package ver3.ch11;

import java.util.*;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));

    }
}

// [실행결과1]
// [Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
// range search : from b to d
// result1 : [bat, car]
// result2 : [bat, car, dZZZZ, dance, disc]

// [실행결과2] = System.out.println("result1 : " + set.subSet("b", "e"));
// [Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
// range search : from b to e
// result1 : [bat, car, dZZZZ, dance, disc, dzzzz]
// result2 : [bat, car, dZZZZ, dance, disc]