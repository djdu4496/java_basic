package ch06;

class Data_1 {
	int value;
}
class Data_2 {
	int value;
	
	Data_2(int x) {  // �Ű������� �ִ� ������.
		value = x;
	}
}


public class Ex6_11 {
    public static void main(String[] args) {
    	Data_1 d1 = new Data_1();
//    	ch06.Data_2 d2 = new ch06.Data_2();    // The constructor ch06.Data_2() is undefined
    	Data_2 d3 = new Data_2(3);
    }
}

/*
   Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The constructor ch06.Data_2() is undefined

	at ch06.Ex6_11.main(ch06.Ex6_11.java:16)
*/