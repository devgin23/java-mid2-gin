package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProccessor batchProccessor = new BatchProccessor(list);

        batchProccessor.logic(10_000_000);
    }
}
