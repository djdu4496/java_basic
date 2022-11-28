package bootcamp.star;
/*
         *
        ***
       *****
      *******
     *********
 */

// 1트
//public class Star_8 {
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                if(j < 4 - i)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            for(int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// 2트
class Star_8 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i + 4; j++) {
                if(i + j < 4)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}