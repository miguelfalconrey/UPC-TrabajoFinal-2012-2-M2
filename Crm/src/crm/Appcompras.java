package crm;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Appcompras {
 
    ArrayList<Compra> compras; //creacion de array Compras
    public Appcompras(){
    compras = new ArrayList<Compra>(); /* instanciando un array de objetos*/
    }

    public boolean RegistrarCompra(String Tipodoc, String Numdoc, String Moneda,
            String Fechaemision, String Formapago, String Detalle) throws CRM_Exception { //procedimiento publico en donde le damos los parametros

    boolean rpta = false;

    rpta = compras.add(new Compra(Tipodoc, Numdoc, Moneda, Fechaemision, 
           Formapago, Detalle));
        //creo un nuevo objeto de clase de Usuario
        return rpta;
    }
    
    
    public Compra BuscarCompra(String Numdoc) {
        for (Compra com : compras) {
            if (com.getNumdoc().trim().equals(Numdoc)) {
                return com;
            }
        }
        return null;
    }

    public void eliminarcompra(String compra) {
        Compra com = BuscarCompra(compra);
        compras.remove(com);
        compras.indexOf(com);
    }

//    
//    public void editarusuario(String dni, String nombre, String apellidopaterno,
//            String apellidomaterno, String usuario, String correo, String fechaingreso,
//            String cargo, String rol, String contrasena, String creadopor,
//            String fechadecreacion, String actualizadopor, String fechadeactualizacion) {
//
//        int index; //Para guardar el indice
//
//        Usuario usu = BuscarUsuario(usuario);
//        usu.setCargo(cargo);
//        usu.setRol(rol);
//        usu.setActualizadopor(actualizadopor);
//
//        index = usuarios.indexOf(usu);
//        usuarios.set(index, usu);
//    }
//
//    
//    public boolean validarusuariocontrasena(String usuario, String contrasena) throws CRM_Exception {
//        boolean rpta = false;
//        Usuario usu = BuscarUsuario(usuario);
//
//        if (usu == null) {
//            String mensaje = "Usuario o contraseña incorrecta";
//            if (!mensaje.isEmpty()) {
//                throw new CRM_Exception(mensaje);
//            }
//            rpta = false;
//        } else {
//
//            if (usu.getContrasena().trim().equals(contrasena)) {
//                rpta = true;
//
//            } else {
//                String mensaje = "Usuario o contraseña incorrecta";
//                if (!mensaje.isEmpty()) {
//                    throw new CRM_Exception(mensaje);
//                }
//                rpta = false;
//            }
//        }
//
//        return rpta;
//
//       
//    }    
//    
//    
//    
//    
//}
//    private ArrayList<Maestrodoc> doc; //Se declara
//    private ArrayList<Articulos> articulo;  // Se declara el array
//    
//    public Appcompras() {
//    doc = new ArrayList<Maestrodoc>();
//    
//            
//    }
//    
//public ArrayList<Maestrodoc> getdoc(){
//    return doc;
//}
//    
//private void ingresardato(int Codigo, int Codprov, String Numdoc, String Detalle, String Fechaemision, String Formapago, int Total, String Fecemision, String Fechacancelacion, String Moneda, double Subtotal, double Igv, String Observaciones, String Tipodoc, int Codpro, String Estado){
//    getdoc().add(new Maestrodoc(Codigo, Codprov, Numdoc, Detalle, Fechaemision, Formapago, Total, Fecemision, Fechacancelacion, Moneda, Subtotal, Igv, Observaciones, Tipodoc, Codpro, Estado));
//        
//}
//
//public ArrayList<Articulos> getarticulo(){
//    return articulo;
//}
//
//private void detalle(String Codpro, int Cantidad, int Umedida, String Descripcion, int Stockinial, int Preciounitario, int Recibidos, int Despachado, int Total, String Numdoc, String Numeroitem){
// getarticulo().add(new Articulos(Codpro, Cantidad, Umedida, Descripcion, Stockinial, Preciounitario, Recibidos, Despachado, Total, Numdoc, Numeroitem));    
    

}


