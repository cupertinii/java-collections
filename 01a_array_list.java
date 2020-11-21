import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_arrayList_string();
    example_arrayList_int();
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

  public static void example_arrayList_int() {
    ArrayList<Integer> scores = new ArrayList<Integer>();

    scores.add(10);
    scores.add(20);
    scores.add(20);
    scores.add(10);

    Iterator itor = scores.iterator();
    System.out.println("\nScores");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

  }
}
