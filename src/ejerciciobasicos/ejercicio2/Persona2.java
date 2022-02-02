
package ejerciciobasicos.ejercicio2;


public class Persona2 {
    
    private String nombre;
    private int edad;
    
    public Persona2(){}
    
    public Persona2(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona2{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
