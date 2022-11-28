package bootcamp.star;
/*
    *
    **
    ***
    ****
    *****
 */

// 과정 1
//public class Star_5 {
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j <= i; j++)
//                System.out.print("*");
//
//            System.out.println();
//        }
//    }
//}

// 과정 2
public class Star_5 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                if (i >= j)
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.println();
        }
    }
}
