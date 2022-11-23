package ver3.practice.ch02;

public class Practice2_1to7 {
	public static void main(String[] args) {
		/*
		 * 2-1. ���� ǥ�� ��ĭ�� 8���� �⺻��(primitive type)�� �˸��� �ڸ��� �����ÿ�.
		 *		���� - boolean(1byte)
		 *		������ - char(2byte)
		 *		������ - byte, short(2byte), int(4byte), long(8byte)
		 *		�Ǽ��� - float(4byte), double(8byte)
		 *
		 * 2-2. ���� �� Ű���尡 �ƴ� ����?(��� ���ÿ�)
		 * 		True, NULL, Class, System(Ŭ����)
		 * 
		 * 2-3. charŸ��(2byte)�� ������ ����� �� �ִ� ���� ���� ������?(10������ �����ÿ�)
		 * 		0(�ּҰ�) ~ 65535(�ִ밪)
		 * 
		 * 2-4. ���� �� ������ �߸� �ʱ�ȭ�� ����?
		 * 		byte b = 256;        // ����. byteŸ���� ���� ���� : 0 ~ 2^8 - 1 == 0 ~ 255
		 * 		char c = '';         // ����. '' �ȿ� �ݵ�� �ϳ��� ���ڰ� �ʿ�
		 *      char answer = 'no';  // ����. ���ڿ� Ÿ���� ���� String ���ͷ��� �����ؾ� �Ѵ�. String answer = "no";
		 *      float f = 3.14;      // ����. ū ũ���� Ÿ�� 3.14d(3.14)�� ���� ũ���� Ÿ�� float�� ������ ������ �� ����.
		 *      
		 * 2-5. ������ ���忡�� ���ͷ�, ����, ���, Ű���带 �����ÿ�.
		 * 		int i = 100;
		 * 		long l = 100L;
		 * 		final float PI = 3.14f;
		 * 
		 * 		- ���ͷ� : 100, 100L, 3.14f
		 * 		- Ű���� : int, long, final, float
		 * 		- ����    : i, l
		 *      - ���    : PI
		 *      
		 * 2-6. ���� �� �⺻��(primitive type)�� �ƴ� ����?
		 * 		Byte     // X. byte �̴�.
		 * 
		 * 2-7. ���� ������� ��� ����� ��������. ������ �ִ� ������ ���, ��ȣ �ȿ� '����'��� �����ÿ�.
		 * 		1 System.out.print.ln("1" + "2")   -> (  "12"  )
		 * 		2 System.out.print.ln(true + "")   -> ( "true" )
		 * 		3 System.out.print.ln('A' + 'B')   -> (  131   )
		 * 		4 System.out.print.ln('1' + 2)     -> (   51   )
		 * 		5 System.out.print.ln('1' + '2')   -> (   99   )
		 * 		6 System.out.print.ln('J' + "ava") -> ( "Java" )
		 * 		7 System.out.print.ln(true + null) -> (   ����    )
		 * 
		 *      ����. ���� '0'�� �ƽ�Ű�ڵ�� 48�̰�, ���� 'A'�� �ƽ�Ű�ڵ�� 65����.
		 * */
		System.out.println(true + "");
	}
}
