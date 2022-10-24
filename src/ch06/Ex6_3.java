package ch06;

public class Ex6_3 {
    public static void main(String[] args) {
    	System.out.println("ch06.Card.width = " + Card.width);
    	System.out.println("ch06.Card.height = " + Card.height);    // Ŭ��������(static����)�� ��ü�������� 'Ŭ�����̸�.Ŭ��������'�� ���� ��� �����ϴ�.
    	
    	Card c1 = new Card();
    	c1.kind = "Heart";    // �ν��Ͻ������� ���� �����Ѵ�.    
    	c1.number = 7;        // �ν��Ͻ������� ���� �����Ѵ�.
    	
    	Card c2 = new Card();
    	c2.kind = "Spade";    // �ν��Ͻ������� ���� �����Ѵ�.
    	c2.number = 4;        // �ν��Ͻ������� ���� �����Ѵ�.
    	
    	System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
    	System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
    	System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
    	c1.width = 50;        // Ŭ���������� ���� �����Ѵ�.
    	c1.height = 80;		  // Ŭ���������� ���� �����Ѵ�.
    	
    	System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
    	System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
    }
}

class Card {
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
}