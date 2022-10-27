package ch07.pkg2;

import ch07.pkg1.MyParent;  // Ctrl + Shift + o�� ������ import���� �ڵ� �߰���

// class MyChild extends ch07.pkg1.MyParent {
class MyChild extends MyParent {
	public void printMembers() {
//		System.out.println(prv); // ����. ���� Ŭ���� x
//		System.out.println(dft); // ����. ���� ��Ű�� x
		System.out.println(prt); // OK.  ���� ��Ű�� x & �ڼ� o
		System.out.println(pub); // OK.
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent mp = new MyParent();
//		System.out.println(mp.prv);	 // ����. ���� Ŭ���� x
//		System.out.println(mp.dft);	 // ����. ���� ��Ű�� x  
//		System.out.println(mp.prt);  // ����. ���� ��Ű�� x & �ڼ� x
		System.out.println(mp.pub);  // OK.

	}

} 