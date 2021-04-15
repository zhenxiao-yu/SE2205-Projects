public class ArrayQueueDemo {
      public static void main(String[] args) {
                ArrayQueue queue = new ArrayQueue(10);
                queue.enqueue("A");
                queue.enqueue("B");
                queue.enqueue("C");
                queue.enqueue("D");
                queue.enqueue("E");
                queue.dequeue();
                queue.dequeue();
                queue.enqueue("F");
                queue.enqueue("G");
                queue.print();
      }          
}
