/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package practica4;

/**
 *
 * @author esp15
 */
public class RangoException extends Exception{
    
    String mensaje;
    public RangoException() {
    }

    /**
     * Constructs an instance of <code>RangoException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public RangoException(String smensaje) {
        super(smensaje);
    }
    
    public String mostrar(){
        return this.mensaje;
    }
}
