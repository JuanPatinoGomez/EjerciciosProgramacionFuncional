
package ejerciciobasicos.ejercicio4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Ejercicio entrevista de trabajo del canal de youtube BettaTech
//Nos dan una cadena de texto y tenemos que sacar el número de veces que se repite esta palabra
public class Ejercicio4 {
    
    
    
    
    public static void main(String[] args) {
        Ejercicio4 app = new Ejercicio4();
        
        String texto = "Hola que tal, bienvenidos a bettatech. Si os esta gustando el vídeo, suscribiros y darle a la campanita para ver los nuevos videos que vaya subiendo!";
        
        //Depuración del texto
        String cadenaLimpia = texto.replaceAll("[!¡¿?.,]", "").toLowerCase();
        
        String [] listadoPalabras = cadenaLimpia.split(" ");
        
        //Crear diccionario con las palabras y las veces que se encuentra
        
        Map<String, Integer> diccionario = app.crearDiccionario(listadoPalabras);
        
        diccionario.forEach((k, v) -> System.out.println("La palabra: " + k + "||| aparece " + v + " veces"));
        
    }
    
    public Map<String, Integer> crearDiccionario(String[] listadoPalabras){
    
        Map<String, Integer> diccionario = new HashMap<>();
        
        Arrays.asList(listadoPalabras).forEach((String palabra) -> {
            
            if(diccionario.containsKey(palabra)){
                diccionario.computeIfPresent(palabra, (k, v) -> v + 1 );
            }else{
                diccionario.put(palabra, 1);
            }
        });
        
        
        return diccionario;
        
    }
    
    
}
