package ver3.ch12.enumEx2;

enum Direction {
    // 하나의 열거형 상수에 여러 값을 지정할 수 있다.
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");  // Expected 0 arguments but found 2

    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;  // 새로운 iv 추가

    Direction(int value, String symbol) {  // 접근제어자 private이 생략됨
        this.value = value;
        this.symbol = symbol;  // 생성자 수정 - 새로운 iv 초기화
    }

    public int getValue()     { return value; }  // 캡슐화 - 외부로부터 데이터를 보호
    public String getSymbol() { return symbol; } // 캡슐화 - 외부로부터 데이터를 보호

    public static Direction of(int dir) {
        if(dir < 1 || dir > 4) {                                           // 1. 유효성 검사
            throw new IllegalArgumentException("Invalid value : " + dir);  // 2. 예외 발생시키기
        }
        return DIR_ARR[dir - 1];                                           // 3. 지정된 열거형 상수 반환
    }

    // 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
    public Direction rotate(int num) {
        num = num % 4;         // 방향이 4번 주기로 반복

        if(num < 0) num += 4;  // num이 음수일 때는 시계반대 방향으로 회전

        return DIR_ARR[(value - 1 + num) % 4];  // 회전 후 방향 반환
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return name() + getSymbol();
    }  // Enum클래스 String name() - 열거형 상수의 이름을 문자열로 반환

} // enum Direction

public class EnumEx2 {
    public static void main(String[] args) {
        for(Direction d : Direction.values())  // 향상된 for문 - 열거형 상수 전체 출력
            System.out.printf("%s=%d%n", d.name(), d.getValue());

        Direction d1 = Direction.EAST;          // 열거형에 정의된 상수 사용 방법 - "열거형이름.상수명"
        Direction d2 = Direction.of(1);    //  지정된 열거형 상수 반환

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());

        System.out.println(Direction.EAST.rotate(1));  // EAST에서 시계방향으로 90도 회전
        System.out.println(Direction.EAST.rotate(2));  // EAST에서 시계방향으로 180도 회전
        System.out.println(Direction.EAST.rotate(-1)); // EAST에서 반시계방향으로 90도 회전
        System.out.println(Direction.EAST.rotate(-2)); // EAST에서 반시계방향으로 180도 회전
    }
}

// [실행결과]
// EAST=1
// SOUTH=2
// WEST=3
// NORTH=4
// d1=EAST, 1
// d2=EAST, 1
// SOUTHV
// WEST<
// NORTH^
// WEST<