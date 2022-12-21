package bootcamp;

import java.util.StringJoiner;

public class MyVector {
    Object[] objArr;  // Q2-1. 객체 배열 Object[] 선언
    int size;         //
    int capacity;

    // Q2-2. 기본생성자 추가
    MyVector() {
        this(16);  // 기존 생성자 호출
    }
    // [질문] 기본생성자 생성하면 capacity가 16인거 아닌가? - 내가 iv 초기화를 안 해서 생긴 문제였음

    // Q2-2. 매개변수 있는 생성자 추가
    MyVector(int capacity) {
        this.capacity = capacity;               // 매개변수 capacity값은 iv에 저장
        objArr = new Object[capacity];          // 변수 objArr에 길이가 capacity인 새로운 객체를 생성하여 저장
//      objArr[0] = null;
//      size=1;
    }

    // Q2-3. 객체의 개수를 저장하기 위한 인스턴스 변수 size를 추가하고 반환
    int size() {
       return size;
    }

    // Q2-3. MyVector클래스의 객체배열 objArr의 길이를 반환
    int capacity() {
        return objArr.length;
    }

    // Q2-3. MyVector클래스의 객체배열 objArr이 비었는지 확인 - size가 0인지 여부를 반환
    boolean isEmpty() {
        return size == 0;
    }

    // Q2-4. MyVector클래스의 객체배열 objArr에 객체를 추가
    // 객체 obj를 마지막에 추가
    // 1. 저장공간이 있나?
        // 1-1. Yes -> (1) 저장
        //             (2) size 변경
        // 1-2. No ->  (1) 저장공간 확보 - capacity 변경
        //             (2) 저장
        //             (3) 저장된 객체 갯수 변경 - size 변경

    void add(Object obj) {
        if(size==capacity) {                                        // 1-2. 저장공간이 없을 때 - 배열을 복사하여 저장공간을 확보한다.
            capacity = objArr.length * 2;                                // 0. MyVector의 용량을 2배로 변경
            Object[] objArr2 = new Object[capacity];                     // 1. 길이가 큰 배열 생성
            for (int i = 0; i < objArr.length; i++) {
                objArr2[i] = objArr[i];
            }                                                            // 2. 기존 배열 내용 복사
            objArr = objArr2;                                            // 3. 참조 변경
        }

        objArr[size++] = obj;                                       // (2) 저장 + (3) size 변경
    }

    // Q2-5. MyVector클래스의 객체배열 objArr에 저장된 객체 반환
    Object get(int index) {
        if(index < 0 || index >= size) {                            // 1. 유효성 검사 - index가 0보다 작거나 size보다 크거나 같을 때
            throw new ArrayIndexOutOfBoundsException("index : " + index);  // 예외를 발생시킨다.
        }
        return objArr[index];                                       // 2. objArr의 index번째 요소 반환
    }

    // Q2-6. MyVector클래스의 객체배열 objArr에 저장된 모든 객체를 문자열로 이어서 반환
    public String toString() {  // StringJoiner 써볼 것
        // first try
//      String str = "";                                            // 1. 문자열 저장 위한 변수 str 선언 및 빈 문자열로 초기화
//      for (int i = 0; i < objArr.length; i++) {                   // 2. 배열 objArr의 길이만큼 반복문 수행
//          str = str + objArr[i];                                      // 2-1. 모든 객체를 문자열로 잇기 위해 str에 i번째 요소를 누적해서 더한다.
//      }
//      return str;                                                 // 3. 문자열 str을 반환한다.


        // second try
        String str = "";                                            // 1. 문자열 저장 위한 변수 str 선언 및 빈 문자열로 초기화
        for (int i = 0; i < objArr.length; i++) {                   // 2. 배열 objArr의 길이만큼 반복문 수행
            if(i == objArr.length - 1)                                  // 2-1. objArr의 마지막 요소일 경우
                str = str + objArr[i];                                      // ","를 포함하지 않고 str에 add()로 저장한 객체를 더해 다시 저장한다.
            else                                                        // 2-2. objArr의 마지막 요소가 아닌 경우
                str = str + objArr[i] + ",";                                // ","를 포함하여 str에 add()로 저장한 객체를 더해 다시 저장한다.
        }

        String[] strArr = str.split(",");                     // 3. 문자열을 ','를 구분자로 나눠서 배열에 저장
        StringJoiner sj =
                new StringJoiner(",", "[", "]"); // 4. ','를 구분자로, []로 감싸서 문자열을 결합한다.
        for(String s : strArr)                                      // 5. 배열 strArr에 대해 향상된 for문 사용
            sj.add(s.toUpperCase());                                    // 5-1. StringJoiner에 문자열을 대문자로 변환하여 추가한다.

        return sj.toString();                                       // 6. 결합한 문자열을 반환한다.
    }

    // Q2-7. MyVector클래스의 객체배열 objArr에서 지정된 객체가 저장되어 있는 위치(index)를 반환
    // feedback1. null일때 테스트
    // feedback2.
    //  if(obj==null){
    //
    //  } else {
    //
    //  }

    int indexOf(Object obj) {
        // first try
//      for (int i = 0; i < objArr.length; i++) {                   // 1. 배열 objArr의 길이만큼 반복문 수행
//          if(obj.equals(objArr[i]))                               // 2. 매개변수로 저장된 객체 obj가 objArr[i]와 일치할 때
//              return i;                                           // 3. 해당 index를 반환한다.
//      }
//      return -1;                                                  // 4. 일치하는 객체가 존재하지 않을 경우 -1 반환


        // 객체가 null인 경우는 두 가지
            // 1. null을 직접 저장한 경우 - NPE가 발생하지 않게 해야 한다.
            // 2. null 객체의 인덱스가 size보다 크거나 같은 경우 - NPE 예외 처리


        // second try
//      for (int i = 0; i < objArr.length; i++) {                   // 1. 배열 objArr의 길이만큼 반복문 수행
//          if (obj.equals(objArr[i])) {                            // 2. 매개변수로 저장된 객체 obj가 objArr[i]와 일치할 때
//              return i;                                           // 3. 해당 index를 반환한다.
//          }
//      }
//      return -1;                                                  // 4. 일치하는 객체가 존재하지 않을 경우 -1 반환


        // third try - NullPointerException이 계속 났던 사연
//      for (int i = 0; i < objArr.length; i++) {                   // 1. 배열 objArr의 길이만큼 반복문 수행
//             if (obj.equals(objArr[i])) {                            // 2. 매개변수로 저장된 객체 obj가 objArr[i]와 일치할 때
//          ➝ if (null.equals(objArr[i])) {                           // 에러!!! null에 메서드를 사용하면 안 된다!
//              if(obj == null) {
//                  return i;
//              }
//               return i;                                           // 3. 해당 index를 반환한다.
//          }
//      }
//      return -1;                                                  // 4. 일치하는 객체가 존재하지 않을 경우 -1 반환

        // fourth try
        for (int i = 0; i < size; i++) {                            // 1. 배열 objArr의 길이만큼 반복문 수행 - i < objArr.length -> size로 변경
            if(objArr[i] == null || obj.equals(objArr[i])) {        // 2. 객체 obj가 null이거나, objArr[i]와 일치하는 경우
                return i;                                           // 3. 해당 index를 반환한다.
            }
        }
        return -1;                                                  // 4. 일치하는 객체가 존재하지 않을 경우 -1 반환
    }

        // Q2-8. objArr에서 지정된 객체를 삭제 - indexOf()를 사용할 것
        // feedback. 자연어로 주석을 다시 수정(추상화x)
    boolean remove(Object obj){

        // first try
//        for (int i = 0; i < objArr.length; i++) {                 // 1. 배열 objArr의 길이만큼 반복문 수행
//            if(obj.equals(objArr[i])) {                           // 2. 매개변수로 저장된 obj 객체가 배열 objArr의 i번째 객체와 일치할 경우
//                objArr[i] = null;                                 // 3. objArr[i]에 null을 저장한다.
//                return true;                                      // 4. 삭제 작업이 완료됐으니 true를 반환한다.
//            }
//        }
//        return false;                                             // 5. 일치하는 객체를 찾지 못한 경우, false를 반환


        // second try
        // 매개변수로 받은 obj 객체가 존재하는지 확인 - indexOf()를 사용
//      if (indexOf(obj) == -1)                                          // 1. 매개변수로 받은 객체의 인덱스가 존재하지 않을 경우
//          return false;                                                   // 1-1. false 반환
//      else {                                                          // 2. 매개변수로 받은 객체의 인덱스가 존재할 경우
//          objArr[indexOf(obj)] = null;                                    // 2-1. 객체 삭제
//          return true;                                                    // 2-2. true 반환
//      }

        // third try
        if (indexOf(obj) == -1)                                          // 1. 매개변수로 받은 객체의 인덱스가 존재하지 않을 경우
            return false;                                                   // 1-1. false 반환
        else {                                                           // 2. 매개변수로 받은 객체의 인덱스가 존재할 경우
            if(indexOf(obj) != size - 1)                                    // 2-1. 마지막 데이터가 아닌 경우
                System.arraycopy(objArr, indexOf(obj) + 1, objArr, indexOf(obj), size - indexOf(obj) - 1);  // 2-1. 삭제할 데이터 아래의 데이터를 한 칸씩 위로 복사해서 삭제할 데이터를 덮어쓴다.
            objArr[size - 1] = null;                                     // 3. 마지막 객체 null로 변경
            size--;                                                      // 4. 데이터 개수가 줄었기 때문에 size 1 감소 처리
            return true;                                                    // 2-2. true 반환
        }

    }

}
