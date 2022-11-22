package practice.ch02;

public class Practice2_8 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = x;
		x = y;
		y = tmp;
		
		int tmp2 = y;
		y = z;
		z = tmp2;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
