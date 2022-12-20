package bootcamp.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.Vector;

// 1. 이상한 값 넣어보고, 어떻게 동작하는지 확인을 해보자. - 음수값, 엄청 많은 값
// 2. 잔인하게 테스트해야 한다.
public class VectorTest {

    Vector v = new Vector(5);  // 용량(capacity)이 5인 Vector를 생성한다.
//  MyVector v = new MyVector();

    @Test(expected=ArrayIndexOutOfBoundsException.class)  // 예외가 발생해야 통과된다.
    public void getTest() {  // java.lang.AssertionError: Expected exception: java.lang.ArrayIndexOutOfBoundsException
        assertTrue(v.size()==0);
        assertTrue(v.get(0)==null);  // java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 0

        v.clear();
        v.add("1");
        assertTrue(v.get(0).equals("1"));

        v.clear();
        assertTrue(v.size()==0);

        assertTrue(v.get(-1)==null);

        v.clear();
        int i = 10000;
        assertTrue(v.get(i).equals(i+""));
    }

    @Test(expected= NullPointerException.class)
    public void addTest() {
        assertTrue(v.size()==0);
        v.add("1");
        assertTrue(v.contains("1"));

        v.clear();
        v.add(null);
        assertTrue(v.get(0).equals(null));

        for(int i = 0; i < 10000; i++)
            v.add(i);
        assertTrue(v.size()==10000);
    }

    @Test
    public void sizeTest() {
        assertTrue(v.size()==0);

        v.add("1");
        assertTrue(v.size()==1);

        v.clear();
        assertTrue(v.size()==0);

        for(int i = 0; i < 10000; i++)
            v.add(i);
        System.out.println(v.size());
        assertTrue(v.size()==10000);
    }

    @Test
    public void capacityTest() {
        v.clear();
        assertTrue(v.capacity()==5);
    }

    @Test
    public void ensureCapacityTest() {
        v.clear();
        v.ensureCapacity(10); // 컬렉션의 용량을 5에서 10으로 변경
        assertTrue(v.capacity()==10);
    }

    @Test
    public void isEmptyTest() {
        v.clear();
        v.add("1");

        v.clear();
        assertTrue(v.isEmpty()==true);
    }

    @Test
    public void indexOfTest() {
        v.clear();

        v.add("1");
        assertTrue(v.indexOf("1")==0);

    }

    @Test
    public void removeTest() {
        v.clear();
        v.add("1");
        v.add("2");
        v.add("3");
        v.remove("1");
        v.remove("2");
        v.remove("3");
        assertTrue(v.size()==0);
//        v.remove(null);
    }
}
