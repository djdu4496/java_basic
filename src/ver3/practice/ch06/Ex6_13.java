package ver3.practice.ch06;

// 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
// long add(int a, int b) { return a + b; }

public class Ex6_13 {
    public static void main(String[] args) {
        System.out.println("a. long add(int x, int y)   { return x+y; }");
        System.out.println("정답 : X, 매개변수 이름 변경은 오버로딩에 해당하지 않는다.");
        System.out.println("b. long add(long a, long b) { return a+b; }");
        System.out.println("정답 : O");
        System.out.println("c. int add(byte a, byte b)  { return a+b; }");
        System.out.println("정답 : O");
        System.out.println("d. int add(long a, int b)   { return (int)(a+b); }");
        System.out.println("정답 : O");
    }
}
