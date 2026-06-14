public class PizzaDirector {

    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makePizza() {
        builder.buildSize();
        builder.buildCrust();
        builder.buildSauce();
        builder.buildToppings();
        return builder.getPizza();
    }
}
