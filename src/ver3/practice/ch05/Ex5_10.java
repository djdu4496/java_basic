package ver3.practice.ch05;

// 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다. (1)에 알맞은 코드를 넣어 완성하시오.

public class Ex5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {
                        '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}',
                        ';', ':', ',', '.', '/'
                };
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for(int i=0; i< src.length(); i++) {
            char ch = src.charAt(i);

            // (1) 알맞은 코드를 넣어 완성하시오.
            // 1. 변환
            if('0' <= ch && ch <= '9')
                result += numCode[ch-48]; // 2. '0'이 48이기 때문에 ch - 48은 numCode의 인덱스가 된다.
            else if('a' <= ch && ch <= 'z')
                result += abcCode[ch-97]; // 2. 'a'이 97이기 때문에 ch - 97은 abcCode의 인덱스가 된다.
        }

        System.out.println("src:" + src);
        System.out.println("result:" + result);
    }
}
