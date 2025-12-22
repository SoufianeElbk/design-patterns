public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setState("State Changed 1");
        observable.setState("State Changed 2");

        observable.unsubscribe(observer1);

        observable.setState("State Changed 3");
    }
}
