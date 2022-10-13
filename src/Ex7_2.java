
class Ex7_2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10; // super.x
}

class Child extends Parent {
	int x = 20; // this.x
	
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}

// ����Ŭ������ ��������� �ڽ�Ŭ������ ��������� �̸��� ���� ��
// super.x�� this.x�� ������ �� �ִ�. 

/* ���
 * x= 20
 * this.x= 20
 * super.x= 10
 * */
