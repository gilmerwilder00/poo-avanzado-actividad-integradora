package modelos;

public class Pelicula extends ItemBliblioteca implements Catalogable {


    @Override
    public void prestar() {
        // Implementación específica para prestar una pelicula
    }

    @Override
    public void devolver() {
        // Implementación específica para devolver una película.
    }

    @Override
    public double calcularMultas() {
        // implementación específica para calcular multas de películas.
        return 0.0;
    }


    @Override
    public String obtenerInformacion() {
       return "Datos de la película";
    }
    
    
}
