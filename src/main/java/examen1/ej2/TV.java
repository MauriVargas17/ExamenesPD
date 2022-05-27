package examen1.ej2;

public class TV implements ITV{
    private String opSystem;
    private String version;
    private int resolution;
    private int inches;
    private boolean hasHDMI;
    private int usbPorts;
    private boolean hasRemoteControl;
    private boolean hasBluetooth;
    private Serial serial;

    @Override
    public Object clone() {
        return null;
    }
}
