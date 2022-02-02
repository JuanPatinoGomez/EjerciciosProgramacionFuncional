
package ejerciciobasicos.ejercicio1;


public class Ejercicio1 {
    
    /*Ejercicio que determina que número es mayor*/
    
    public static void main(String[] args) {
        
        //Solucion clase anónima -------------------------------
       /* IEjercicio1 solucion = new IEjercicio1() {
            @Override
            public int retornarMayor(int num1, int num2) {
                return Math.max(num1, num2);
            }
        };
        
        int numeroMayor = solucion.retornarMayor(5, 3);*/
       
       //Solución expresion lambda ------------------------------
       /*IEjercicio1 solucion = (int num1, int num2) -> Math.max(num1, num2);
       int numeroMayor = solucion.retornarMayor(3, 5);*/
       
       //Solucion Method references -----------------------------
       IEjercicio1 solucion = Math::max;
       int numeroMayor = solucion.retornarMayor(4, 9);
       
        
        System.out.println("El numero mayor es : " + numeroMayor);
        
    }
    
    
    
    
}
