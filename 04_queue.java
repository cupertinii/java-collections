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
  }
}
