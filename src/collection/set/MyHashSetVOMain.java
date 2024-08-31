package collection.set;

public class MyHashSetVOMain {

    public static void main(String[] args) {
        MyHashSetVO set = new MyHashSetVO();
        set.add(1); //O(1)
        set.add(2); //O(n)
        set.add(3); //O(n)
        set.add(4); //O(n)
        set.add(5); //O(n)
        System.out.println(set);

        boolean result = set.add(4);// 중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(99) = " + set.contains(99));
    }
}
