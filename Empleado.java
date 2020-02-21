/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coladeprioridad;

/**
 *
 * @author David Parra
 */
public abstract class Empleado implements Comparable<Empleado> {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñosLaborales() {
        return añosLaborales;
    }

    public void setAñosLaborales(int añosLaborales) {
        this.añosLaborales = añosLaborales;
    }
    private String nombre;
    private int añosLaborales;

    public Empleado(String nombre, int añosLaborales) {
        this.nombre = nombre;
        this.añosLaborales = añosLaborales;
    }

    @Override
    public int compareTo(Empleado t) {
        if (añosLaborales < t.getAñosLaborales()) {
            return 1;
        } else if (añosLaborales > t.getAñosLaborales()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
}
