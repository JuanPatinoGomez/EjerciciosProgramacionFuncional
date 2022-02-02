
package ejerciciobasicos.ejercicio8;


public class Pelicula {
    
    
    private String nombre;
    private double duracion;
    
    public Pelicula(){}
    
    public Pelicula(String nombre, double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
}
