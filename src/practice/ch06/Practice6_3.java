package practice.ch06;

/*
 * ��������6-1���� ������ StudentŬ������ ������ ���� ���ǵ� �� ���� �޼��� getTotal()�� getAverage()�� �߰��Ͻÿ�.
 * 1. �޼���� : getTotal
 *    ��      �� : ����(kor), ����(eng), ����(math)�� ������ ��� ���ؼ� ��ȯ�Ѵ�.
 *    ��ȯŸ�� : int
 *    �Ű����� : ����
 *   
 * 2. �޼���� : getAverage
 *    ��      �� : ����(�������� + �������� + ��������)�� ������� ���� ����� ���Ѵ�.
 *             �Ҽ��� ��°�ڸ����� �ݿø��� ��.
 *    ��ȯŸ�� : float
 *    �Ű����� : ����  
 * */

//class Practice6_3 {
//    public static void main(String[] args) {
//    	Student s = new Student();
//    	s.name = "ȫ�浿";
//    	s.ban = 1;
//    	s.no = 1;
//    	s.kor = 100;
//    	s.eng = 60;
//    	s.math = 76;
//    	
//    	System.out.println("�̸� : " + s.name);
//    	System.out.println("���� : " + s.getTotal());
//    	System.out.println("��� : " + s.getAverage());
//    }
//}
//
//class Student {
//	/*
//	 *  (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 
//	 */
//}

class Practice6_3 {
    public static void main(String[] args) {
    	Student3 s = new Student3();
    	s.name = "ȫ�浿";
    	s.ban = 1;
    	s.no = 1;
    	s.kor = 100;
    	s.eng = 60;
    	s.math = 76;
    	
    	System.out.println("�̸� : " + s.name);
    	System.out.println("���� : " + s.getTotal());
    	System.out.println("��� : " + s.getAverage());
    }
}

class Student3 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return Math.round(getTotal() / 3.0f * 10) / 10.0f;
	}
}

