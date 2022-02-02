
package ejerciciobasicos.ejercicio9;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//De un listado de personas crear un listado con solo el nombre
public class Ejercicio9 {
    
    
    private List<Persona> listadoPersonas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Ejercicio9 app = new Ejercicio9();
        app.llenarListadoPersona();
        
        //Imprimir listado de persona
        app.imprimirListadoPersonas();
        
        //Crear listado de los nombres de las personas
        
        List<String> nombresDeLasPersonas = app.crearListadoDeNombres();
        
        //Imprimir listado de nombres
        System.out.println("\nListado de solo nombres");
        
        nombresDeLasPersonas.forEach(System.out::println);
        
    }
    
    public void llenarListadoPersona(){
    
        listadoPersonas.add(new Persona("Juan", 20));
        listadoPersonas.add(new Persona("Nicolas", 21));
        listadoPersonas.add(new Persona("Johan", 19));
        listadoPersonas.add(new Persona("Camila", 25));
        listadoPersonas.add(new Persona("Carlos", 27));
        listadoPersonas.add(new Persona("Maria", 15));
        listadoPersonas.add(new Persona("Sofia", 40));
        listadoPersonas.add(new Persona("Pedro", 80));
    }
    
    public List<String> crearListadoDeNombres(){
        //return this.listadoPersonas.stream().map(persona -> persona.getNombre()).collect(Collectors.toList()); // - expresión lambda
        return this.listadoPersonas.stream().map(Persona::getNombre).collect(Collectors.toList()); // Method references
    }
    
    public void imprimirListadoPersonas(){
        this.listadoPersonas.forEach(System.out::println);
    }
    
}
