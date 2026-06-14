public class NonVegPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public NonVegPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize("Large");
    }

    @Override
    public void buildCrust() {
        pizza.setCrust("Cheese Burst");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("BBQ Sauce");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Chicken, Pepperoni");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
