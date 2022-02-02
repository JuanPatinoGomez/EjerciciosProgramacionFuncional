
package ejerciciobasicos.Ejercicio10;

import java.util.function.Function;

public class Ejercicio10 {
    
    //Ejercicio tomado del video: https://youtu.be/VRpHdSFWGPs
    
    //Incrementar en 1 el numero enviado y luego multiplicarlo por 10
    public static void main(String[] args) {
        
        
        int numero = 3;
        
        //Función que incrementa --------------------------------------------------------------------------------------------------------
        
        //Clase anónima
        /*Function<Integer, Integer> incrementar = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t + 1;
            }
        };*/
        
        //Expresión lambda
        Function<Integer, Integer> incrementar = (x) -> x + 1;
        
        int numeroIncrementado = incrementar.apply(numero);
        System.out.println("El número incrementado: " + numeroIncrementado);
        
        
        //Función que multiplica --------------------------------------------------------------------------------------------------------
        
        //Clase anónima
        /*Function<Integer, Integer> multiplicar = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 10;
            }
        };*/
        
        //Expresión lambda
        
        Function<Integer, Integer> multiplicar = (x) -> x * 10;
        
        int numeroMultiplicado = multiplicar.apply(numeroIncrementado);
        
        System.out.println("El número multiplicado: " + numeroMultiplicado);
        
        
        //Para hacer el codigo un poco más limpio podemos unir ambas funciones
        
        Function<Integer, Integer> incrementarYMultiplicar = incrementar.andThen(multiplicar);
        
        int numeroRta = incrementarYMultiplicar.apply(numero);
        
        System.out.println("Numero rta: " + numeroRta);
        
    }
    
    //Ademas de las Function existen las BiFunction
}
