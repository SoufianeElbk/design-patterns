public class Chocolat extends Decorator{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    public Chocolat(){}

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au Chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.2;
    }
}
