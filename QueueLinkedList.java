// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
import java.util.Queue;
import java.util.List.*;


public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        enqueue(queue, 17);
        enqueue(queue, 12);
        enqueue(queue, 22);
        enqueue(queue, 7);
        System.out.println(queue);
        int elem = dequeue(queue);
        System.out.println(elem);
        System.out.println(queue);
        int elem2 = first(queue);
        System.out.println(elem2);
        System.out.println(queue);
    }
    
    public static void enqueue(Queue<Integer> queue, int item) {
        queue.add(item);
    }

    public static int dequeue(Queue<Integer> queue){
        int elem = ((LinkedList<Integer>) queue).getFirst();
        ((LinkedList<Integer>) queue).pollFirst();
        return elem;
    }

    public static int first(Queue<Integer> queue) {
        return ((LinkedList<Integer>) queue).getFirst();
    }
}
