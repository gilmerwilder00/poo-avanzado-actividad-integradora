import modelos.Biblioteca;
import modelos.Libro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        Biblioteca biblioteca = new Biblioteca();

        do {
            try {
                mostrarMenuLibro();// se invoca al método para mostrar el menu de opciones
                System.out.print("Ingresa un número para seleccionar una opción:");
                option = scanner.nextInt(); // posible excepcion
                scanner.nextLine();// limpiar el buffer \n
                switch (option) {
                    case 1:
                        Libro libro = crearLibro(); // se invoca (llama) al metodo encargado de crear un libro
                        biblioteca.agregarLibro(libro); // se agrega el libro a la biblioteca
                        break;
                    case 2:
                        biblioteca.mostrarInformacionLibros(); // se muestra información de libros en biblioteca
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema de biblioteca ...");
                        System.out.println();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 3.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Error: debes seleccionar un numero entero como opción.");
                System.out.println();
                scanner.nextLine();// limpiar buffer para evitar bucle infinito
            }

        } while (option!=3);

    }

    public static void mostrarMenuLibro() {
        System.out.println();
        System.out.println("1.Crear un libro");
        System.out.println("2.Mostrar información de libros en el catálogo");
        System.out.println("3.Salir");
        System.out.println();
    }

    public static Libro crearLibro() {

        Libro libro = new Libro();
        boolean validNumberPages = false;

        System.out.print("Ingresar el nombre del libro:");
        String title = scanner.nextLine();
        libro.setTitulo(title); // se establece el título del libro
        System.out.print("Ingresar el autor de libro:");
        String author = scanner.nextLine();
        libro.setAutor(author);// se establece el autor del libro

        do {
            System.out.print("Ingresa el número de páginas del libro:");
            try {
                int numberPages = scanner.nextInt(); // posible excepción
                validNumberPages = (numberPages > 0); // se establece si el número de páginas es un número correcto
                if (validNumberPages) {
                    libro.setNumeroPaginas(numberPages); // se establece el número de páginas
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Error: debes ingresar un número entero.");
                System.out.println();
                scanner.nextLine(); // Limpiar el buffer del scanner para evitar bucle infinito
            }
        } while (!validNumberPages); // mientras no se tenga el número de páginas de manera correcta

        return libro;
    }

}