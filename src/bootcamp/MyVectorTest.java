package bootcamp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyVectorTest {
    MyVector v = new MyVector();

    @Test
    public void sizeTest() {
        assertTrue(v.size()==0);
    }

    @Test
    public void capacityTest() { // 모르겠음
        assertTrue(v.capacity==0);
    }

    @Test
    public void isEmptyTest() {
        assertTrue(v.isEmpty());
    }

    @Test
    public void addTest() {
        v.add("1");
        assertTrue(v.get(0).equals("1"));
    }

    @Test
    public void getTest() {
        v.add("1");
        assertTrue(v.get(0).equals(v.objArr[0]));
    }

    @Test
    public void toStringTest() {
        v.add("1");
        System.out.println(v.toString());
    }

    @Test
    public void indexOf() {

    }

    @Test
    public void remove() {
    }
}