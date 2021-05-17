import java.util.PriorityQueue;
 
import java.util.PriorityQueue;
 
public class PriorityQueueMain {
    public static void main (String[] args) {
        // Creating a Priority Queue of String Type
        PriorityQueue<String> pQueue = new PriorityQueue<>() ;
 
        // Adding the items to a Priority Queue (ENQUEUE) using add()
        pQueue.add("Don Quixote") ;
        pQueue.add("The Master and Margarita") ;
        pQueue.add("The Hobbit") ;
        pQueue.add("Dream of the Red Chamber") ;
        pQueue.add("A Tale of Two Cities") ;
        pQueue.add("And Then There Were None") ;
 
        // Removing and printing items from the Priority Queue (DEQUEUE) using remove()
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.remove()) ;
        }
 
    }
}
