package examen1.ej3;

public class FactoryElectronics {
    public static IElectronics make(int electronic){
        IElectronics ie;
        ElectronicsList electronicPos = ElectronicsList.values()[electronic];
        switch (electronicPos) {
            case TV -> ie = new TV();
            case Radio -> ie = new Radio();
            case Mixer -> ie = new Mixer();
        }
    }
}
