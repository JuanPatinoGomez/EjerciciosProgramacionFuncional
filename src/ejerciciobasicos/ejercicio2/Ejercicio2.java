package ejerciciobasicos.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


/*
    De un listado de personas obtener las personas mayores de edad
*/
public class Ejercicio2 {

    private List<Persona2> listadoPersonas;

    public void llenarLista() {

        this.listadoPersonas = new ArrayList<>();

        this.listadoPersonas.add(new Persona2("Juan", 20));
        this.listadoPersonas.add(new Persona2("Rafa", 25));
        this.listadoPersonas.add(new Persona2("Paula", 23));
        this.listadoPersonas.add(new Persona2("Mario", 50));
        this.listadoPersonas.add(new Persona2("Maria", 15));
        this.listadoPersonas.add(new Persona2("Nicolas", 15));
        this.listadoPersonas.add(new Persona2("Felipe", 12));
        this.listadoPersonas.add(new Persona2("Eduardo", 40));
        this.listadoPersonas.add(new Persona2("Alejandra", 20));

        imprimirListado(this.listadoPersonas);
    }
    
    public void imprimirListado(List<Persona2> listado) {
        //Clase anónima ----------------------------------------
        /*this.listadoPersonas.forEach(new Consumer<Persona2>() {
            @Override
            public void accept(Persona2 t) {
                System.out.println(t);
            }
        });*/

        //Expresión lambda ----------------------------------------
        //this.listadoPersonas.forEach(t -> System.out.println(t));
        //Method references
        
        listado.forEach(System.out::println);
    }

    public void obtenerListadoPersonaMayores() {

        List<Persona2> listadoPersonasMayores = this.listadoPersonas.stream().filter((Persona2 t) -> {
            return t.getEdad() > 18;
        }).collect(Collectors.toList());
        
        imprimirListado(listadoPersonasMayores);
    }

    public static void main(String[] args) {

        Ejercicio2 app = new Ejercicio2();

        app.llenarLista();
        System.out.println("-----------------------------------Obtener las personas mayores de edad");
        app.obtenerListadoPersonaMayores();
        System.out.println("-----------------------------------");
        app.imprimirListado(app.listadoPersonas);

    }
}
