package practice6;

/*
 * 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
 * class Practice6_2 {
       public static void main(String[] args) {
           Student s = new Student("홍길동", 1, 1, 100, 60, 76);
    	
    	    String str = s.info();
    	   System.out.println(str);
       }
   }
   
   class Student {
       //
       //    (1) 알맞은 코드를 넣어 완성하시오. 
       //
   }
 * */

class Practice6_2 {
    public static void main(String[] args) {
    	Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
    	
    	String str = s.info();
    	System.out.println(str);
    }
}

class Student2 {
	String name;    // 학생이름
	int ban;        // 반
	int no;         // 번호
	int kor;        // 국어점수
	int eng;        // 영어점수
	int math;       // 수학점수
	
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
