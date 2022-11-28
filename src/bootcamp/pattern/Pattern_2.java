package bootcamp.pattern;
/*
    i     ②
    1  →  1
    2  →  3
    3  →  5
    4  →  7
    5  →  9
    6  →  11
    7  →  13
    8  →  15
    9  →  17
 */
public class Pattern_2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++)
            System.out.println(i * 2 - 1);
    }
}
