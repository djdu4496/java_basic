package practice.ch04;

public class Ex4_1 {
    public static void main(String[] args) {
        String result = "";
        System.out.print("1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식" + " : ");
        result = "if(10 < x && x < 20)";
        System.out.println(result);

        System.out.print("2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식" + " : ");
        result = "if(!(ch == '' || ch == '\t'))";
        System.out.println(result);

        System.out.print("3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식" + " : ");  // 오타였음
        result = "if(ch == 'x' || ch == ' X')";
        System.out.println(result);

        System.out.print("4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식" + " : ");
        result = "if(48 <= ch && ch <= 57)";
        System.out.println(result);

        System.out.print("5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식" + " : ");
        result = "if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122))";
        System.out.println(result);

        System.out.print("6. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때 true인 조건식" + " : ");
        result = "if((year % 400 == 0 || year % 4 == 0) && (year % 100) != 0))";
        System.out.println(result);

        System.out.print("7. boolean형 변수 powerOn가 false일 때 true인 조건식" + " : ");
        result = "if(!powerOn)";
        System.out.println(result);

        System.out.print("8. 문자열 참조변수 str이 'yes'일 때 true인 조건식" + " : ");
        result = "if(str.equals('yes')";  // 더블스트링인데 컴파일 에러 나서 싱글 스트링으로 표현함
        System.out.println(result);
    }
}
