package practice2;

/*
 * 2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 (1)에 알맞은 코드를 넣으시오.
 * 		public class Practice2_8 {
 * 			public static void main(String[] args) {
 * 				int x = 1;
 * 				int y = 2;
 * 				int z = 3;
 * 
 * 				// (1) 알맞은 코드를 넣어 완성하시오.
 * 
 * 				System.out.println("x=" + x);
 * 				System.out.println("y=" + y);
 * 				System.out.println("z=" + z);
 * 			}
 * 		}
 * 
 * 결과
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
