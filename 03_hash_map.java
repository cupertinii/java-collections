import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_hashMap();
  }

  public static void example_hashMap() {
    // Create using
    // HashMap <Key_dataType, Value_dataType> variable = new HashMap <Key_dataType, Value_dataType> ();
    HashMap <String, String> workingDaysMap = new HashMap <String, String> ();

    workingDaysMap.put("Day-1", "Monday");
    workingDaysMap.put("Day-2", "Tuesday");
    workingDaysMap.put("Day-3", "Wednesday");
    workingDaysMap.put("Day-4", "Thursday");
    workingDaysMap.put("Day-5", "Friday");

    // Size of the map 
    System.out.println("\nWorkday Map Size : " + workingDaysMap.size() );

    // Get value of key using get function
    System.out.println("\nWeekday #2 is " + workingDaysMap.get("Day-2") );

  }
}
