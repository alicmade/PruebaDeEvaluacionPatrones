package AplicacionDeVenta.Factories;

import AplicacionDeVenta.Buttons.Ordenador;

public class OrdenadorTactil implements GUIFactory{
    @Override
    public Ordenador createOrdenador() {
        return (Ordenador) new OrdenadorTactil();
    }
}
