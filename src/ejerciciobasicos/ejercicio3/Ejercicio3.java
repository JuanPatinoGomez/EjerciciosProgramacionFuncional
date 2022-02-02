
package ejerciciobasicos.ejercicio3;

import java.util.HashMap;
import java.util.Map;

//Escribir una función que reciba una frase y devuelva un diccionario con las palabras que contiene y su longitud.

public class Ejercicio3 {
    
    private Map<String, Integer> diccionario = new HashMap<String, Integer>();
    
    
    public void llenarDiccionario(String frase){
    
        String [] listadoPalabras = frase.split(" ");
        
        for(String palabra : listadoPalabras){
            this.diccionario.putIfAbsent(palabra, palabra.length());
        }
    }
    
    public void imprimirDiccionario(){
        
        this.diccionario.forEach((k,v) -> System.out.println("La palabra: " + k + " | tiene " + v + " letras"));
    }
    
    public static void main(String[] args) {
        
        Ejercicio3 app = new Ejercicio3();
        app.llenarDiccionario("La felicidad no brota de la razón sino de la imaginación");
        app.imprimirDiccionario();
    }
    
}
