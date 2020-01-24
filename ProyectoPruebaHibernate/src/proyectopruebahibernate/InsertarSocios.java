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
public class InsertarSocios 
{
    public static void insertarSocios(Session session)
    {
        String dni,nombre,apellido;
        int telefono;
        Scanner teclado = new Scanner(System.in);
        Transaction tx = session.beginTransaction();
        
        System.out.println("Introduzca el DNI del socio");
        dni = teclado.nextLine();
        System.out.println("Introduzca el nombre del socio");
        nombre = teclado.nextLine();
        System.out.println("Introduzca los apellidos del socio");
        apellido = teclado.nextLine();
        System.out.println("Introduzca el telefono del socio");
        telefono = teclado.nextInt();
        Socio socio = new Socio(dni,nombre,apellido,telefono);
        session.save(socio);
        
        tx.commit();
    }
}
