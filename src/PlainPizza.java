public class PlainPizza implements IPizza{


    @Override
    public String getDescription() {
        return "Thin Crust pizza";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
