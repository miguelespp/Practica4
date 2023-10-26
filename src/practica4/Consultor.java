/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author esp15
 */
public class Consultor extends Trabajador{
    private int bonificacion;

    public Consultor(int codigo, String nombre, int basico, int bonificacion) {
        super(codigo, nombre, basico);
        this.bonificacion = bonificacion;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    @Override
    public void calcularNeto(double tasa) {
        setNeto(getBasico() - getRetenciones() + getBonificacion());
    }
}
