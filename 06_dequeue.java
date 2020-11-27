import java.util.*;

// double ended queue
// Pronounced as "Deck"
// Allow insertion and removal from both the ends
// 
class MyCollections {
  public static void main(String args[]) {
    example_queue();
  }

  public static void example_queue() {
    // Create using
    // Deque <Data Type> workingDaysInQueue = new List <Data Type> ();
    Deque <String> workingDaysInDeque = new LinkedList<String> ();

    workingDaysInDeque.add("Monday");
    workingDaysInDeque.add("Tuesday");
    workingDaysInDeque.add("Wednesday");
    workingDaysInDeque.add("Thursday");
    workingDaysInDeque.add("Friday");

    // Size of the dequeue
    System.out.println("\nWorkday DQ Size : " + workingDaysInDeque.size() );

    // In a dequeue, elements are added at the end
    workingDaysInDeque.add("Saturday");

    // In a dequeue, elements are removed from the start
    String item = workingDaysInDeque.remove();
    System.out.println("Removed item {" + item + "} from the DQ");

    // Accessing elements in a queue
    System.out.println("\nIterator : ");
    Iterator itor = workingDaysInDeque.iterator();
    while( itor.hasNext() ){
      System.out.println("Element = " + itor.next() );
    }

    // Another way to access elements in a dequeue
    System.out.println("\nforEach : ");
    workingDaysInDeque.forEach( element -> {
      System.out.println("Element = " + element );
    });
  }
}
