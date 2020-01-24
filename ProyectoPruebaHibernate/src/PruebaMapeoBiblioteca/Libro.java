package PruebaMapeoBiblioteca;
// Generated 18-ene-2020 12:09:19 by Hibernate Tools 4.3.1


public class Libro  implements java.io.Serializable {


     private String isbn;
     private String titulo;
     private String autor;

    public Libro() {
    }

	
    public Libro(String isbn) {
        this.isbn = isbn;
    }
    public Libro(String isbn, String titulo, String autor) {
       this.isbn = isbn;
       this.titulo = titulo;
       this.autor = autor;
    }
   
    public String getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }




}


