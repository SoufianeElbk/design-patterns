package controllers;

import services.Service;

public class Client {
    Service service;

    public double perform(int t) {
        return service.compute(t);
    }

    public void setService(Service service) {
        this.service = service;
    }
}
