
package proyectopruebahibernate;

import Util.SessionFactoryUtil;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static proyectopruebahibernate.EliminarLibro.eliminarLibro;
import static proyectopruebahibernate.EliminarSocio.eliminarSocio;
import static proyectopruebahibernate.InsertarLibros.insertarLibros;
import static proyectopruebahibernate.InsertarSocios.insertarSocios;
import static proyectopruebahibernate.ListarLibros.listarLibros;
import static proyectopruebahibernate.ListarSocios.listarSocios;
import static proyectopruebahibernate.Menu.menu;
import static proyectopruebahibernate.ModificarLibro.modificarLibro;
import static proyectopruebahibernate.ModificarSocio.modificarSocio;

public class EjecutaMenu 
{
    // Atributos de clase
    private static int opcion;
    private static Scanner teclado = new Scanner(System.in);
    
    public static void ejecutaMenu()
    {
        // Abrimos la sesión que la pasaremos a las opciones del menu.
        SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        do
        {
            menu();
            opcion = teclado.nextInt();
            switch(opcion)
            {
                case 1:
                    listarLibros(session);
                    break;
                case 2:
                    listarSocios(session);
                    break;
                case 3:
                    insertarLibros(session);
                    break;
                case 4:
                    insertarSocios(session);
                    break;
                case 5:
                    modificarLibro(session);
                    break;
                case 6:
                    modificarSocio(session);
                    break;
                case 7:
                    eliminarLibro(session);
                    break;
                case 8:
                    eliminarSocio(session);
                    break;
                case 9:
                    System.out.println("\n");
                    System.out.println("Gracias por utilizar nuestra APP.\n");
                    break;
                default:
                    System.out.println("Ha elegido una opcion incorrecta.\n");
                    break;
            } // fin del switch
        }while(opcion != 9); // Fin do while
        teclado.close();
        session.close();
        
    } // Fin del método ejecutaMenu

} // Fin de la clase EjecutaMenu
