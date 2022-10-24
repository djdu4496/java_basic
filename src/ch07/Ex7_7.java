package ch07;

class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;     // car = (Car)fe;���� ����ȯ�� ������
//		car.water();  // ������ ����!!! CarŸ���� ���������δ� water()�� ȣ���� �� ����.
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� <- ����Ÿ��. ����ȯ ���� �Ұ�
		fe2.water();
	}
} 

class Car {
	String color;
	int door;
	
	void drive() {  // �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {   // ���ߴ� ���
		System.out.println("stop!!!");
	}

}

class FireEngine extends Car { // �ҹ���
	void water() {  // �� �Ѹ��� ���
		System.out.println("water!!!");
	}
}