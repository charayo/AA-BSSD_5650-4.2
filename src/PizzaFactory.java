public class PizzaFactory {
    enum PizzaCrustsEnum{
        THIN,
        THICK,
        NONE
    }
    static  IPizza createPizza(PizzaCrustsEnum type){
        switch(type){
            case THIN ->{
                return new PlainPizza();
            }
            case THICK ->{
                return new ThickCrust();
            }
            case NONE ->{
                return new CrustlessPizza();
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
