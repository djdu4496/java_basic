package star;
/*
    *****
     ***
      *
     ***
    *****
 */
//public class star_9 {
//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                if(i == 0 || i == 4)
//                    System.out.print("*");
//                else {
//                    if(i == 1 || i == 3) {
//                        if(1 <= j && j <= 3) {
//                            System.out.print("*");
//                        } else {
//                            System.out.print(" ");
//                        }
//                    } else {
//                        if(j == 2)
//                            System.out.print("*");
//                        else
//                            System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}

public class Star_9 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if((i + j <= 4 && i <= j) || (i + j >= 4 && i >= j))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

