public class Libro {
    private String titulo;

    private String autor ;
    private int numeroPaginas ;
    /*******************************************************************************/
    /*********************************CONSTRUCTORES ********************************/
    /*******************************************************************************/

    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param titulo
     * @param autor
     * @param numeroPaginas
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    /********************************************************************************/
    /***************************** MÉTODOS MODIFICADORES ****************************/
    /********************************************************************************/

    /**
     * Método para obtener el nombre del estudiante
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setTitulo() {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

}
