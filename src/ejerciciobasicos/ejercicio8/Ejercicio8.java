
package ejerciciobasicos.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Ejercicio basado de : https://www.adictosaltrabajo.com/2015/03/02/optional-java-8/
//Obtener la duracion de una pelicula en base a su nombre
public class Ejercicio8 {
    
    
    private final List<Pelicula> peliculas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Ejercicio8 app = new Ejercicio8();
        app.llenarListaPeliculas();
        app.imprimirListado();
        
        //Uso del optional --------------------------------------------------------------------------------------
        /*
        Optional<Pelicula> peliculaBuscada = app.obtenerPeliculaPorNombre("Encanto");
        System.out.println("\nPelicula buscada: " + peliculaBuscada.get().getNombre());
        
        double duracionPelicula = peliculaBuscada.map((pelicula) -> pelicula.getDuracion()).orElse(0.0);
        
        System.out.println("La duración de la pelicula es: " + duracionPelicula);*/
        
        //Otra forma más simplificada a la de arriba ------------------------------------------------------------------
        
        /*double duracionPelicula = app.obtenerPeliculaPorNombre("Encanto").map(pelicula -> pelicula.getDuracion()).orElse(0.0);
        
        System.out.println("\nLa duración de la pelicula es: " + duracionPelicula);
        */
        
        //Otra forma --------------------------------------------------------------------------------------------------
        
        /*Optional<Pelicula> peliculaBuscada = app.obtenerPeliculaPorNombre("Encanto");
        if(peliculaBuscada.isPresent()){
            double duracionPelicula = peliculaBuscada.map((pelicula) -> pelicula.getDuracion()).get();
            
            System.out.println("\nPelicula buscada: " + peliculaBuscada.get().getNombre());
            System.out.println("La duración de la pelicula es: " + duracionPelicula);
        }else{
            System.out.println("\nLa pelicula buscada no se encuentra en el listado");
        }
        */
        
        //Otra forma --------------------------------------------------------------------------------------------------
        
        Optional<Pelicula> peliculaBuscada = app.obtenerPeliculaPorNombre("Encanto");
        
        peliculaBuscada.ifPresent(pelicula -> System.out.println("La pelicula " + pelicula.getNombre() + " tienen una duración de " + pelicula.getDuracion()));
        
    }
    
    public void llenarListaPeliculas(){
        
        this.peliculas.add(new Pelicula("Spider-Man: No Way Home", 2.28d));
        this.peliculas.add(new Pelicula("Sing 2", 1.5d));
        this.peliculas.add(new Pelicula("El Armario", 1.38d));
        this.peliculas.add(new Pelicula("Encanto", 1.49d));
        this.peliculas.add(new Pelicula("Scream 5", 1.54d));
        this.peliculas.add(new Pelicula("Matrix Resurrecciones", 2.28d));
        this.peliculas.add(new Pelicula("Eternals", 2.37d));
        this.peliculas.add(new Pelicula("Black Widow", 2.13d));
        
    }
    
    
    public void imprimirListado(){
        System.out.println("Peliculas ---");
        this.peliculas.forEach(pelicula -> System.out.printf("%-25s : %1.2f\n", pelicula.getNombre(), pelicula.getDuracion()));
    }
    
    public Optional<Pelicula> obtenerPeliculaPorNombre(String nombre){
    
        Optional<Pelicula> peliculaBuscada = this.peliculas.stream().filter(pelicula -> pelicula.getNombre().equalsIgnoreCase(nombre)).findFirst();
        
        return peliculaBuscada;
    }
}
