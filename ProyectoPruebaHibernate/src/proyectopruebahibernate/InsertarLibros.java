/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebahibernate;

import PruebaMapeoBiblioteca.Libro;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author GODINOFERRO
 */
public class InsertarLibros 
{
    public static void insertarLibros(Session session)
    {
        String isbn,nombre,autor;
        Scanner teclado = new Scanner(System.in);
        Transaction tx = session.beginTransaction();
        
        System.out.println("Introduzca el ISBN del libro");
        isbn = teclado.nextLine();
        System.out.println("Introduzca el titulo del libro");
        nombre = teclado.nextLine();
        System.out.println("Introduzca el autor del libro");
        autor = teclado.nextLine();
        Libro libro = new Libro(isbn,nombre,autor);
        session.save(libro);
        
        tx.commit();
    }
}
