package ver3.ch11;

import java.util.HashSet;
import java.util.Objects;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");  // 중복이라 저장 안됨

        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))  return false;  // 형변환 가능 여부 확인

        Person p = (Person)obj;
        // 나 자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age==p.age;

    }

    @Override
    public int hashCode() {
        // int hash(Object... valuies);  // 가변인자
        return Objects.hash(name, age);
    }
}

// [실행결과]
// [abc, David:10, David:10] ← 변경 전
// [David:10, abc]           ← 변경 후