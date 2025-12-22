public class ObserverImpl1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("*********************************************");
        System.out.println(message);
        System.out.println("*********************************************");
    }
}
