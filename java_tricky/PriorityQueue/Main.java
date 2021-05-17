import java.util.Comparator;
import java.util.PriorityQueue;
 
class Book {
    String bookName;
    int pages;
 
    public Book(String name, int pages) {
        this.bookName = name;
        this.pages = pages;
    }
 
    @Override
    public String toString() {
        return "Book name is : " + bookName + " and number of pages are :" + pages;
    }
}
 
class byPages implements Comparator<Book> {
    @Override
    public int compare(Book st1, Book st2) {
        return st2.pages - st1.pages;
    }
}
 
public class PriorityQueueMainComparator {
    public static void main(String[] args) {
        byPages comp = new byPages();
        // Adding elements in pQueue using offer, we can also use add()
        PriorityQueue<Book> pQueue = new PriorityQueue<Book>(10, comp);
        pQueue.offer(new Book("A Tale of Two Cities", 322));
        pQueue.offer(new Book("The Master and Margarita", 444));
        pQueue.offer(new Book("Don Quixote", 246));
        pQueue.offer(new Book("And Then There Were None", 342));
        pQueue.offer(new Book("Think and Grow Rich", 401));
        pQueue.offer(new Book("The Hobbit", 276));
        pQueue.offer(new Book("Dream of the Red Chamber", 378));
 
        // Removing the head elements using poll to print in order according to the
        // implemented comparator
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
    }
}
