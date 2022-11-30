package ver3.practice.ch06;

// 문제 1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오.

class Ex6_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	int num;  // 카드의 숫자.(1~10 사이의 정수)
	boolean isKwang;  // 광이면 true, 아니면 false

	// 1. 기본 생성자
	SutdaCard() {
		num = 1;
		isKwang = true;
	}
	// 2. 매개변수가 있는 생성자
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// 3. info메서드
	String info() {
		return isKwang ? num + "K" : num + "";
	}
}
