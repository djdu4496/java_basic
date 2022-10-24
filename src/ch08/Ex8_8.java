package ch08;

class Ex8_8 {
    public static void main(String[] args) {
        // RuntimeException과 그 자손은 반드시 예외처리를 해주지 않아도 컴파일이 된다.(선택)
        throw new RuntimeException();  // RuntimeException을 고의로 발생시킨다.(unchecked예외)
    }
}