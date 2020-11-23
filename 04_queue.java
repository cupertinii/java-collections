import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_queue();
  }

  public static void example_queue() {
    // Create using
    // Queue <Data Type> workingDaysInQueue = new Queue <Data Type> ();
    Queue <String> workingDaysInQueue = new LinkedList<String> ();

    workingDaysInQueue.add("Monday");
    workingDaysInQueue.add("Tuesday");
    workingDaysInQueue.add("Wednesday");
    workingDaysInQueue.add("Thursday");
    workingDaysInQueue.add("Friday");

    // Size of the map
    System.out.println("\nWorkday Map Size : " + workingDaysInQueue.size() );

    // In a queue, elements are added at the end
    workingDaysInQueue.add("Saturday");

    // In a queue, elements are removed from the start
    String item = workingDaysInQueue.remove();
    System.out.println("Removed item {" + item + "} from the queue");

    // Accessing elements in a queue
    Iterator itor = workingDaysInQueue.iterator();
    while( itor.hasNext() ){
      System.out.println("Elmenet = " + itor.next() );  
    }
  }
}
