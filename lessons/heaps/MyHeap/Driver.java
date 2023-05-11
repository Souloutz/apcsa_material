public class Driver {

    public static void main(String[] args) {
        MyHeap heap = new MyHeap(10);

        // insert more values into heap
        heap.insert(80);

        heap.printHeap();

        System.out.println(heap.peek());

        // delete some items from the heap
        heap.delete(0);
        heap.printHeap();

        System.out.println(heap.peek());

    }
}