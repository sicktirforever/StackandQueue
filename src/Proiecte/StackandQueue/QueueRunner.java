package Proiecte.StackandQueue;

public class QueueRunner {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(4);
        queue.enqueue(14);
        queue.enqueue(0);
        queue.enqueue(12);
        queue.enqueue(0);

        queue.dequeue();
        queue.dequeue();

        queue.printElements();

    }
}
