package star;
/*
    *   *
    ** **
    *****
    ** **
    *   *
 */

// 1트 - 생각 정리(주석 처리) 안 하고(그리지 않고) 작성한 결과
//public class star_10 {
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                if(i == 0 || i == 4) {    // 0번째 줄과 4번째 줄이 같은 형태를 띠고 있어서, 합집합으로 묶은 뒤
//                    if(j == 0 || j == 4)  // 같은 조건문으로 처리했다.
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                } else if(i == 1 || i == 3) {
//                    if(j != 2)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                } else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//
// 2트 - 생각 정리 안 하고(그리지 않고) 작성한 결과(2)
//public class Star_10 {
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                if(1 <= j && j <= 3 && (i == 0 || i == 4) || (j == 2 && (i == 1 || i == 3)) )
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// 3트
class Star_10 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j <= 4 && i >= j) || (i + j >= 4 && i <= j))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}