package ch06;

public class Ex6_2 {
    public static void main(String[] args) {
    	Tv t1 = new Tv();
    	Tv t2 = new Tv();
    	System.out.println("t1�� ���� ä���� " + t1.channel + " �Դϴ�.");
    	System.out.println("t2�� ���� ä���� " + t2.channel + " �Դϴ�.");
    	
    	t1.channel = 7;
    	System.out.println("t1�� channel���� "+ t1.channel+"�� �����Ͽ����ϴ�.");
    	
    	System.out.println("t1�� ���� ä���� " + t1.channel + " �Դϴ�.");
    	System.out.println("t2�� ���� ä���� " + t2.channel + " �Դϴ�.");
    }
}