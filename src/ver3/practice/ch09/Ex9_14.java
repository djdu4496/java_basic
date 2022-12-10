package ver3.practice.ch09;
// 다음은 화면으로부터 전화번호의 일부를 입력받아 일치하는 전화번호를 주어진 문자열 배열에서 찾아서 출력하는 프로그램이다.
// 알맞은 코드를 넣어 프로그램을 완성하시오.
// [Hint] Pattern, Matcher클래스를 사용할 것

import java.util.*;
import java.util.regex.*;  // Pattern과 Matcher가 속한 패키

public class Ex9_14 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print(">>");
            String input = s.nextLine().trim();

            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }
                Pattern p = Pattern.compile("(0\\d{1,2})-(\\d{3,4})-(\\d{4})");
                for (int i = 0; i < phoneNumArr.length; i++) {
                    Matcher m = p.matcher(phoneNumArr[i]);
                    if(m.matches() && phoneNumArr[i].contains(input)) {
                        list.add(phoneNumArr[i]);
                    }
                }

            /*
                (1) 알맞은 코드를 넣어 완성하시오.
            */


            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    }
}

// [실행결과]
// >>
// >>
// >>asdf
// 일치하는 번호가 없습니다.
// >>
// >>
// >>0
// [012-3456-7890, 099-2456-7980, 088-2346-9870, 013-3456-7890]
// >>234
// [012-3456-7890, 088-2346-9870]
// >>7890
// [012-3456-7890, 013-3456-7890]
// >>q

// 비고
// 234를 입력하면 '2-34'는 234로 인지를 못 하고 번호 하나만 출력한다.