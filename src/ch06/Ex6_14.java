package ch06;

class Ex6_14 {
	
	static {
		System.out.println("static { }");
	} // Ŭ���� �ʱ�ȭ ��
	
	{
		System.out.println("{ }");
	} // �ν��Ͻ� �ʱ�ȭ ��
	
	public Ex6_14() {
		System.out.println("������");
	}
	
    public static void main(String[] args) {
    	System.out.println("ch06.Ex6_14 bt = new ch06.Ex6_14(); ");
    	Ex6_14 bt = new Ex6_14();
    	
    	System.out.println("ch06.Ex6_14 bt2 = new ch06.Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
}

/*
	���
	static { }
	ch06.Ex6_14 bt = new ch06.Ex6_14();
	{ }
	������
	ch06.Ex6_14 bt2 = new ch06.Ex6_14();
	{ }
	������
*/