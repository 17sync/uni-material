public class Main {
    public static void main(String[] args) {

        // Build Veg Pizza
        PizzaBuilder vegBuilder = new VegPizzaBuilder();
        PizzaDirector director1 = new PizzaDirector(vegBuilder);
        Pizza vegPizza = director1.makePizza();
        System.out.println(vegPizza);

        // Build Non-Veg Pizza
        PizzaBuilder nonVegBuilder = new NonVegPizzaBuilder();
        PizzaDirector director2 = new PizzaDirector(nonVegBuilder);
        Pizza nonVegPizza = director2.makePizza();
        System.out.println(nonVegPizza);
    }
}
