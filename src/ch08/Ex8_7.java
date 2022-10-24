package ch08;

class Ex8_7 {
    public static void main(String[] args) {
        try {  // Exception과 그 자손은 반드시 예외처리를 해줘야 한다.(필수)
            throw new Exception();              // Exception을 고의로 발생시킨다.
        } catch (Exception e) {
        }
        // throw new Exception();              // Exception을 고의로 발생시킨다.(check예외)
    }
}
