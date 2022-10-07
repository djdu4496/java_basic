package pkg2;

import pkg1.MyParent;  // Ctrl + Shift + o를 누르면 import문이 자동 추가됨

// class MyChild extends pkg1.MyParent {
class MyChild extends MyParent {
	public void printMembers() {
//		System.out.println(prv); // 에러. 같은 클래스 x
//		System.out.println(dft); // 에러. 같은 패키지 x
		System.out.println(prt); // OK.  같은 패키지 x & 자손 o
		System.out.println(pub); // OK.
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent mp = new MyParent();
//		System.out.println(mp.prv);	 // 에러. 같은 클래스 x
//		System.out.println(mp.dft);	 // 에러. 같은 패키지 x  
//		System.out.println(mp.prt);  // 에러. 같은 패키지 x & 자손 x
		System.out.println(mp.pub);  // OK.

	}

}