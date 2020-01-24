/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebahibernate;

import PruebaMapeoBiblioteca.Socio;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GODINOFERRO
 */
public class ModificarSocio 
{
    public static void modificarSocio(Session session)
    {
        String dni,nombre,apellidos,basura;
        int telefono;
        int opcion;
        Scanner teclado = new Scanner(System.in);
        Transaction tx = session.beginTransaction();
        
        System.out.println("Introduzca el DNI del socio que quiere modificar");
        dni = teclado.nextLine();
        Socio socio = (Socio) session.get(Socio.class, dni);
        System.out.println("Introduzca la opcion: 1.Nombre , 2. Apellidos, 3. Telefono, 4.Todos");
        opcion = teclado.nextInt();
        basura = teclado.nextLine();
        
        switch(opcion)
        {
            case 1:
                System.out.println("Introduzca el nuevo nombre del socio");
                nombre = teclado.nextLine();
                socio.setNombre(nombre);
                break;
            case 2:
                System.out.println("Introduzca los nuevos apellidos del socio");
                apellidos = teclado.nextLine();
                socio.setApellidos(apellidos);
                break;
            case 3:
                System.out.println("Introduzca el nuevo telefono del socio");
                telefono = teclado.nextInt();
                socio.setTelefono(telefono);
                break;
            case 4:
                System.out.println("Introduzca el nuevo nombre del socio");
                nombre = teclado.nextLine();
                System.out.println("Introduzca los nuevos apellidos del socio");
                apellidos = teclado.nextLine();
                System.out.println("Introduzca el nuevo telefono del socio");
                telefono = teclado.nextInt();
                socio.setNombre(nombre);
                socio.setTelefono(telefono);
                socio.setApellidos(apellidos);
        }
   
        session.update(socio);
        tx.commit();
    }
}
