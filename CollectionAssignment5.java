import java.util.*;  
public class VectorSortExample1 {    
    public static void main(String arg[]) {   
        //Create an empty vector   
        Vector<Integer> vec = new Vector<>();  
        //Add elements in the vector  
        vec.add(1);  
        vec.add(5);  
        vec.add(2);  
        vec.add(4);  
        vec.add(3);  
        //Display the vector elements  
        System.out.println("Components of the vector: "+vec);        
          //Sorting the vector  
          Collections.sort(vec);  
          //Displaying the vector elements after sort() method  
          System.out.println("Components of the vector after sorting: "+vec);                             
          }  
}  