package com.queue;

public class QueueExample {
    public static void main(String[] args) {
           QueueAlgo queue = new QueueAlgo(10); // queue holds 10 elements
           
           queue.insert(31);
           queue.insert(49);
 
           queue.remove();
           //queue.remove();
           
           System.out.println("********");
           queue.display();
           
           queue.insert(90);
           queue.insert(81);
           queue.insert(72);
           queue.insert(22); // At this point we got to deal with wrapAround, because rear must be pointing to last position.

           System.out.println("********");
           queue.display();
           
           System.out.print("Deleted elements from queue: ");
           System.out.print(queue.remove()+ " ");
           System.out.print(queue.remove()+ " ");
           System.out.print(queue.remove()+ " ");
           System.out.print(queue.remove()+ " ");
           
           System.out.println("\n ********");
           queue.display();
    }
}
 
 
/** OUTPUT
 
 Deleted elements from queue: 90 81 72 22
 
*/
