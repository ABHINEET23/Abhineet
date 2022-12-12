/ Java Code to sort Map by key value
import java.util.*;
class GFG {
 
    // This map stores unsorted values
    static HashMap<Integer, String> m = new HashMap<>();
 
    // Function to sort map by Key
    public static void sortMapByKey()
    {
        ArrayList<Integer> sortKeys
            = new ArrayList<Integer>(m.keySet());
 
        Collections.sort(sortKeys);
 
        // Getting value for each key and displaying
        // results.
        for (Integer x : sortKeys)
            System.out.println("Key = " + x
                               + ", Value = " + m.get(x));
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        m.put(4, "pune");
        m.put(7, "mumbai");
        m.put(2, "nashik");
        m.put(3, "indore");
        m.put(4, "jaipur");
 
        // Calling the function to sortMapByKey to
        // perform sorting based on keys
        sortMapByKey();
    }
}