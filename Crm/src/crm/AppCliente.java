/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import java.util.ArrayList;

/**
 *
 * @author gerald
 */
public class AppCliente {
    
    
    private ArrayList<Cliente> Clientes;

    public AppCliente() {
        Clientes = new ArrayList<Cliente>();
    }
    
    private void ValidaDatos(String Nombres, String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto, boolean estado)
        throws CRM_Exception{
        String mensaje = "";
        if (Nombres==null || Nombres.isEmpty())
            mensaje += "Nombre no puede ser nulo o vacio";
        if (ApellidoPaterno==null || ApellidoPaterno.isEmpty())
            mensaje += "Apellido Paterno no puede ser nulo o vacio";
        if (ApellidoMaterno==null || ApellidoMaterno.isEmpty())
            mensaje += "Apellido Materno no puede ser nulo o vacio";
        if (correo==null || correo.isEmpty())
            mensaje += "Correo no puede ser nulo o vacio";
        if (dni==null || dni.isEmpty())
            mensaje += "Dni no puede ser nulo o vacio";
        if (telefono==null || telefono.isEmpty())
            mensaje += "Telefono no puede ser nulo o vacio";        
        if (fechaContacto==null || fechaContacto.isEmpty())
            mensaje += "Fecha de contacto no puede ser nulo o vacio";
        if (estado==false)
            mensaje += "Cliente no puede ser un Prospecto";
        if (! mensaje.isEmpty())
            throw new CRM_Exception(mensaje);
        }
        
    private void ValidaDuplicidad(String dni) 
            throws CRM_Exception {
        if (buscar(dni) != null){
            String mensaje = "DNI "+ dni + " ya esta registrado.";
            throw new CRM_Exception(mensaje);
        }
    }
    

    public void Registrar(String Nombres, String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto, boolean estado)

        throws CRM_Exception {
        
        ValidaDatos(Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto, estado);
        ValidaDuplicidad(dni);
        
        Cliente nuevo = new Cliente(Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, 
                fechaContacto, estado);
        Clientes.add(nuevo);
    }
        
    public int getCantidadClientes() {
        return Clientes.size();
    }

    public Cliente buscar(String dni) {
        for(Cliente xx : Clientes)
            if (xx.getDni().trim().equals(dni))
               return xx;
        return null;
    }
    
    
    public void editarCliente(String Nombres, String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto, boolean estado) {

        int index; //Para guardar el indice

        Cliente cli = buscar(dni);
        cli.setCorreo(correo);
        cli.setTelefono(telefono);
        cli.setEstado(estado);
        
        index = Clientes.indexOf(cli);
        Clientes.set(index, cli);
    }
    
    public void eliminarCliente(String dni) {
        
        //Busca al usuario por su codigo
        Cliente cli = buscar(dni);
        //Elimina al usuario del arreglo de la lista
        Clientes.remove(cli);
        //Clientes.indexOf(cli);
    }



















}
