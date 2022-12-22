package bootcamp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyVectorTest {
    MyVector v = new MyVector();                                // MyVector클래스의 객체를 생성, 기본 생성자로 인스턴스 초기화

    @Test
    public void sizeTest() {                                    // Test 1. 추가된 객체가 없을 때, size가 0인지 테스트
        assertTrue(v.size==0);                              // 1. 추가된 객체가 없을 때, size가 0인지 테스트
        v.add("1");                                             // Test 2. add()를 사용하여 객체를 추가했을 때, size값도 같이 증가하는지 테스트
        assertTrue(v.size==1);                              // 2. 객체를 한 개 추가했을 때, size값도 1 늘어나는지 테스트
    }

    @Test
    public void capacityTest() {                                // Test 1. 객체를 배열 objArr의 길이 이상 추가했을 때, 저장공간이 자동으로 확보되는지 여부 테스트
        assertTrue(v.capacity==16);                         // 1. MyVector클래스의 객체 생성 이후, 인스턴스가 초기화 되었을 때, capacity가 16인지 테스트
        for (int i = 0; i < v.objArr.length; i++) {                 // 1. capacity + 1 만큼 반복문 수행
            v.add((i + 1) + "");                                    // 2. add()를 사용하여 배열 objArr의 길이만큼 객체를 저장
        }                                                               // [질문] 반복문 안에 길이를 v.objArr.length + 1로 하면 왜 무한 루프가 발생하나요?
        v.add("17");                                                // 3. add()를 사용하여 특정 객체 추가
        assertTrue(v.capacity == 32);                       // 4. 더 이상의 저장공간이 없을 때, 용량을 자동으로 확보해주는지 여부 테스트
    }

    @Test
    public void isEmptyTest() {                                 // Test 1. 배열 objArr에 저장된 객체가 없을 때 isEmpty()가 true를 반환하는지 여부 테스트
        assertTrue(v.size == 0);                            // 1. 저장된 객체가 하나도 없는지 여부 테스트
        assertTrue(v.isEmpty());                                    // 2. 저장된 객체가 하나도 없을 때, isEmpty()가 false를 반환하는지 테스트
                                                                // Test 2. 배열 objArr에 저장된 객체가 있을 때 isEmpty()가 false를 반환하는지 여부 테스트
        v.add("1");                                                 // 1. add()를 사용하여 특정 객체 추가
        assertTrue(v.size > 0);                             // 2. 저장된 객체가 하나 이상인지 테스트
        assertTrue(!v.isEmpty());                                   // 3. 저장된 객체가 하나 이상일 때, v.isEmpty()가 false를 반환하는지 테스트
    }

    @Test
    public void addTest() {                                     // Test 1. 객체를 추가했을 때, 해당 index에 객체가 제대로 저장되었는지 테스트
        for (int i = 0; i < v.objArr.length; i++) {                 // 1. 배열 objArr의 길이만큼 반복문 수행
            v.add((i + 1) + "");                                    // 2. add()를 사용하여 배열 objArr의 길이만큼 객체를 저장
            assertTrue(v.objArr[v.size - 1].equals((i + 1) + ""));  // 3. add메서드의 인자로 지정된 객체와 objArr의 index번째 요소가 일치하는지 equals()를 사용하여 테스트
        }
                                                                // Test 2. 객체를 추가했을 때, 해당 index에 객체가 제대로 저장되었는지 테스트
        v.add("17");                                                // 1. 특정 객체 "17" 추가
        assertTrue(v.objArr[v.size - 1].equals("17"));              // 2. 추가된 객체를 get()으로 반환한 값과 objArr의 index번째 요소 일치 여부 테스트
        assertTrue(v.capacity == 32);                       // 3. 더 이상의 저장공간이 없을 때, 용량을 자동으로 확보해주는지 여부 테스트
    }

    @Test
    public void getTest() {                                     // Test 1. 객체를 추가했을 때, 해당 index에 저장된 객체 반환 여부 테스트
        for (int i = 0; i < v.objArr.length; i++) {                 // 1. 배열 objArr의 길이만큼 반복문 수행
            v.add((i + 1) + "");                                    // 2. add()를 사용하여 배열 objArr의 길이만큼 객체를 저장
            assertTrue(v.get(i).equals(v.objArr[i]));               // 3. 추가된 객체를 get()으로 반환한 값과 objArr의 index번째 요소가 일치하는지 equals()를 사용하여 테스트
        }
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void getExceptionTest() {
        assertTrue(v.get(-1)==null);                   // Test 1. 존재할 수 없는 인덱스 objArr[-1]에 대해 예외가 발생하는지 테스트
        assertTrue(v.get(10000)==null);                // Test 2. 존재할 수 없는 인덱스 objArr[10000]에 대해 예외가 발생하는지 테스트
    }

    @Test
    public void toStringTest() {                               // Test 1. toString()값과 직접 객체를 이은 값이 일치하는지 여부 테스트
        // first try
//        String str = "";                                           // 1. 문자열 저장 위한 변수 str 선언 및 빈 문자열로 초기화
//        for (int i = 0; i < v.objArr.length; i++) {                // 2. 배열 objArr의 길이만큼 반복문 수행
//            v.add(i + 1 + "");                                     // 3. add()를 사용하여 배열 objArr의 길이만큼 객체를 저장
//            str += i + 1 + "";                                     // 4. str에 add()로 저장한 객체를 더해 다시 저장한다.
//        }
//        assertTrue(v.toString().equals(str));                      // 5. str과 v.toString()의 반환값이 일치하는지 equals()를 사용하여 테스트

        // second try                                          // Test 1. toString()값과 직접 객체를 이은 값이 일치하는지 여부 테스트
        String str = "[";                                          // 1. 문자열 str 선언 및 "["으로 초기화
        for (int i = 0; i < v.objArr.length; i++)                  // 2. 배열 objArr의 길이만큼 반복문 수행
            v.add(i + 1 + "");                                     // 3. add()를 사용하여 배열 objArr의 길이만큼 객체를 저장

        for (int i = 0; i < v.size; i++) {
            if(i == v.size - 1)                                    // 4. 배열 objArr의 마지막 요소인 경우
                str += i + 1 + "";                                     // 4-1. ","를 포함하지 않고 str에 add()로 저장한 객체를 더해 다시 저장한다.
            else
                str += i + 1 + ",";                                    // 4-2. ","를 포함하여 str에 add()로 저장한 객체를 더해 다시 저장한다.
        }
        str = str +  "]";                                          // 5. str에 배열의 끝을 알리는 대괄호 "]"를 추가한다.
        assertTrue(v.toString().equals(str));                      // 6. v.toString()의 반환값과 str이 일치하는지 여부를 테스트한다.
    }

    @Test
    public void indexOfTest() {
                                                               // Test 1. indexOf()를 사용하여 저장한 객체의 인덱스를 반환할 수 있는지 여부 테스트
        for (int i = 0; i < v.objArr.length; i++) {                // 1. 배열 objArr의 길이만큼 반복문 수행
            v.add(i + 1 + "");                                     // 2. add()를 사용하여 배열 objArr의 길이만큼 객체를 저장
            assertTrue(v.indexOf(i + 1 + "") == i);        // 3. indexOf(Obj obj)가 저장된 객체의 인덱스를 반환하는지 테스트한다
        }

        assertTrue(v.indexOf("20") == -1);             // Test 3. 존재하지 않은 객체에 대해 indexOf()를 사용하면 -1을 반환하는지 테스트
    }

    @Test
    public void indexOfNPETest() {                        // Test 1. indexOf()를 사용하여 null을 저장한 객체의 인덱스를 반환할 수 있는지 여부 테스트
        v.add(null);                                               // 1. add()를 사용하여 배열 objArr에 null 객체를 저장
        v.add(null);                                               // 1. add()를 사용하여 배열 objArr에 null 객체를 저장
        v.add(null);                                               // 1. add()를 사용하여 배열 objArr에 null 객체를 저장
        assertTrue(v.indexOf(null) == 0);                  // 2. null객체의 인덱스가 0인지 확인
    }

    @Test
    public void removeTest() {                                 // Test 1. remove()를 사용하여 저장한 객체를 삭제할 수 있는지 테스트
        v.add("1");                                                // 1. "1", "2", "3", "4", "5" 객체를 add()를 사용하여 저장
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");

        assertTrue(v.size == 5);                           // 3. 객체 삭제 전 저장된 객체 갯수 확인
        assertTrue(v.remove("2")==true);               // 4. objArr[1]을 삭제 - 수행 여부 테스트
        assertTrue(v.size == 4);                           // 5. 객체 삭제 후 저장된 객체 갯수 확인
    }

    @Test
    public void removeTest2() {                          // Test 1. remove()를 사용하여 저장한 객체를 삭제할 수 있는지 테스트
        for (int i = 0; i < v.objArr.length; i++)                 // 1. 배열 objArr의 길이만큼 반복문 수행
            v.add(i + 1 + "");                                    // 2. add()를 사용하여 배열 objArr의 길이만큼 객체를 저장

        assertTrue(v.size == 16);                         // 3. 객체 삭제 전 저장된 객체 갯수 확인
        assertTrue(v.remove("2"));                            // 4. objArr[1]을 삭제 - 수행 여부 테스트
        assertTrue(v.size == 15);                         // 5. 객체 삭제 후 저장된 객체 갯수 확인
    }

    @Test
    public void removeTest3() {                          // Test 2. 존재하지 않는 객체에 대해 remove()를 사용했을 때 false를 반환하는지 테스트

        assertTrue(!v.remove("10qwdqwdwqd"));
    }
}