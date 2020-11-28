import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_hashMap();
  }

  public static void example_hashMap() {
    // Create using
    Hashtable <String, String> workingDaysMap = new Hashtable<String, String>(); 

    workingDaysMap.put("Day-1", "Monday");
    workingDaysMap.put("Day-2", "Tuesday");
    workingDaysMap.put("Day-3", "Wednesday");
    workingDaysMap.put("Day-4", "Thursday");
    workingDaysMap.put("Day-5", "Friday");

    // Size of the map
    System.out.println("\nWorkday Map Size : " + workingDaysMap.size() );

    // Get value of key using get function
    System.out.println("\nWeekday #2 is " + workingDaysMap.get("Day-2") );

    workingDaysMap.putIfAbsent("Day-3", "Saturday");

    // Existence
    if( workingDaysMap.containsKey("Day-3") == true) {
      System.out.println("\nDay-3 value is " + workingDaysMap.get("Day-2") );
    } else {
      System.out.println("\nDay-3 doesn't exist" );
    }

    // iterating

      // All values
      System.out.println( "\nAll Values :" );
      Collection valueCollection = workingDaysMap.values();
      System.out.println( valueCollection );

      // All Keys
      System.out.println( "\nAll Keys :" );
      Collection keys = workingDaysMap.keySet();
      System.out.println( keys );

  }
}
