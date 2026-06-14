
public class CounterMain {

	public static void main(String[] args) {
		 Counter c1 = new Counter();
	     Counter c2 = new Counter();
	     Counter c3 = new Counter();

	     // Access the static variable using the class name
	     System.out.println("Number of objects created: " + Counter.getCount());

	}

}
