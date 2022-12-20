package bootcamp;

public class MyVector {
    Object[] objArr;  // Q2-1. 객체 배열 Object[] 선언
    int size;         //
    int capacity;

    // Q2-2. 기본생성자 추가 [질문] 기본생성자 생성하면 capacity가 16인거 아닌가?
    MyVector() {
        this(16);  // 기존 생성자 호출
    }

    // Q2-2. 매개변수 있는 생성자 추가
    MyVector(int capacity) {
        objArr = new Object[capacity];  // 변수 objArr에 길이가 capacity인 새로운 객체를 생성하여 저장
    }

    // Q2-3. 객체의 개수를 저장하기 위한 인스턴스 변수 size를 추가하고 반환
    int size() {
       return size;
    }

    // Q2-3. MyVector클래스의 객체배열 objArr의 길이를 반환
    int capacity() {
        return objArr.length;
    }

    // Q2-3. MyVector클래스의 객체배열 objArr이 비었는지 확인
    boolean isEmpty() {
        return size == 0;
    }

    // Q2-4. MyVector클래스의 객체배열 objArr에 객체를 추가
    void add(Object obj) {
        if(isEmpty())
            objArr[0] = obj;
        else
            objArr[size - 1] = obj;
    }

    // Q2-5. MyVector클래스의 객체배열 objArr에 저장된 객체 반환
    Object get(int index) {
        // 1. 유효성 검사 - index가 0보다 작거나 size보다 크거나 같을 때
        if(index < 0 || index >= size) {
            // 예외를 발생시킨다.
            throw new ArrayIndexOutOfBoundsException("index : " + index);
        }
        // 2. objArr의 index번째 요소 반환
        return objArr[index];
    }

    // Q2-6. MyVector클래스의 객체배열 objArr에 저장된 모든 객체를 문자열로 이어서 반환
    public String toString() {
        String str = "[";
        for (int i = 0; i < objArr.length; i++) {
            str = str + objArr[i] + ", ";
        }
        str = str + "]";
        return str;
    }

    // Q2-7. MyVector클래스의 객체배열 objArr에서 지정된 객체가 저장되어 있는 위치(index)를 반환
    int indexOf(Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if(obj.equals(objArr[i]))
                return i;
        }
        return -1;
    }

    // Q2-8. objArr에서 지정된 객체를 삭제
    boolean remove(Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if(obj.equals(objArr[i])) {
                objArr[i] = null;
                return true;
            }
        }
        return false;
    }
}
