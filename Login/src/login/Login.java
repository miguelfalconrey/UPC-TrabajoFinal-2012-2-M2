package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner luci = new Scanner(System.in);
        String idInput;
        System.out.println("Ingrese ID");
        idInput = luci.nextLine();
        String passwordInput;
        System.out.print("Ingrese Password ");
        passwordInput = luci.nextLine();

        if (passwordInput.equals("123") && (idInput.equals("Administrador"))) {
            System.out.println("Autenticacion satisfactoria");
        }
         else {
            System.out.println("Usuario o contraseña incorrecto");
        }

    }
}
