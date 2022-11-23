package ver3.ch2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;
        System.out.println("x:" + x + " y:" + y);
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x:" + x + " y:" + y);
    }
}  // 8~10라인의 방법을 기계적으로 사용하면 된다.
