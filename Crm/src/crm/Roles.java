package crm;

public class Roles {

    private String nombre;
    private String descripcion;
    private String creadopor;
    private String creadoel;
    private String actualizadopor;
    private String actualizadoel;

    public Roles(String nombre, String descripcion, String creadopor, String creadoel, String actualizadopor, String actualizadoel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creadopor = creadopor;
        this.creadoel = creadoel;
        this.actualizadopor = actualizadopor;
        this.actualizadoel = actualizadoel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreadopor() {
        return creadopor;
    }

    public void setCreadopor(String creadopor) {
        this.creadopor = creadopor;
    }

    public String getCreadoel() {
        return creadoel;
    }

    public void setCreadoel(String creadoel) {
        this.creadoel = creadoel;
    }

    public String getActualizadopor() {
        return actualizadopor;
    }

    public void setActualizadopor(String actualizadopor) {
        this.actualizadopor = actualizadopor;
    }

    public String getActualizadoel() {
        return actualizadoel;
    }

    public void setActualizadoel(String actualizadoel) {
        this.actualizadoel = actualizadoel;
    }
}
