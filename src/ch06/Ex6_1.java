package ch06;

public class Ex6_1 {
    public static void main(String[] args) {
    	Tv t;
    	t = new Tv();
    	t.channel = 7;
    	t.channelDown();
    	System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
    }
}

class Tv {
	// ch06.Tv�� �Ӽ�(�������)
	String color;    // ����
	boolean power;   // ��������(on/off)
	int channel;     // ä��
	
	// ch06.Tv�� ���(�޼���)
	void power()       { power = !power; }
	void channelUp()   { ++channel; }
	void channelDown() { --channel; }
}