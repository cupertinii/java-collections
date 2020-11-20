import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_hashset_string();
  }

  public static void example_hashset_string() {
    // Create using
    // HashSet <Data Type> variable = new HashSet <Data Type>();
    HashSet<String> workingDaysSet = new HashSet <String>();

    workingDaysSet.add("Monday");
    workingDaysSet.add("Tuesday");
    workingDaysSet.add("Wednesday");
    workingDaysSet.add("Thursday");
    workingDaysSet.add("Friday");

    // Iterate over the array list
    Iterator itor = workingDaysSet.iterator();
    System.out.println("\nWorkday Set");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

  }
}
