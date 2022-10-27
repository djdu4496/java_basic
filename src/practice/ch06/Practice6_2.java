package practice.ch06;

/*
 * ������ ���� �������� �򵵷� StudentŬ������ �����ڿ� info()�� �߰��Ͻÿ�.
 * class Practice6_2 {
       public static void main(String[] args) {
           Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
    	
    	    String str = s.info();
    	   System.out.println(str);
       }
   }
   
   class Student {
       //
       //    (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 
       //
   }
 * */

class Practice6_2 {
    public static void main(String[] args) {
    	Student2 s = new Student2("ȫ�浿", 1, 1, 100, 60, 76);
    	
    	String str = s.info();
    	System.out.println(str);
    }
}

class Student2 {
	String name;    // �л��̸�
	int ban;        // ��
	int no;         // ��ȣ
	int kor;        // ��������
	int eng;        // ��������
	int math;       // ��������
	
	Student2() { }
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		int sum = kor + eng + math;
		double avg = (double)Math.round((sum / (double)3) * 10) / 10;
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + sum + ", " + avg;
	}
}
