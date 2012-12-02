
package veterinaria;


 abstract public class Mascota {
  
  //private String nombre; 
  //private String raza;

     protected String nombre;
     protected String raza;
     
     
    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
     
    
   public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }  
    
    
    public String comer(){
        return "Como de manera generica";
        
        
    }
    
}
