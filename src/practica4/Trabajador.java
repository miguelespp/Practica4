/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author esp15
 */
public abstract class Trabajador {
    private int codigo;
    private String nombre;
    private int basico;
    private double retenciones;
    private double neto;
    
    public Trabajador(int codigo, String nombre, int basico){
        this.codigo = codigo;
        this.nombre = nombre;
        this.basico = basico;
        this.retenciones = 0;
        this.neto = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBasico() {
        return basico;
    }

    public void setBasico(int basico) {
        this.basico = basico;
    }

    public double getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
    
    public void calcularRetenciones(double tasa) {
        setRetenciones(getBasico()*tasa);
    }
    
    public abstract void calcularNeto(double tasa);
}
