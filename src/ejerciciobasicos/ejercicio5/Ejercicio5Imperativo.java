
package ejerciciobasicos.ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    1.Crear lista de enteros *
    2.Quedarme solo con los pares.*
    3.Pasar cada número al cuadrado
    4.Mostrar cada cuadrado por pantalla
    5.Obtener la suma de todos los cuadrados
*/
public class Ejercicio5Imperativo {
    
    public static void main(String[] args) {
        
        Ejercicio5Imperativo app = new Ejercicio5Imperativo();
        //1.Crear lista de enteros *
        List<Integer> numeros = app.crearLista();
        System.out.println("Listados de números creados ------------------");
        app.mostrarLista(numeros);
        
        //2.Quedarme solo con los pares.*
        List<Integer> numerosPares = app.filtrarPares(numeros);
        System.out.println("Listado de los números pares ------------------");
        app.mostrarLista(numerosPares);
        
        //3.Pasar cada número al cuadrado
        List<Integer> numerosElevados = app.elevarAlCuadrado(numerosPares);
        System.out.println("Listado de los números elevados ------------------");
        app.mostrarLista(numerosElevados);
        
        //5.Obtener la suma de todos los cuadrados
        int valorSumaCuadrados = app.obtenerLaSumaDeLosCuadrado(numerosElevados);
        System.out.println("La suma de los números elevados es de: " + valorSumaCuadrados);
        
    }
    
    
    public List<Integer> crearLista(){
        
        List<Integer> listadoNumeros = Arrays.asList(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
        return listadoNumeros;
    }
    
    public List<Integer> filtrarPares(List<Integer> numeros){
        
        List<Integer> numerosPares = new ArrayList<>();
        
        for(int numero : numeros){
            if(numero%2 == 0){
                numerosPares.add(numero);
            }
        }
        
        return numerosPares;
    }
    
    public List<Integer> elevarAlCuadrado(List<Integer> numeros){
        
        List<Integer> numerosAlCuadrado = new ArrayList<>();
        for(int numero : numeros){
            numerosAlCuadrado.add((int) Math.pow(numero, 2));
        }
        
        return numerosAlCuadrado;
    }
    
    public int obtenerLaSumaDeLosCuadrado(List<Integer> numeros){
        
        int valor = 0;
        
        for(int numero : numeros){
            valor += numero; 
        }
        
        return valor;
    }
    
    
    public void mostrarLista(List<Integer> numeros){
        for(int numero : numeros){
            System.out.print(numero + " ");
        }
        System.out.println("");
    }
    
    
}
