public interface PizzaBuilder {
    void buildSize();
    void buildCrust();
    void buildSauce();
    void buildToppings();
    Pizza getPizza();
}