import java.util.*;

// https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

class MyCollections {
  public static void main(String args[]) {
    example_linkedList_string();
  }

  public static void example_linkedList_string() {
    // Create using
    // LinkedList <Data Type> variable = new LinkedList <Data Type>();
    LinkedList<String> workingDays = new LinkedList<String>();

    workingDays.add("Monday");
    workingDays.add("Tuesday");
    workingDays.add("Wednesday");
    workingDays.add("Friday");

    // Add to a specific index
    workingDays.add(3, "Thursday");

    // Iterate over the array list
    Iterator itor = workingDays.iterator();
    System.out.println("\nWorkdays");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

    // function to check whether the value is in ArrayList
    if( workingDays.contains("Saturday") == false) {
      System.out.println("Workdays does not conatin Saturday");
    } else {
      System.out.println("Workdays does conatin Saturday");
    }

    System.out.println("Clearing the array list...");
    workingDays.clear();
    // Iterate over the array list
    itor = workingDays.iterator();
    System.out.println("\nWorkdays");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

  }
}
