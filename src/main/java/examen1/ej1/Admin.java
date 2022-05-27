package examen1.ej1;

import java.util.LinkedList;

public class Admin {
    public static void main(String[] args){
        Peaje peaje = new Peaje();
        Vehicle v1 = new Vehicle(4728374, "XV", "Red", "Heavy");
        Vehicle v2 = new Vehicle(6767453, "CX 30", "Grey", "Medium");
        Vehicle v3 = new Vehicle(7857848, "Vitara", "Black", "Medium");
        Vehicle v4 = new Vehicle(2624663, "Civic", "White", "Heavy");
        Vehicle v5 = new Vehicle(1896675, "CAT", "Yellow", "Super Heavy");
        Vehicle v6 = new Vehicle(8363563, "Yamaha", "Red", "Light");

        peaje.chargeVehicle(v1);
        peaje.chargeVehicle(v2);
        peaje.chargeVehicle(v3);
        peaje.chargeVehicle(v4);
        peaje.chargeVehicle(v5);
        peaje.chargeVehicle(v6);

        LinkedList<Vehicle> list = peaje.getRegistration();

        System.out.println("The balance after 6 cars is: "+peaje.getBalance());
        System.out.println("These are the registered cars: ");
        System.out.println("- "+list.get(0).getModel());
        System.out.println("- "+list.get(1).getModel());
        System.out.println("- "+list.get(2).getModel());
        System.out.println("- "+list.get(3).getModel());
        System.out.println("- "+list.get(4).getModel());
        System.out.println("- "+list.get(5).getModel());
    }
}
