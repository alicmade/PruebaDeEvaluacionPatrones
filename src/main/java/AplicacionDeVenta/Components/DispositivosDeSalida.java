package AplicacionDeVenta.Components;

public class DispositivosDeSalida implements CaracterísticasGenerales{
    private String teclado;
    private String raton;
    private String tablaGráfica;

    public DispositivosDeSalida(String teclado, String raton, String tablaGráfica) {
        setModelo("Dispositivos de salida");
        setPrecio(100.5);
        setNombreDeFrabricante("Fabricante: Microsoft");
        this.teclado = teclado;
        this.raton = raton;
        this.tablaGráfica = tablaGráfica;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getRaton() {
        return raton;
    }

    public void setRaton(String raton) {
        this.raton = raton;
    }

    public String getTablaGráfica() {
        return tablaGráfica;
    }

    public void setTablaGráfica(String tablaGráfica) {
        this.tablaGráfica = tablaGráfica;
    }

    @Override
    public void setNombreDeFrabricante(String nombreDeFrabricante) {

    }

    @Override
    public void setModelo(String modelo) {

    }

    @Override
    public void setPrecio(double precio) {

    }
}
