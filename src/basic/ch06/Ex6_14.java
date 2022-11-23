package basic.ch06;

class Ex6_14 {
	
	static {
		System.out.println("static { }");
	} // 클래스 초기화 블럭
	
	{
		System.out.println("{ }");
	} // 인스턴스 초기화 블럭
	
	public Ex6_14() {
		System.out.println("생성자");
	}
	
    public static void main(String[] args) {
    	System.out.println("basic.ch06.Ex6_14 bt = new basic.ch06.Ex6_14(); ");
    	Ex6_14 bt = new Ex6_14();
    	
    	System.out.println("basic.ch06.Ex6_14 bt2 = new basic.ch06.Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
}

/*
	결과
	static { }
	basic.ch06.Ex6_14 bt = new basic.ch06.Ex6_14();
	{ }
	생성자
	basic.ch06.Ex6_14 bt2 = new basic.ch06.Ex6_14();
	{ }
	생성자
*/