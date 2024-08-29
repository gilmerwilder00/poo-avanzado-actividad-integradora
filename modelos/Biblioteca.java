package modelos;

import java.util.ArrayList;

public class Biblioteca {

    // catálogo de libros disponibles en la biblioteca
    private ArrayList<Libro> libros;

    // Constructor de la clase Biblioteca
    public Biblioteca() {
        // Inicializar la lista de libros para que no sea null cuando se instancia una
        // biblioteca
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro " + libro.getTitulo() + " se ha agregado correctamente.");
    }

    // Métodos para mostrar las información de los libros
    public void mostrarInformacionLibros() {
        System.out.println("Cantidad de libros: " + libros.size());
        if (libros.size() == 0) {
            System.out.println("La biblioteca no tiene libros actualmente.");
        } else {
            // Se recorre el arreglo de libros y se muestra su información
            System.out.println();
            for (int i = 0; i < libros.size(); i++) {
                Libro libro = libros.get(i);
                String information = libro.obtenerInformacion();
                System.out.println(information);
            }
        }
        System.out.println();
    }

}
