import controllers.Client;
import proxy.ProxyCache;
import services.Service;
import services.ServiceImpl;

public class Main {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        Client client = new Client();
        client.setService(service);
        System.out.println("RES = " + client.perform(5));
        System.out.println("RES = " + client.perform(5));
        System.out.println("RES = " + client.perform(5));

        Service proxy = new ProxyCache();
        client.setService(proxy);
        System.out.println("RES = " + client.perform(5));
        System.out.println("RES = " + client.perform(5));
        System.out.println("RES = " + client.perform(5));


    }
}
