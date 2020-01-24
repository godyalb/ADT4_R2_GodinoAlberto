
package proyectopruebahibernate;

import PruebaMapeoBiblioteca.Libro;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ListarLibros 
{
    public static void listarLibros(Session session)
    {
        Libro libro = new Libro();
        Query q = session.createQuery("from Libro");
        List <Libro> lista = q.list();
        Iterator <Libro> iteratorLibro = lista.iterator();
        if(lista.size() == 0)
            System.out.println("No hay ningún libro en la base de datos.");
        else
        {
            while(iteratorLibro.hasNext())
            {
                libro = (Libro) iteratorLibro.next();
                System.out.println(libro.getIsbn() + " " + libro.getTitulo() + " " + libro.getAutor());
            }
        } // Fin else
    } // Fin método listarLibros
} // Fin clase ListarLibros
