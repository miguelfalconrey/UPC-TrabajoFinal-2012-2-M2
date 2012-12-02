
package veterinaria;

import java.util.ArrayList;


public class Cliente {
private String nombre;

ArrayList<Mascota> mascotas = new ArrayList<Mascota> ();

public void agregarMascota(Mascota mascota){
    mascotas.add(mascota);
    
}

public ArrayList mostrarMascotas(){
    return mascotas;    
}

}
