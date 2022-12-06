package ver3.ch8;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();     // 프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
            deleteTempFiles();  // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();  // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        }
    }

    static void startInstall() {
        // 프로그램 설치에 필요한 준비를 하는 코드를 적는다.
    }

    static void copyFiles() {
        // 파일들을 복사하는 코드를 적는다.
    }

    static void deleteTempFiles() {
        // 임시파일들을 삭제하는 코드를 적는다.
    }
}  // | 참고 | startInstall(), copyFiles(), deleteFiles()에 주석문 이외에는 아무런 문장이 없지만, 각 메서드의 의미에 해당하는 작업을 수행하는 코드들이 작성되어 있다고 가정하자.
