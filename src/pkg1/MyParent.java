package pkg1;

public class MyParent {       // 접근제어자가 default이기 때문에 에러 발생 =>
	private   int prv; // 같은 클래스
			  int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 자손
	public 	  int pub; // 접근제한없음
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest { // 접근제어자가 (default)
	public static void main(String[] args) {
		MyParent mp = new MyParent();
//		mp.prv = 1;
		mp.dft = 2;
		mp.prt = 3;
		mp.pub = 4;
		
		mp.printMembers();
	}
}
