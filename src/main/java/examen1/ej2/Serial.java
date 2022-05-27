package examen1.ej2;

public class Serial {
    private String serial;

    public Serial(String serial) {
        if(serial.length() == 10){
            this.serial = serial;
        } else {
            this.serial = "1234567890";
        }
    }
}
