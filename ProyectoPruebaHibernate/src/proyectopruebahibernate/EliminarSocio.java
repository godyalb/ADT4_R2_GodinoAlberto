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
public class EliminarSocio 
{
    public static void eliminarSocio(Session session) 
    {
        String dni;
        Scanner teclado = new Scanner(System.in);
        Transaction tx = session.beginTransaction();
        
        System.out.println("Introduzca el DNI del socio que quiere eliminar");
        dni = teclado.nextLine();
        Socio socio = (Socio) session.get(Socio.class, dni);
        session.delete(socio);
        tx.commit();
    }
}
