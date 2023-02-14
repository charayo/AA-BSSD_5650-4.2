public class ToppingsFactory {
    enum ToppingsEnum{
        MUSHROOM{
            public ToppingDecorator getInstance(IPizza target){
                return  new Mushrooms(target);
            }
        },
        ONIONS{
            public ToppingDecorator getInstance(IPizza target){
                return  new Onions(target);
            }
        },
        LETTUCE{
            public ToppingDecorator getInstance(IPizza target){
                return  new Lettuce(target);
            }
        },
        GOUDA{
            public ToppingDecorator getInstance(IPizza target){
                return  new Gouda(target);
            }
        },
        PESTOSAUCE{
            public ToppingDecorator getInstance(IPizza target){
                return  new PestoSauce(target);
            }
        },
        ALFREDOSAUCE{
            public ToppingDecorator getInstance(IPizza target){
                return  new AlfredoSauce(target);
            }
        },
        TOMATOSAUCE{
            public ToppingDecorator getInstance(IPizza target){
                return  new TomatoSauce(target);
            }
        },
        PEPPERONI{
            @Override
            public ToppingDecorator getInstance(IPizza target){
                return  new Pepperoni(target);
            }
        };

        public abstract ToppingDecorator getInstance(IPizza target);
    }
    static  IPizza decoratePizza(ToppingsFactory.ToppingsEnum[] toppings, IPizza target){
       for(ToppingsEnum topping : toppings){
           target = topping.getInstance(target);
       }
       return target;
    }

}
