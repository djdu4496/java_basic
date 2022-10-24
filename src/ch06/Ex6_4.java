package ch06;

public class Ex6_4 {
    public static void main(String[] args) {
    	MyMath mm = new MyMath();
    	long result1 = mm.add(5L, 3L);
    	long result2 = mm.subtract(5L, 3L);
    	long result3 = mm.multiply(3L, 5L);
    	double result4 = mm.divide(5L, 3L);    // double ��� long������ ȣ���Ͽ���. �� ���� double�� �ڵ�����ȯ�ȴ�.
    	long result5 = mm.max(5L, 3L);
    	long result6 = mm.min(5L, 3L);
    	
    	System.out.println("add(5L, 3L) = " + result1);
    	System.out.println("subtract(5L, 3L) = " + result2);
    	System.out.println("multiply(5L, 3L) = " + result3);
    	System.out.println("divide(5L, 3L) = " + result4);
    	System.out.println("max(5L, 3L) = " + result5);
    	System.out.println("min(5L, 3L) = " + result6);
    }
    
    
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result; 
//		return a + b;    // ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
	// �� ���� �޾Ƽ� �� �߿� ū ���� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
	long max(long a, long b) {
//		long result = 0;
//		result = a > b ? a : b;
//		return result; 
		return a > b ? a : b;
	}
	// �� ���� �޾Ƽ� �� �߿� ���� ���� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
	long min(long a, long b){ 
		return a < b ? a : b;
	}
}