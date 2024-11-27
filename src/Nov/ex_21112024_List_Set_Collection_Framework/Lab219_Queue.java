package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.PriorityQueue;

public class Lab219_Queue {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        //first in first out
        pq.offer("1");
        pq.offer("2");
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
