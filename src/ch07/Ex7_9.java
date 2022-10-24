package ch07;

class Product2 {
	int price;      // ��ǰ�� ����
	int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // ���ʽ������� ��ǰ������ 10%
	}
	
	Product2() {} // �⺻ ������
}

class Tv2 extends Product2 {
	Tv2() {
		// ����Ŭ������ ������ Product2(int price)�� ȣ���Ѵ�.
		super(100); // ch06.Tv�� ������ 100�������� �Ѵ�.
	}
	
	// ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {	return "ch06.Tv";	}
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	
	public String toString() { return "Audio"; }
}

class Buyer2 { // ��, ������ ��� ���
	int money = 1000;   // �����ݾ�
	int bonusPoint = 0; // ���ʽ�����
	Product2[] cart = new Product2[10];  // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;          // Product�迭�� ���� ī����
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;                 // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;       // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		cart[i++] = p;                    // ��ǰ�� Product[] cart�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {            // ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;            // ������ ��ǰ�� �����հ�
		String itemList = "";   // ������ ��ǰ���
		
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
//			itemList += cart[i] + ", ";                         // �����Ͻ� ��ǰ�� ch06.Tv, Computer, Audio, �Դϴ�.
			itemList += (i==0) ? "" + cart[i] : ", " + cart[i]; // �����Ͻ� ��ǰ�� ch06.Tv, Computer, Audio�Դϴ�.
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

class Ex7_9 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
} 

