//package bootcamp.bingo;
//
//public class Bingo {
//    public static void main(String[] args) {
////        bingoCnt();
//    }
//    void bingoCnt(int[][] board) {
//        // 1. 가로 줄 갯수 구하기
//        // i행 1열부터 i행 5열까지 비교 후, 모든 값이 1인 경우 빙고 개수 추가
//        // 2. 세로 줄 갯수 구하기
//        // 1행 i열부터 5행 i열까지 비교 후, 모든 값이 1인 경우 빙고 개수 추가
//        // 3.대각선 줄 갯수 구하기
//        // 1. i = j를 만족하는 요소들이 모두 1인 경우, 빙고 개수 추가
//        // 2. i + j == 4를 만족하는 요소들이 모두 1인 경우, 빙고 개수 추가
//
//        int cnt = 0;
//        int bingo = 0; // 빙고 개수 저장하기 위한 변수 cnt 선언 및 0으로 초기화
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if(board[i][j] != 1)
//                    break;
//                else
//                    cnt++;
//            }
//            if(cnt == 5)
//                bingo++;
//            cnt = 0;
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if(board[j][i] != 1)
//                    break;
//                else
//                    cnt++;
//            }
//            if(cnt == 5)
//                bingo++;
//            cnt = 0;
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            if(board[i][i] != 1)
//                break;
//            else
//                cnt++;
//        }
//        if(cnt == 5)
//            bingo++;
//        cnt = 0;
//
//        for (int i = 0; i < board.length; i++) {
//            if(board[i][4 - i] != 1)
//                break;
//            else
//                cnt++;
//        }
//        if(cnt == 5)
//            bingo++;
//        cnt = 0;
//
//        return bingo;
//    }
//}
