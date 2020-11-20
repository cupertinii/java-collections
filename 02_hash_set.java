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
    workingDaysSet.add("Saturday");

    // Iterate over the array list
    Iterator itor = workingDaysSet.iterator();
    System.out.println("\nWorkday Set Size : " + workingDaysSet.size() );
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

    // Check item is in hashset or not
    if(workingDaysSet.contains("Saturday")==true) {
      System.out.println("Saturday is in workingDaysSet" );
    } else {
      System.out.println("Saturday is not in workingDaysSet" );
    }

    // Check item is in hashset or not
    if(workingDaysSet.contains("Saturday")==true) {
      System.out.println("Removing Saturday from workingDaysSet" );
      workingDaysSet.remove("Saturday");
    }

  }
}
