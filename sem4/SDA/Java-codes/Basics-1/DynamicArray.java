import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
     
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Add elements to the ArrayList
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(20);

        System.out.println("ArrayList elements: " + dynamicArray);

        // Access elements by index
        System.out.println("Element at index 1: " + dynamicArray.get(1));

        // Insert an element at a specific index
        dynamicArray.add(1, 15);
        System.out.println("ArrayList after insertion: " + dynamicArray);

        // Remove an element
        dynamicArray.remove(Integer.valueOf(20));
        System.out.println("ArrayList after removing 20: " + dynamicArray);
        
        dynamicArray.remove(3);
        System.out.println("ArrayList after removing 3rd index element: " + dynamicArray);
        
        // Check the size of the ArrayList
        System.out.println("Size of ArrayList: " + dynamicArray.size());
    }
}
