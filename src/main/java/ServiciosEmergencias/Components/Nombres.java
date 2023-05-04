package ServiciosEmergencias.Components;

import java.util.ArrayList;

public class Nombres {
    private ArrayList<String> nombre = new ArrayList<>();

    public Nombres(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

}
