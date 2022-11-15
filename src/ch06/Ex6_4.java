package ch06;

public class Ex6_4 {
    public static void main(String[] args) {
    	MyMath mm = new MyMath();  // 2. MyMath인스턴스 생성

		// 3. MyMath인스턴스 사용
    	long result1 = mm.add(5L, 3L);         // add 메서드 호출
    	long result2 = mm.subtract(5L, 3L);
    	long result3 = mm.multiply(3L, 5L);
    	double result4 = mm.divide(5L, 3L);
    	long result5 = mm.max(5L, 3L);  // 둘 중에 큰 값을 반환하는 메서드
    	long result6 = mm.min(5L, 3L);  // 둘 중에 작은 값을 반환하는 메서드
		mm.printGugudan(12);
    	
    	System.out.println("add(5L, 3L) = " + result1);
    	System.out.println("subtract(5L, 3L) = " + result2);
    	System.out.println("multiply(5L, 3L) = " + result3);
    	System.out.println("divide(5L, 3L) = " + result4);
    	System.out.println("max(5L, 3L) = " + result5);
    	System.out.println("min(5L, 3L) = " + result6);
    }
    
    
}

class MyMath {  // 1. MyMath클래스 작성(메서드 작성)
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return;  // 입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기

		for(int i = 1; i <= 9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
//		return;  // 반환타입이 void가 아닌 경우, 생략 가능(컴파일러 자동 추가)
	}

	long add(long a, long b) {
		long result = a + b;
		return result;   // 작업을 마치면 호출한 곳으로 돌아온다.
//		return a + b;    // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
	// 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
//		if(a>b)
//			return a;  // 조건식이 참일 때만 실행
//		else
//			return b;  // 조건식이 거짓일 때만 실행
		return a > b ? a : b;
	}
	// 두 값을 받아서 둘 중에 작은 값을 반환하는 메서드를 작성하시오.
	long min(long a, long b){ 
		return a < b ? a : b;
	}
}