package basic.ch07.pkg1;

public class MyParent {       // ���������ڰ� default�̱� ������ ���� �߻� =>
	private   int prv; // ���� Ŭ����
			  int dft; // ���� ��Ű��
	protected int prt; // ���� ��Ű�� + �ڼ�
	public 	  int pub; // �������Ѿ���
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest { // ���������ڰ� (default)
	public static void main(String[] args) {
		MyParent mp = new MyParent();
//		mp.prv = 1;
		mp.dft = 2;
		mp.prt = 3;
		mp.pub = 4;
		
		mp.printMembers();
	}
}