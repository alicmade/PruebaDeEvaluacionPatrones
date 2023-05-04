package AplicacionDeVenta.Components;

public class DispositivosDeEntrada implements CaracterísticasGenerales{
    private String pantalla;
    private TipoDeImpresora impresora;

    public DispositivosDeEntrada(String pantalla, TipoDeImpresora impresora) {
        setModelo("Dispositivos de salida");
        setPrecio(500.5);
        setNombreDeFrabricante("Fabricante: Microsoft");
        this.pantalla = pantalla;
        this.impresora = impresora;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public TipoDeImpresora getImpresora() {
        return impresora;
    }

    public void setImpresora(TipoDeImpresora impresora) {
        this.impresora = impresora;
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
