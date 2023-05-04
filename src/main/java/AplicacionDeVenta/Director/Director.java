package AplicacionDeVenta.Director;

import AplicacionDeVenta.Builder.Builder;

public class Director {
    public void construirOrdenador(Builder builder) {
        builder.setNumeroDeProcesadores(4);
        builder.setDispositivoDeEntrada("Teclado");
        builder.setDispositivoDeSalida("Monitor");
    }
}
