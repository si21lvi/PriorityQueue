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
import java.util.PriorityQueue;
import java.util.Queue;


public class ColaDePrioridad{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Empleado> lista = new PriorityQueue<Empleado>();
        lista.add(new Nomina("Miguel",5));
        lista.add(new Contratista("Silvia", 6));
        lista.add(new Nomina("David", 4));
        lista.add(new Contratista("Sebastian", 3));
        lista.add(new Nomina("Camilo", 4));
        lista.add(new Contratista("Johan", 3));
        lista.add(new Nomina("Raul", 5));
        lista.add(new Contratista("Cristian", 1));
        lista.add(new Nomina("Jose", 6));
        lista.add(new Contratista("Laura", 2));
        
        
        while(lista.size() > 2){
            
            Empleado e = lista.remove();
            System.out.println("El empleado " + e.getNombre() + " lleva trabajando en la empresa " + e.getAñosLaborales() + " año(s).");
       
        }
        
        System.out.println("----------------------------------------------------------------------------------------");
        
        Empleado p = lista.poll();
        Empleado c = lista.peek();

        System.out.println("Los empleados " + p.getNombre() + " y " + c.getNombre() + " tendran que ser despedidos.");
    }
    
}
