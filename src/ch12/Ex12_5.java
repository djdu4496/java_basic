package ch12;
           //      0      1     2      3
enum Direction { EAST, SOUTH, WEST, NORTH }  // 사실 열거형 상수의 정체는 '객체'다.

class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;  // 열거형타입.상수이름(세 코드중 제일 많이 씀)
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println("d1==d2 ? "+ (d1==d2));  // false
        System.out.println("d1==d3 ? "+ (d1==d3));  // true
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3));
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러. 기본형 값이 아니기 때문.
        System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));

        switch(d1) {
            case EAST: // (문법) switch문에서 Direction.EAST라 쓸 수 없다.
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
            default:
                System.out.println("Invalid direction."); break;
        }

        Direction[] dArr = Direction.values();  // 열거형의 모든 상수를 배열로 반환

        for(Direction d : dArr)  // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
    }
}
