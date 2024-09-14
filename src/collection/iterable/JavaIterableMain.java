package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        foreach(set);

    }

    private static void foreach(Iterable<Integer> iterable) {
        // Iterable 인터페이스
        // foreach는 Iterable 인터페이스가 필수기 때문에 범용적으로 사용하기 위해 매개변수를 Iterable로 지정
        System.out.println("iterable = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println("i = " + i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator.getClass() = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
    private static void foreach(Iterator<Integer> iterator) {

    }
}
