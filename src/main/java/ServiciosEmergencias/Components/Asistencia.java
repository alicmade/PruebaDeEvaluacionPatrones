package ServiciosEmergencias.Components;

import java.util.ArrayList;

public class Asistencia {

    private ArrayList<Double> tiempoDeAsistencia = new ArrayList<>();

    public Asistencia(ArrayList<Double> tiempoDeAsistencia) {
        this.tiempoDeAsistencia = tiempoDeAsistencia;
    }

    public ArrayList<Double> getTiempoDeAsistencia() {
        return tiempoDeAsistencia;
    }

    public void setTiempoDeAsistencia(ArrayList<Double> tiempoDeAsistencia) {
        this.tiempoDeAsistencia = tiempoDeAsistencia;
    }

}
