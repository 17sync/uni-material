public class VegPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public VegPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize("Medium");
    }

    @Override
    public void buildCrust() {
        pizza.setCrust("Thin Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato Sauce");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Onions, Capsicum, Olives");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
