package ServiciosEmergencias.Components;

import java.util.ArrayList;

public class Ambulacia {
    private ArrayList<Integer> numAmbulancia = new ArrayList<>();

    public Ambulacia(ArrayList<Integer> numAmbulancia) {
        this.numAmbulancia = numAmbulancia;
    }

    public ArrayList<Integer> getNumAmbulancia() {
        return numAmbulancia;
    }

    public void setNumAmbulancia(ArrayList<Integer> numAmbulancia) {
        this.numAmbulancia = numAmbulancia;
    }
}
