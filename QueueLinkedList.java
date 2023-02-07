// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List.*;


public class QueueLinkedList {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        enqueue(queue, 17);
        enqueue(queue, 12);
        enqueue(queue, 22);
        enqueue(queue, 2);
        enqueue(queue, 33);
        System.out.println(queue);
        System.out.println(dequeue(queue));
        System.out.println(queue);
        System.out.println(first(queue));
    }
    
    public static void enqueue(Queue<Integer> queue, int item) {
        queue.add(item);
    }

    public static Integer dequeue(Queue<Integer> queue){
        for (Iterator<Integer> i = queue.iterator(); i.hasNext();) {
            Integer number = i.next();
            if(number != null){
                queue.remove();
                return number;
            }
        }
        return null;
    }

    public static int first(Queue<Integer> queue) {
        return queue.peek();
    }
}
