public class Main {
    public static void main(String[] args) {
        Boisson boisson1 = new Chocolat(new Sumatra());

        Boisson boisson2 = new Sumatra();
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Caramel(boisson2);

        System.out.println(boisson1.getDescription() + " ==> " + boisson1.cout());
        System.out.println(boisson2.getDescription() + " ==> " + boisson2.cout());

        Boisson boisson3 = new Espresso();
        System.out.println(boisson3.getDescription() + " ==> " + boisson3.cout());
    }
}