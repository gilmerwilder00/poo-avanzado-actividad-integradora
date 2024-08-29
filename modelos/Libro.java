package modelos;

public class Libro extends ItemBliblioteca implements Catalogable {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void prestar() {
        // implementación en específica para prestar un libro
    }

    @Override
    public void devolver() {
        // implementación específica para devolver un libro
    }

    @Override
    public double calcularMultas() {
        // implementación específica para calcular multas
        return 0.0;
    }

    @Override
    public String obtenerInformacion() {
        return "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Número de páginas: " + numeroPaginas + "\n" +
                "******************************";
    }

}
