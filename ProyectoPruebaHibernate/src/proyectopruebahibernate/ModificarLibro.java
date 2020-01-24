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
public class ModificarLibro 
{
    public static void modificarLibro(Session session)
    {
        String isbn,nombre,autor,basura;
        int opcion;
        Scanner teclado = new Scanner(System.in);
        Transaction tx = session.beginTransaction();
        
        System.out.println("Introduzca el ISBN del libro que quiere modificar");
        isbn = teclado.nextLine();
        Libro libro = (Libro) session.get(Libro.class, isbn);
        System.out.println("Introduzca la opcion: 1.Nombre , 2. Autor, 3. Ambos");
        opcion = teclado.nextInt();
        basura = teclado.nextLine();
        
        switch(opcion)
        {
            case 1:
                System.out.println("Introduzca el nuevo titulo del libro");
                nombre = teclado.nextLine();
                libro.setTitulo(nombre);
                break;
            case 2:
                System.out.println("Introduzca el nuevo autor del libro");
                autor = teclado.nextLine();
                libro.setAutor(autor);
                break;
            case 3:
                System.out.println("Introduzca el nuevo titulo del libro");
                nombre = teclado.nextLine();
                System.out.println("Introduzca el nuevo autor del libro");
                autor = teclado.nextLine();
                libro.setTitulo(nombre);
                libro.setAutor(autor);
                break;
        }
   
        session.update(libro);
        
        tx.commit();
    }
}
