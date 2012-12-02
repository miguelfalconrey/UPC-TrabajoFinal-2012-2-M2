
package veterinaria;

import java.util.ArrayList;


public class Veterinaria {

    
    public static void main(String[] args) {
        
     //  Mascota mascota = new Mascota("Pepe"); 
     //  System.out.println(mascota.getNombre());
    
        Perro perro = new Perro("Godines");
        Gato gato = new Gato("pantuflas");
        Loro loro = new Loro("loro");
        
        // System.out.println(perro.getNombre());
        //System.out.println(perro.saludo());
        
        //System.out.println(perro.comer());
             
        
        Cliente cliente = new Cliente();
        cliente.agregarMascota(gato);
        cliente.agregarMascota(perro);
        cliente.agregarMascota(loro);
        
        ArrayList<Mascota> mascotas = cliente.mostrarMascotas();
        
        
        for (Mascota objMascota : mascotas){            
        
            System.out.println(objMascota.comer());
        }
        
       System.out.println(mascotas.size());
    }
}
