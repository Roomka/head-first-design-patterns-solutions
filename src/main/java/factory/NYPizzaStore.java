package factory;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item == null) {
            return null;
        } else if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
}
