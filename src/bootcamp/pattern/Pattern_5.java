package bootcamp.pattern;
/*
    i     ⑤
    1  →  1
    2  →  2
    3  →  3
    4  →  1
    5  →  2
    6  →  3
    7  →  1
    8  →  2
    9  →  3
 */
public class Pattern_5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++)
            System.out.println((i + 2) % 3 + 1);
    }
}
