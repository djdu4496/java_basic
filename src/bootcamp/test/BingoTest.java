package bootcamp.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BingoTest {

// Q. 아래의 bingoCnt()를 완성하시오.
// 빙고판의 빙고 개수를 세어서 반환하는 메서드
// 입력 : 빙고판(2차원 배열)
// 출력 : 빙고 갯수

    int bingoCnt(int[][] board) {
        // 1. 가로 줄 갯수 구하기
            // i행 1열부터 i행 5열까지 비교 후, 모든 값이 1인 경우 빙고 개수 추가
        // 2. 세로 줄 갯수 구하기
            // 1행 i열부터 5행 i열까지 비교 후, 모든 값이 1인 경우 빙고 개수 추가
        // 3. 대각선 줄 갯수 구하기
            // 1. 대각선  - i = j를 만족하는 요소들이 모두 1인 경우, 빙고 개수 추가
            // 2. 역대각선 - i + j == 4를 만족하는 요소들이 모두 1인 경우, 빙고 개수 추가

        int bingo = 0; // 빙고의 총 개수 저장

        bingo += garoCount(board);               // 1. 가로 줄 빙고 갯수 구하기
        bingo += seroCount(board);               // 2. 세로 줄 빙고 갯수 구하기
        bingo += diagonalCount(board);           // 3. 대각선 빙고 갯수 구하기
        bingo += antiDiagonalCount(board);       // 4. 역대각선 빙고 갯수 구하기

        return bingo;

    }

    int antiDiagonalCount(int[][] board) {              // 역대각선  - i + j == 4를 만족하는 요소들이 모두 1인 경우, 빙고 개수 추가
        int cnt = 0;
        int bingo = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][4 - i] != 1)
                break;
            else
                cnt++;
        }
        if (cnt == 5)
            bingo++;
        cnt = 0;

        return bingo;
    }
int diagonalCount(int[][] board) {                      // 대각선   -  i == j를 만족하는 요소들이 모두 1인 경우, 빙고 개수 추가
        int cnt = 0;
        int bingo = 0;
        for (int i = 0; i < board.length; i++) {
            if(board[i][i] != 1)
                break;
            else
                cnt++;
        }
        if(cnt == 5)
            bingo++;
        cnt = 0;

        return bingo;
    }

    int garoCount(int[][] board) {                      // 가로 - i행 1열부터 i행 5열까지 비교 후, 모든 값이 1인 경우 빙고 개수 추가
        int cnt = 0;
        int bingo = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] != 1)
                    break;
                else
                    cnt++;
            }
            if(cnt == 5)
                bingo++;
            cnt = 0;
        }
        return bingo;
    }

    int seroCount(int[][] board) {                      // 세로 - 1행 i열부터 5행 i열까지 비교 후, 모든 값이 1인 경우 빙고 개수 추가
        int cnt = 0;
        int bingo = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[j][i] != 1)
                    break;
                else
                    cnt++;
            }
            if(cnt == 5)
                bingo++;
            cnt = 0;
        }
        return bingo;
    }

    @Test
    public void garoCountTest() {
        // 조건
        int[][] board = {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},

        };

        assertTrue(bingoCnt(board) == 1);

    }
    @Test
    public void garoCountTest2() {
        // 조건
        int[][] board = {

                {1, 1, 1, 1, 1},

                {0, 0, 0, 0, 0},

                {1, 1, 1, 1, 1},

                {0, 0, 0, 0, 0},

                {0, 0, 0, 0, 0},

        };
        assertTrue(bingoCnt(board) == 2);
    }

    @Test
    public void mixCountTest() {
        // 조건
        int[][] board = {

                {1, 1, 1, 1, 1},

                {1, 0, 0, 1, 1},

                {1, 1, 1, 1, 1},

                {1, 1, 1, 1, 1},

                {1, 1, 0, 0, 1},

        };
        assertTrue(bingoCnt(board) == 6);
    }

    @Test
    public void test() {
        // 조건
        int[][] board = {

                {1, 1, 1, 1, 1},

                {1, 1, 1, 1, 1},

                {1, 1, 1, 1, 1},

                {1, 1, 1, 1, 1},

                {1, 1, 1, 1, 1},

        };

        assertTrue(bingoCnt(board) == 12);

    }
}