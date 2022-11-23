package basic.ch11;

class Test2 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;  // 각 자리수의 합을 저장할 변수 선언
        int a, b, c, d, e;  // 만의 자리, 천의 자리, 백의 자리, 십의 자리, 일의 자리 1은 2의 생성자
        int i = 1;
        while(i <= 10000) {
            int cnt = 0;
            int j = 1;
            while(j <= 10000) {
                a = j / 10000  % 10;
                b = j / 1000 % 10;
                c = j / 100 % 10;
                d = j / 10 % 10;
                e = j % 10;
                sum = a + b + c + d + e;
                if(sum + j == i) {
                    cnt++;
                }
                j++;
            }
            if(cnt == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}