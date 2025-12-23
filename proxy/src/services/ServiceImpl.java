package services;

public class ServiceImpl implements Service {
    @Override
    public double compute(int n) {
        System.out.println("********** Compute **********");
        return Math.cos(n * Math.PI / 180) * Math.sqrt(n);
    }
}
