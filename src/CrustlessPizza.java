public class CrustlessPizza implements IPizza{


    @Override
    public String getDescription() {
        return "Crustless pizza";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
