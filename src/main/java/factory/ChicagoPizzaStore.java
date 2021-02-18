package factory;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if (item == null) {
            return null;
        } else if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
