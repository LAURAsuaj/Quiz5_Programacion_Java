import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    private LinkedList<Libro> librosDisponibles = new LinkedList<>();

    public void registrarLibro(Libro libro) {

       librosDisponibles.add(libro);
    }
    public Libro buscarLibro(String titulo) {
        Scanner en= new Scanner(System.in);

        Libro[] aux= b.buscar(titulo);
        if (aux != null){
            for (Libro aux1 : aux) {
                System.out.println(aux1.ToString());
            }
        }else{
            System.out.println("No esxisten libros con ese titulo");
        }

        que llama a la funcion buecar de la clase biblioteca y le pasa el titulo a buscar.



        public Libro[] buscar( String titulo){
            int j=0;
            Libro librosBuscados[]=new Libro [libros.length];

            for (int i=0; i<libros.length;i++){

                if(libros[i].getTitulo().equals(titulo)){

                    librosBuscados[j]=new Libro(libros[i].getTitulo(),
                            libros[i].getAutor(),libros[i].isDisponible());
                    j++;
                }


            }




            return librosBuscados;


        }

    public LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }
}

