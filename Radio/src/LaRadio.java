/**
 * @author Juan Marroquin 19845
 * @author Carlos 
 */
public interface LaRadio {
    public String estacionActual();
    public boolean estado();
    public void onOff();
    public void cambiarFrecuencia();
    public void avanzar();
    public void guardar(int boton);
    public void seleccionarEmisora(int boton);
    
}
