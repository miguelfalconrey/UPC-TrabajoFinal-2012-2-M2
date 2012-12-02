
package veterinaria;

//extends amplia lo que tiene mascota como atributos y metodos
// se establece la herencia

public class Perro extends Mascota{
 private boolean vacunado;

    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    public Perro(String nombre) {
        super(nombre);
    }

    public Perro(boolean vacunado, String nombre) {
        super(nombre);
        this.vacunado = vacunado;
    }
 
  public String saludo(){
      
      return "Hola soy" + nombre;  
  }

    @Override
    public String comer() {
        return super.comer() + "Pero como come carne";
    }
    
  
  
  
  
}
