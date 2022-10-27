package practice.ch02;

/*
 * 2-8. �Ʒ��� ���� x, y, z�� ���� ���� �ٲٴ� �����̴�. ����� ���� ��µǵ��� (1)�� �˸��� �ڵ带 �����ÿ�.
 * 		public class Practice2_8 {
 * 			public static void main(String[] args) {
 * 				int x = 1;
 * 				int y = 2;
 * 				int z = 3;
 * 
 * 				// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
 * 
 * 				System.out.println("x=" + x);
 * 				System.out.println("y=" + y);
 * 				System.out.println("z=" + z);
 * 			}
 * 		}
 * 
 * ���
 * 		x=2
 * 		y=3
 * 		z=1
 * */

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
