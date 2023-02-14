public class Main {
    public static void main(String[] args) {
        IPizza pizza1 = ToppingsFactory.decoratePizza(
                new ToppingsFactory.ToppingsEnum[]{
                        ToppingsFactory.ToppingsEnum.PEPPERONI,
                        ToppingsFactory.ToppingsEnum.GOUDA,
                        ToppingsFactory.ToppingsEnum.TOMATOSAUCE,
                        ToppingsFactory.ToppingsEnum.MUSHROOM,
                        ToppingsFactory.ToppingsEnum.MUSHROOM,
                },
                PizzaFactory.createPizza(PizzaFactory.PizzaCrustsEnum.THICK)
        );
        IPizza pizza2 = ToppingsFactory.decoratePizza(
                new ToppingsFactory.ToppingsEnum[]{
                        ToppingsFactory.ToppingsEnum.ALFREDOSAUCE,
                        ToppingsFactory.ToppingsEnum.PESTOSAUCE,
                        ToppingsFactory.ToppingsEnum.MUSHROOM,
                        ToppingsFactory.ToppingsEnum.ONIONS},
                PizzaFactory.createPizza(PizzaFactory.PizzaCrustsEnum.THIN)
        );
        IPizza pizza3 = ToppingsFactory.decoratePizza(
                new ToppingsFactory.ToppingsEnum[]{
                        ToppingsFactory.ToppingsEnum.LETTUCE,
                        ToppingsFactory.ToppingsEnum.PESTOSAUCE,
                        ToppingsFactory.ToppingsEnum.GOUDA,
                        },
                PizzaFactory.createPizza(PizzaFactory.PizzaCrustsEnum.NONE)
        );
        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());

    }
}