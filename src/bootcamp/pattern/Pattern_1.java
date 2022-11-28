package bootcamp.pattern;
/*
    i     ①
    1  →  2
    2  →  4
    3  →  6
    4  →  8
    5  →  10
    6  →  12
    7  →  14
    8  →  16
    9  →  18
 */
public class Pattern_1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++)
            System.out.println(i * 2);
    }
}
