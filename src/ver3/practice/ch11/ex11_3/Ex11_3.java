package ver3.practice.ch11.ex11_3;

// 다음 중 ArrayList에서 제일 비용이 많이 드는 작업은?
// 단, 작업도중에 ArrayList의 크기 변경이 발생하지 않는다고 가정한다.
// a. 첫 번째 요소 삭제
// b. 마지막 요소 삭제
// c. 마지막에 새로운 요소 추가
// d. 중간에 새로운 요소 추가

public class Ex11_3 {
    public static void main(String[] args) {
        System.out.println("답안 : d. 중간에 새로운 요소 추가");
        System.out.println("이유 : 첫 번째 혹은 마지막 요소를 추가/삭제하기 위해서는 수정 작업만 하면 된다.");
        System.out.println("하지만, 중간에 같은 작업을 하려면 해당 인덱스(위치 정보)를 찾는 작업까지 수반되어야 한다.");
    }
}
