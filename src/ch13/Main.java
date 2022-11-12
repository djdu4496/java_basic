package ch13;


import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = "zZa".toUpperCase();  // 소문자로 통일
            System.out.println(s);
            int[] arr = new int[26];  // arr[0] ==65 arr[25] == 0=90

            for(int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 65]++;
            }
            char result = '?';
            int max = -1;

            for(int i = 0; i < 26; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                    result = (char)(i + 65);
                } else if(max == arr[i]) {
                    result = '?';
                }
            }
            System.out.println(result);
    }
}