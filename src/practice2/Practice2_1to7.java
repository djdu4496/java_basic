package practice2;

public class Practice2_1to7 {
	public static void main(String[] args) {
		/*
		 * 2-1. 다음 표의 빈칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		 *		논리형 - boolean(1byte)
		 *		문자형 - char(2byte)
		 *		정수형 - byte, short(2byte), int(4byte), long(8byte)
		 *		실수형 - float(4byte), double(8byte)
		 *
		 * 2-2. 다음 중 키워드가 아닌 것은?(모두 고르시오)
		 * 		True, NULL, Class, System(클래스)
		 * 
		 * 2-3. char타입(2byte)의 변수에 저장될 수 있는 정수 값의 범위는?(10진수로 적으시오)
		 * 		0(최소값) ~ 65535(최대값)
		 * 
		 * 2-4. 다음 중 변수를 잘못 초기화한 것은?
		 * 		byte b = 256;        // 에러. byte타입의 값의 범위 : 0 ~ 2^8 - 1 == 0 ~ 255
		 * 		char c = '';         // 에러. '' 안에 반드시 하나의 문자가 필요
		 *      char answer = 'no';  // 에러. 문자열 타입의 값은 String 리터럴로 저장해야 한다. String answer = "no";
		 *      float f = 3.14;      // 에러. 큰 크기의 타입 3.14d(3.14)을 작은 크기의 타입 float형 변수에 저장할 수 없다.
		 *      
		 * 2-5. 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		 * 		int i = 100;
		 * 		long l = 100L;
		 * 		final float PI = 3.14f;
		 * 
		 * 		- 리터럴 : 100, 100L, 3.14f
		 * 		- 키워드 : int, long, final, float
		 * 		- 변수    : i, l
		 *      - 상수    : PI
		 *      
		 * 2-6. 다음 중 기본형(primitive type)이 아닌 것은?
		 * 		Byte     // X. byte 이다.
		 * 
		 * 2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 '오류'라고 적으시오.
		 * 		1 System.out.print.ln("1" + "2")   -> (  "12"  )
		 * 		2 System.out.print.ln(true + "")   -> ( "true" )
		 * 		3 System.out.print.ln('A' + 'B')   -> (  131   )
		 * 		4 System.out.print.ln('1' + 2)     -> (   51   )
		 * 		5 System.out.print.ln('1' + '2')   -> (   99   )
		 * 		6 System.out.print.ln('J' + "ava") -> ( "Java" )
		 * 		7 System.out.print.ln(true + null) -> (   오류    )
		 * 
		 *      참고. 문자 '0'의 아스키코드는 48이고, 문자 'A'의 아스키코드는 65이죠.
		 * */
		System.out.println(true + "");
	}
}
