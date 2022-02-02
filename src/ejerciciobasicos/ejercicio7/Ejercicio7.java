
package ejerciciobasicos.ejercicio7;

//Función que muestra en pantalla el doble o un número elevado al cuadrado del valor que se le pasa como parámetro 
public class Ejercicio7 {
    
    
    public static void main(String[] args) {
        
        int numero = 8;
        
        //Usando una expresión lambda
        //int num = SuperFuncion.realizarOperacion(numero, (x) -> x * 2); //Devuelve el doble
        int num = SuperFuncion.realizarOperacion(numero, (x) -> x * x); //Devuelve el número al cuadrado
        
        //Usando una clases que implementa la interfaz
        //int num = SuperFuncion.realizarOperacion(numero, new ElDoble()); //Devuelve el doble
        //int num = SuperFuncion.realizarOperacion(numero, new ElevarAlCuadrado()); //Devuelve el número al cuadrado
        
        
        
        System.out.println("El valor: " + num);
    }
}
