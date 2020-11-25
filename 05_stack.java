import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_stack();
  }

  public static void example_stack() {
    // LIFO = Last In, Fast Out

    // Create using
    // Stack <Data Type> variable = new Stack <String> ();
    Stack <String> workingDaysInStack = new Stack <String> ();

    // Items are added on top
    workingDaysInStack.push("Monday");
    workingDaysInStack.push("Tuesday");
    workingDaysInStack.push("Wednesday");
    workingDaysInStack.push("Thursday");
    workingDaysInStack.push("Friday");

    // Size of the map
    System.out.println("\nWorkday Stack Size : " + workingDaysInStack.size() );

    // In a Stack, elements are added at the top
    workingDaysInStack.push("Saturday");

    // In a Stack, elements are removed from the top
    String item = workingDaysInStack.pop();
    System.out.println("Removed item {" + item + "} from the queue");

    // Accessing elements in a queue
    Iterator itor = workingDaysInStack.iterator();
    while( itor.hasNext() ){
      System.out.println("Elmenet = " + itor.next() );
    }
  }
}
