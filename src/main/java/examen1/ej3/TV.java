package examen1.ej3;

public class TV implements IElectronics{
    private String name;
    private String model;
    private String manufacturer;
    private int resolution;

    @Override
    public void showElectronics() {
        System.out.println("This is a "+name);
        System.out.println("Model: "+model);
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Resolution: "+resolution);
        System.out.println();
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
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
