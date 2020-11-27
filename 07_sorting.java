import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_arrayList_string();
  }

  public static void example_arrayList_string() {
    // Create using
    // ArrayList <Data Type> variable = new ArrayList <Data Type>();
    ArrayList<String> workingDays = new ArrayList<String>();

    workingDays.add("Monday");
    workingDays.add("Tuesday");
    workingDays.add("Wednesday");
    workingDays.add("Friday");

    // Add to a specific index
    workingDays.add(3, "Thursday");

    // Iterate over the array list
    Iterator itor = workingDays.iterator();
    System.out.println("\nUnorted Workdays");
    while( itor.hasNext() ) {
      System.out.println(" - " + itor.next() );
    }

    // SORTING
    Collections.sort(workingDays);

    // Iterate over the array list
    itor = workingDays.iterator();
    System.out.println("\nSorted Workdays");
    while( itor.hasNext() ) {
      System.out.println(" - " + itor.next() );
    }

  }
}
