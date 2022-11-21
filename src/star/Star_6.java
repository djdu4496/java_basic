package star;
/*
    *****
    ****
    ***
    **
    *
 */

// 과정 1
//public class Star_6 {
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = i; j < 5; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}

class Star_6 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i + j <= 4)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}