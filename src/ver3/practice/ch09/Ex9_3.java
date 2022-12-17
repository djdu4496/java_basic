package ver3.practice.ch09;

// 다음과 같은 실행결과가 나오도록 코드를 완성하시오.

public class Ex9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        // (1) 알맞은 코드를 넣어 완성하시오.

        // first try
        // substring() 사용해서 쪼개볼까
//        path = fullPath.substring(0, 14);
//        fileName = fullPath.substring(14);

        // second try
//        String[] arr = fullPath.split("\\\\", 4);  // 검색 결과 : 정규표현식에서 역슬래시를 나타내려면 두 개("\\ + \\") 사용한다)
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[" + i + "] : " + arr[i]);
//        }
//        path = arr[0] + "\\" + arr[1] + "\\" +  arr[2];
//        fileName = arr[3];
        // third try - lastIndexOf() 사용
        path = fullPath.substring(0, fullPath.lastIndexOf('P') - 1);
        fileName = fullPath.substring(fullPath.lastIndexOf('\\') + 1);

        System.out.println("fullPath:" + fullPath);
        System.out.println("path:" + path);
        System.out.println("fileName:" + fileName);
    }
}

// [실행결과]
// fullPath:c:\jdk1.8\work\Path\SeparateTest.java
// path:c:\jdk1.8\work
// fileName:PathSeparateTest.java