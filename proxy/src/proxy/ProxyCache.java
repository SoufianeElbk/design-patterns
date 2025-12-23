package proxy;

import services.Service;
import services.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements Service {
    ServiceImpl service = new ServiceImpl();
    Map<Integer, Double> cache = new HashMap<>();

    @Override
    public double compute(int n) {
        if (cache.containsKey(n)) {
            System.out.println("********** Compute in cache **********");
            return cache.get(n);
        } else {
            double res = service.compute(n);
            cache.put(n, res);
            return res;

        }
    }
}
