/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author esp15
 */
public class Empleado extends Trabajador {
    private int diasFaltas;
    private int descuento;
    private int horasExtras;

    public Empleado(int codigo, String nombre, int basico, int diasFaltas, int horasExtras) {
        super(codigo, nombre, basico);
        this.diasFaltas = diasFaltas;
        this.descuento = 0;
        this.horasExtras = horasExtras;
    }
    
    public int getDiasFaltas() {
        return diasFaltas;
    }

    public void setDiasFaltas(int diasFaltas) {
        this.diasFaltas = diasFaltas;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public double calcularDescuento(){
        return (getBasico()/30)*getDiasFaltas();
    }
    
    public double calcularSueldoHorasExtra(){
        return ((getBasico()/30)/8)*1.5;
    }
    
    @Override
    public void calcularNeto(double tasa) {
        setNeto(getBasico()-getRetenciones()-calcularDescuento()+getHorasExtras()*calcularSueldoHorasExtra());
    }
}

