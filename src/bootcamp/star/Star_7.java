package bootcamp.star;
/*
    *****
    ******
    *******
    ********
    *********
 */
//public class star_7 {
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            for(int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

public class Star_7 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i + 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}