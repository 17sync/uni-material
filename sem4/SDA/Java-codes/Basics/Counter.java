
public class Counter {
    // Static variable
    static int count = 0;

    // Constructor increments the static variable
    Counter() {
        count++; // Increment the static count when an object is created
    }

    // Static method to get the current count
    public  static int getCount() {
        return count;
    }
}
