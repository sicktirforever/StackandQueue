package Proiecte.StackandQueue;

public class Queue {

    private int[] queue;
    private int head;
    private int tail;

    public Queue(){
        this.queue = new int[5];
        this.head = 0;
        this.tail = 0;

    }
    public int[] getElements(){
        return queue;
    }

    public void printElements(){
        for (int i=head; i<tail; i++){

            System.out.println(queue[i]);
        }
    }

    public void enqueue(int i){
        if (tail < queue.length){
            queue[tail] = i;
            tail++;
        }
        else {
            System.out.println("Too many elements!");
        }
    }

    public  void dequeue(){

        if (head >= 0) {
            queue[head] = 0;
            head++;
        }
        else {
            System.out.println("Empty queue");
        }
    }
}
