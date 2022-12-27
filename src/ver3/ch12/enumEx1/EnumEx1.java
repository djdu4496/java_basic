package ver3.ch12.enumEx1;

enum Direction { EAST, SOUTH, WEST, NORTH }

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;                              // 열거형에 정의된 상수 사용 방법 - "열거형이름.상수명"
        Direction d2 = Direction.valueOf("WEST");             // static E valueOf(String name) - 열거형 상수의 이름으로 문자열 상수에 대한 참조 반환
        Direction d3 = Enum.valueOf(Direction.class, "EAST"); // T valueOf() - 지정된 열거형에서 name과 일치하는 열거형 상수 반환

        System.out.println("d1=" + d1); // d1 출력
        System.out.println("d2=" + d2); // d2 출력
        System.out.println("d3=" + d3); // d3 출력

        // 열거형 상수간 비교 - "==", compareTo() 사용 가능
        System.out.println("d1==d2 ? " + (d1 == d2));
        System.out.println("d1==d3 ? " + (d1 == d3));
        System.out.println("d1.equals(d3) ? " + (d1 == d2));
//      System.out.println("d2 > d3 ? " + (d2 > d3));  // 에러!! Operator '>' cannot be applied to 'ver3.ch12.enumEx1.Direction', 'ver3.ch12.enumEx1.Direction'
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));

        switch (d1) {
            case EAST: // [주의] Direction.EAST라 쓸 수 없다.
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("Thre direction is NORTH."); break;
            default:
                System.out.println("Invalid direction"); break;
        }

        Direction[] dArr = Direction.values();

        for(Direction d : dArr) // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());

    }
}

// [실행결과]
// d1=EAST
// d2=WEST
// d3=EAST
// d1==d2 ? false
// d1==d3 ? true
// d1.equals(d3) ? false
// d2 > d3 ? EAST
// d1.compareTo(d3) ? 0
// d1.compareTo(d2) ? -2
// The direction is EAST.
// EAST=0
// SOUTH=1
// WEST=2
// NORTH=3