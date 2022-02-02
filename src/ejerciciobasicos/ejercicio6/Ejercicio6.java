
package ejerciciobasicos.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Escribir una función que simule una calculadora científica que permita calcular el seno,
coseno, tangente, exponencial y logaritmo neperiano. La función preguntará al usuario el valor y la función a aplicar,
y mostrará por pantalla una tabla con los enteros de 1 al valor introducido y el resultado de aplicar la función a esos enteros.

pagina del ejercicio: https://aprendeconalf.es/docencia/python/ejercicios/programacion-funcional/
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int numero = 0;

        try {
            //Recoger hasta que número se realizara la operación
            numero = Math.abs(entrada.nextInt());

            //Determinar que operación se realizara
            System.out.println("\nDigite una opción: "
                    + "\n1.Seno"
                    + "\n2.Coseno"
                    + "\n3.Tangente"
                    + "\n4.Exponencial"
                    + "\n5.Logaritmo neperiano");

            int opcion = Math.abs(entrada.nextInt());
            
            IEjercicio6 operacion;
            
            switch (opcion) {
                case 1:
                    operacion = Math::sin;
                    break;
                case 2:
                    operacion = Math::cos;
                    break;
                case 3:
                    operacion = Math::tan;
                    break;
                case 4:
                    operacion = Math::exp;
                    break;
                case 5:
                    operacion = Math::log;
                    break;
                default:
                    throw new AssertionError();
            }
            
            
            //llenar la lista
            List<Integer> listadoDeNumeros = llenarLista(numero);
            
            //Realizar la operacion - se puede ver que transformamos los valores en una lista de enteros a doubles
            List<Double> listadoDeNumeroFinal = listadoDeNumeros.stream().map((x) -> realizarOperacion(operacion, x)).collect(Collectors.toList());
            //Imprimir el resultado
            imprimirListados(listadoDeNumeros, listadoDeNumeroFinal);
            
            
        } catch (Exception e) {

            System.out.println("Error al intentar digitar un número");
        }

        System.out.println(numero);

    }
    
    
    public static List<Integer> llenarLista(int num){
        List<Integer> listaNumeros = new ArrayList<>();
        
        for(int i = 1; i<=num; i++){
            listaNumeros.add(i);
        }
        return listaNumeros;
    }
    
    
    public static double realizarOperacion(IEjercicio6 op, int num){
        return op.Operacion(num);
    }
    
    
    public static void imprimirListados(List<Integer> numeros, List<Double> numerosFinal){
        
        System.out.println("Los números tomados fueron");
        numeros.forEach((x) -> System.out.print(x + " "));
        
        System.out.println("\nLos números depues de la operación");
        numerosFinal.forEach((x) -> System.out.print(x + " "));
        
        
    }
}
