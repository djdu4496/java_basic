package bootcamp.pattern;
/*
    i     ③
    1  →  1
    2  →  4
    3  →  9
    4  →  16
    5  →  25
    6  →  36
    7  →  49
    8  →  64
    9  →  81
 */
public class Pattern_3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++)
            System.out.println(i * i);
    }
}
