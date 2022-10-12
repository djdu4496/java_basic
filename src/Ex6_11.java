class Data_1 {
	int value;
}
class Data_2 {
	int value;
	
	Data_2(int x) {  // 매개변수가 있는 생성자.
		value = x;
	}
}


public class Ex6_11 {
    public static void main(String[] args) {
    	Data_1 d1 = new Data_1();
//    	Data_2 d2 = new Data_2();    // The constructor Data_2() is undefined
    	Data_2 d3 = new Data_2(3);
    }
}

/*
   Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The constructor Data_2() is undefined

	at Ex6_11.main(Ex6_11.java:16)
*/