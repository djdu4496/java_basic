package bootcamp.pattern;
/*
    i     ④
    1  →  1
    2  →  1
    3  →  1
    4  →  2
    5  →  2
    6  →  2
    7  →  3
    8  →  3
    9  →  3
 */
public class Pattern_4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++)
            System.out.println((i + 2) / 3);
    }
}
