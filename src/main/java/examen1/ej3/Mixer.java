package examen1.ej3;

public class Mixer implements IElectronics {
    private String name;
    private String model;
    private String manufacturer;

    @Override
    public void showElectronics() {
        System.out.println("This is a "+name);
        System.out.println("Model: "+model);
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
