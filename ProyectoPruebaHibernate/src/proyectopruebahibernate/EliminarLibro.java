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
public class EliminarLibro 
{
    public static void eliminarLibro(Session session)
    {
        String isbn;
        Scanner teclado = new Scanner(System.in);
        Transaction tx = session.beginTransaction();
        
        System.out.println("Introduzca el ISBN del libro que quiere eliminar");
        isbn = teclado.nextLine();
        Libro libro = (Libro) session.get(Libro.class, isbn);
        session.delete(libro);
        tx.commit();
    }
}
