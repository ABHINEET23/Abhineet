// Java Program to remove the duplicate entries from
// collection using LinkedHashSet
  
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
  
class GFG {
    public static void main(String[] args)
    {
        // making the collection object
        Collection<String> collection = new ArrayList<>();
  
        // adding the elements to the collection
        collection.add("Abhineet");
        collection.add("Stays");
        collection.add("In");
        collection.add("Pune");
        collection.add("Viman Nagar");
        collection.add("2021");
        collection.add("2021");
  
        // Displaying the collection elements
        System.out.println(
            "Displaying the initial collection\n");
        System.out.println(collection);
  
        // LinkedHashSet for deleting duplicate entries
        // in the collection by passing collection
        // in the constructor of the HashSet
        LinkedHashSet<String> hashSet
            = new LinkedHashSet<>(collection);
  
        // Displaying the HashSet
        System.out.println("\nDisplaying the HashSet\n");
        System.out.println(hashSet);
  
        // clearing all the elements of the collection
        collection.clear();
  
        // adding all the elements back
        // to the collection from HashSet
        collection.addAll(hashSet);
		
		collection.sort(al, collection.reverseOrder()); // to sort in descending order
  
        // Displaying the collection
        System.out.println(
            "\nDisplaying the collection after deleting duplicates entries\n");
        System.out.println(collection);
    }
}