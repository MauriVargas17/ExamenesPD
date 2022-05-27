package examen1.ej1;

import java.util.LinkedList;

public class Peaje {
    private static final Peaje peaje = new Peaje();
    private LinkedList<Vehicle> registration = new LinkedList<>();
    private int balance;

    public static Peaje getPeaje(){
        return peaje;
    }

    public void chargeVehicle(Vehicle vehicle){
        balance += getRate(vehicle);
        registerVehicle(vehicle);
    }

    private void registerVehicle(Vehicle vehicle){
        registration.add(vehicle);
    }

    private int getRate(Vehicle vehicle){
        int rate;
        switch (vehicle.getType()){
            case "Light" -> rate = 2;
            case "Medium" -> rate = 3;
            case "Heavy" -> rate = 5;
            default -> rate = 10;
        }
        return rate;
    }

    public int getBalance() {
        return balance;
    }

    public LinkedList<Vehicle> getRegistration() {
        return registration;
    }
}
