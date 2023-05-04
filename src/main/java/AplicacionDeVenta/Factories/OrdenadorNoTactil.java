package AplicacionDeVenta.Factories;

import AplicacionDeVenta.Buttons.Ordenador;

public class OrdenadorNoTactil implements GUIFactory{
    @Override
    public Ordenador createOrdenador() {
        return (Ordenador) new OrdenadorNoTactil();
    }
}
