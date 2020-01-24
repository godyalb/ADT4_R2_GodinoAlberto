/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebahibernate;

import PruebaMapeoBiblioteca.Socio;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GODINOFERRO
 */
public class ListarSocios 
{
    public static void listarSocios(Session session)
    {
        Socio socio = new Socio();
        Query q = session.createQuery("from Socio");
        List <Socio> lista = q.list();
        Iterator <Socio> ite = lista.iterator();
        
        while(ite.hasNext())
        {
            socio = (Socio) ite.next();
            System.out.println(socio.getDni() + " " + socio.getNombre() + " " + socio.getApellidos() + " " + socio.getTelefono());
        }
    }
}
