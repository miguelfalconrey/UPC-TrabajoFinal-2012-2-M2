

import crm.*;

public class Permisos {

    private String nombre;
    private String modulo;
    private boolean adicionar;
    private boolean editar;
    private boolean eliminar;

    public Permisos(String nombre, String modulo, boolean adicionar, boolean editar, boolean eliminar) {
        this.nombre = nombre;
        this.modulo = modulo;
        this.adicionar = adicionar;
        this.editar = editar;
        this.eliminar = eliminar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public boolean getAdicionar() {
        return adicionar;
    }

    public void setAdicionar(boolean adicionar) {
        this.adicionar = adicionar;
    }

    public boolean getEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public boolean getEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }

   
    
    
    
}
