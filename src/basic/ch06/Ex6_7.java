package basic.ch06;

class Data2 { int x; }


public class Ex6_7 {
    public static void main(String[] args) {
    	Data2 d = new Data2();
    	
    	d.x = 10;
    	System.out.println("main() : x = " + d.x);
    	
    	change(d);
    	System.out.println("After change(d)");
    	System.out.println("main() : x = " + d.x);
    }
    
    static void change(Data2 d) {
    	d.x = 1000;
    	System.out.println("change() : x = " + d.x);
    }
}

/*
	main() : x = 10
	change() : x = 1000
	After change(d)
	main() : x = 1000
*/